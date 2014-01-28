package geoanalytique.controleur;
 
import geoanalytique.exception.ArgumentOperationException;
import geoanalytique.exception.IncorrectTypeOperationException;
import geoanalytique.exception.VisiteurException;
import geoanalytique.graphique.*;
import geoanalytique.gui.*;
import geoanalytique.model.*;
import geoanalytique.util.*;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.HierarchyBoundsListener;
import java.awt.event.HierarchyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


/**
 * Cette classe est le controleur/presenteur principale. Tous les evenements importants
 * emanant de l'interface graphique doivent passer par cette classe.
 * 
 * 
 *
 */
public class GeoAnalytiqueControleur implements ActionListener, MouseListener, HierarchyBoundsListener {

	private ArrayList<GeoObject> objs;
	private ViewPort viewport;
	private GeoAnalytiqueGUI view;
	
	private transient GeoObject select;
	private containerPropriete panelPropriete;
	
	private CreeGeoObject creeGeoObject;
      
		
	/**
	 * Constructeur de base afin de créer le lien entre la vue passee en
         * argument et le gestionnaire d'evenement.
         * @param view reference l'interface graphique dont le controleur sera le
         * gestionnaire d'evenement.
	 */
	public GeoAnalytiqueControleur(GeoAnalytiqueGUI view) {
		objs = new ArrayList<GeoObject>();
		this.view = view;
		viewport = new ViewPort(view.getCanvas().getWidth(),view.getCanvas().getHeight());
		System.out.println("largeur "+view.getCanvas().getWidth()+" hauteur "+view.getCanvas().getHeight());
		
		
		
		// TODO: A completer avec vos modifications
		panelPropriete=new containerPropriete();
		this.creeGeoObject=new CreeGeoObject(this);
		
		this.view.getCanvas().addMouseListener(this);
		this.view.getBtnCarre().addActionListener(this);
		this.view.getBtnTriangle().addActionListener(this);
		this.view.getBtnCercle().addActionListener(this);
		this.view.getBtnElipse().addActionListener(this);
		this.view.getBtnSegment().addActionListener(this);
		this.view.getBtnRectangle().addActionListener(this);
		this.panelPropriete.validerBtn.addActionListener(this);
		this.view.getBtnZomPlus().addActionListener(this);
		this.view.getBtnZomMoin().addActionListener(this);
		
		
	}

        /**
         * Cette fonction prend en charge l'ajout dans le système d'un nouvel
         * objet geometrique. On pourra en particulier, mettre a jour la vue
         * et la liste des operations realisable sur l'application. 
         * D'autre taches pourront etre realisees si besoin est.
         * @param obj objet geometrique a ajouter dans le systeme
         */
	public void addObjet(GeoObject obj) {
            objs.add(obj);
            recalculPoints();	
            // TODO: a completer
	}
	
	public  void zoom(int x){
		this.view.getCanvas().clear();
		this.view.repaint();
		this.viewport.resize(viewport.getLargeur()+x,viewport.getHauteur()+x);
		
		recalculPoints();
	}
	/**
         * Cette fonction est appele par le modele pour prevenir le controleur
         * d'une mise a jour de l'objet geometrique passe en argument. Le 
         * controleur peut donc mettre a jour les informations de la vue, si 
         * c'est necessaire.
         * @param object objet ayant subit une modification
         */
	public void update(GeoObject object) {
		// TODO: a completer
		/*objs.remove(object);
		objs.add();
		recalculPoints();*/
		
	}


	public void actionPerformed(ActionEvent e) {
		// TODO: a completer
		if (e.getSource()==this.view.getBtnZomPlus()){
			this.zoom(+30);
		}else
		if (e.getSource()==this.view.getBtnZomMoin()){
			this.zoom(-30);
		}else
		if (e.getSource()==this.view.getBtnCarre()){
			this.cadresaisir("carre");
		}else
		if(e.getSource()==this.view.getBtnTriangle()){
			this.cadresaisir("triangle");
		}else
		if(e.getSource()==this.view.getBtnCercle()){
			this.cadresaisir("cercle");
		}else if(e.getSource()==this.view.getBtnElipse()){
			this.cadresaisir("elipse");
		}else if(e.getSource()==this.view.getBtnSegment()){
			this.cadresaisir("segment");
		}else if(e.getSource()==this.view.getBtnRectangle()){
			this.cadresaisir("rectangle");
		}
	    
		if(e.getSource()==this.panelPropriete.validerBtn){
			if(this.panelPropriete.jtableChamp.getModel().getRowCount()==5){
				if(this.panelPropriete.jtableChamp.getModel().getValueAt(1,0)=="Centre x/y"){
					
				}
				this.addObjet(new Carre("carre",this.creeGeoObject.creeFigure(panelPropriete),this));
			}
	    	//System.out.println(this.panelPropriete.jtableChamp.getModel().getValueAt(1,1));
	    	System.out.println(this.panelPropriete.jtableChamp.getModel().getRowCount());
	    	if(this.panelPropriete.jtableChamp.getModel().getRowCount()==4){
	    		if(this.panelPropriete.jtableChamp.getModel().getValueAt(1,0)=="Centre x/y" ){
		    		ArrayList<Point> d=this.creeGeoObject.creeFigure(panelPropriete);
					this.addObjet(new Ellipse("ellipse",d.get(0),d.get(1),d.get(2),this));
		    	}else
				this.addObjet(new Triangle("triangle",this.creeGeoObject.creeFigure(panelPropriete),this));
			}
	    	
	    	if(this.panelPropriete.jtableChamp.getModel().getRowCount()==3){
	    		ArrayList<Point> d=this.creeGeoObject.creeFigure(panelPropriete);
	    		if(this.panelPropriete.jtableChamp.getModel().getValueAt(1,0)=="extremite1 x/y" ){
					this.addObjet(new Segment(d.get(0),d.get(1),this));
		    	}else
				this.addObjet(new Cercle("cercle",d.get(0),d.get(1),this));
				System.out.println(""+d.get(0).getX());
			}
	    } 
		this.view.getPanelPropriete().setVisible(true);
		}
	

	public void mouseClicked(MouseEvent e) {
            // a priori inutile
            // mais customisable si necessaire
		Point p=this.viewport.convert(e.getX(),e.getY());
		//this.addObjet(p);
		this.panelPropriete.data[1][1]=""+p.getX()+","+p.getY();
		this.panelPropriete.jtableChamp.getModel().setValueAt(""+p.getX()+","+p.getY(),1,1);
		p=null;
		
	}
	

	public void mouseReleased(MouseEvent e) {
            // a priori inutile
            // mais customisable si necessaire
	}

	public void mouseEntered(MouseEvent e) {
            // a priori inutile
            // mais customisable si necessaire
	}

	public void mouseExited(MouseEvent e) {
            // a priori inutile
            // mais customisable si necessaire
	}

	public void mousePressed(MouseEvent e) {
            // TODO: a completer pour un clique souris dans le canevas
	}

        /**
         * Cette fonction permet de realiser toutes les taches inherante a la
         * selection d'un objet geometrique dans la vue. Cette fonction est tres
         * utile pour marquer l'objet selectionne de maniere plus significative.
         * 
         * @param o objet a selectionne
         */
	private void selectionner(GeoObject o) {
		// TODO: a completer
	}
	
	/**
         * Operation permettant de deselectionner le dernier objet selectionne
         * (si il existe). On pourra enlever tous marqueurs present sur l'interface
         * graphique a ce moment ainsi que les operations anciennement realisable.
         */	
	private void deselectionner() {
		// TODO: a completer
	}
	


        /**
         * Cette fonction est appele uniquement lorsque la liaison controleur et
         * interface graphique a ete realisee. Elle permet de realiser certaines
         * taches necessaires a ce moment. Comme par exemple ajouter un listener
         * aux boutons etc.
         */
	public void prepareTout() {
            // Preparation des evenements du canevas
            view.getCanvas().addMouseListener(this);
            view.getCanvas().addHierarchyBoundsListener(this);
            
            // TODO: a completer si necessaire
            
            
	}

	public void ancestorMoved(HierarchyEvent e) {
            // a priori inutile
            // mais customisable si necessaire
	}

	public void ancestorResized(HierarchyEvent e) {
	    // TODO: a completer si le canevas est redimentionnable
	}

        /**
         * Cette fonction est la fonction permettant de caracteriser le presenteur.
         * Elle realise la presentation des donnees en indiquant a la vue les
         * element graphique devant etre affiche en fonction de la zone d'affichage
         * (Viewport).
         */
	private void recalculPoints() {
		
            // on nettoie les anciennes images
            view.getCanvas().clear();
            // redessine toutes les figures
            Dessinateur d = new Dessinateur(viewport);
            Point p=new Point(0,0,this);
            Droite droite=new Droite(p,90,this);
            Droite droite2=new Droite(p,0,this);
            for (GeoObject o : objs) {
            	Graphique c;
		try {
			d.visitDroite(droite).setCouleur(Color.red);
			d.visitDroite(droite2).setCouleur(Color.red);
			
			view.getCanvas().addGraphique(d.visitDroite(droite));
			view.getCanvas().addGraphique(d.visitDroite(droite2));
			
                    c = o.visitor(d);
                    view.getCanvas().addGraphique(c);
                } catch (VisiteurException e) {
                    e.printStackTrace();
                }
            }
            
            view.getCanvas().repaint();
            // TODO: a completer
            
	}

	
        /**
         * Cette fonction permet de lancer une operation sur un objet. A priori
         * Elle n'a pas a etre modifiee dans un premier temps. Sauf si vous voulez
         * modifier le comportement de celle-ci en donnant un aspect plus jolie.
         * @param object objet sur lequel realise l'operation
         * @param ope operation devant etre realise sur l'objet <i>object</i>
         */
	public void lanceOperation(GeoObject object, Operation ope) {
            // TODO: a modifier si vous avez compris comment la fonction
            // procedais. Sinon laissez telle quel
		for(int i=0; i < ope.getArite();i++) {
			try {
				String res = JOptionPane.showInputDialog(view, ope.getDescriptionArgument(i), ope.getTitle(),JOptionPane.QUESTION_MESSAGE);
				if(res == null)
					return;
				if(ope.getClassArgument(i) == Double.class) {
					ope.setArgument(i, new Double(res));
				}
				else if(ope.getClassArgument(i) == Integer.class) {
					ope.setArgument(i, new Integer(res));
				}
				else if(ope.getClassArgument(i) == Character.class) {
					ope.setArgument(i, new Character(res.charAt(0)));
				}
				else if(ope.getClassArgument(i) == String.class) {
					ope.setArgument(i, new String(res));
				}
				else if(GeoObject.class.isAssignableFrom(ope.getClassArgument(i))) {
					ope.setArgument(i, searchObject(res));
				}
				else {
                                    JOptionPane.showMessageDialog(view, "Classe de l'argument non supporte", "Erreur dans le lancement de l'operation", JOptionPane.ERROR_MESSAGE);
       				    return;
				}
			} catch (HeadlessException e) {
				e.printStackTrace();
			} catch (ArgumentOperationException e) {
				e.printStackTrace();
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IncorrectTypeOperationException e) {
				e.printStackTrace();
			}
		}
                // Dans notre application on autorise un resultat, que nous devons
                // interprété. Pas de resultat correspond au pointeur null
		Object o = ope.calculer();
		if(o != null) {
                       // on a bien trouve un resultat. Mais on ne connait pas
                       // sa nature on va donc le tester
			if(GeoObject.class.isAssignableFrom(o.getClass())) {
                            // c'est un objet analytique on l'ajoute dans notre systeme
				addObjet((GeoObject) o);
			}
			else {
                            // on ne connait pas le type, donc on l'avise a l'utilisateur
				JOptionPane.showConfirmDialog(view, o, ope.getTitle(),JOptionPane.OK_OPTION);
			}
                        // TODO BONUS: proposer et modifier le traitement du resultat
                        // pour pouvoir renvoyer plusieurs chose en meme temps
		}
		recalculPoints();
	}
	
        /**
         * Cette fonction permet de retrouver un objet dans la liste des objets
         * geometrique a partir de son nom (que l'on supposera unique). Si le nom
         * de l'objet est un introuvable on leve l'exception ArgumentOperationException.
         * Cette fonction est utilisee dans le calcul d'une operation.
         * @param x nom de l'objet a rechercher
         * @return Renvoie l'objet ayant pour nom x, sinon leve une exception
         * @throws geoanalytique.exception.ArgumentOperationException
         */
	private Object searchObject(String x) throws ArgumentOperationException {
		for (GeoObject o : objs) {
			if(o.getName().equals(x))
				return o;
		}
		throw new ArgumentOperationException("Nom de l'objet introuvable");
	}
	
	private void placertablePropriete(JPanel panelPropriete){
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this.view.getPanelgauchePro());
		this.view.getPanelgauchePro().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPropriete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPropriete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );
	}
	
	private void cadresaisir(String figure){
		this.view.getPanelPropriete().setVisible(false);
		JTable champ= new JTable();
		panelPropriete.jtableChamp=champ;
		creeGeoObject.donneeJtable(figure);
		
		panelPropriete.jtableChamp.setModel(new DefaultTableModel(this.creeGeoObject.data,this.creeGeoObject.tilte));
		panelPropriete.jscrolChamp.setViewportView(panelPropriete.jtableChamp);
		this.placertablePropriete(panelPropriete);
	}
	
	
}

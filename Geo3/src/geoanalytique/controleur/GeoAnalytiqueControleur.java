package geoanalytique.controleur;
 
import geoanalytique.exception.ArgumentOperationException;
import geoanalytique.exception.IncorrectTypeOperationException;
import geoanalytique.exception.VisiteurException;
import geoanalytique.graphique.*;
import geoanalytique.gui.*;
import geoanalytique.model.*;
import geoanalytique.model.geoobject.operation.MedianeOperation;
import geoanalytique.model.geoobject.operation.MediatriceOperation;
import geoanalytique.util.*;
import geoanalytique.view.GeoAnalytiqueView;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.HierarchyBoundsListener;
import java.awt.event.HierarchyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
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
public class GeoAnalytiqueControleur implements ActionListener, MouseListener, HierarchyBoundsListener ,MouseMotionListener {

	private ArrayList<GeoObject> objs;
	private ArrayList<OperationControleur> opControleur;
	private ViewPort viewport;
	private GeoAnalytiqueGUI view;
	
	public transient GeoObject select;
	private containerPropriete panelPropriete;
	
	private CreeGeoObject creeGeoObject;
	private GeoObject save;
	private Point mouseCl;

      
		
	/**
	 * Constructeur de base afin de créer le lien entre la vue passee en
         * argument et le gestionnaire d'evenement.
         * @param view reference l'interface graphique dont le controleur sera le
         * gestionnaire d'evenement.
	 */
	public GeoAnalytiqueControleur(GeoAnalytiqueGUI view) {
		objs = new ArrayList<GeoObject>();
		this.view = view;
		opControleur=new ArrayList<OperationControleur>();
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
		this.view.getOperationJMenuItem().getItemRemove().addActionListener(this);
		this.view.getCanvas().addMouseMotionListener(this);
		this.view.getItemInit().addActionListener(this);
		
		
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
            this.view.getCanvas().clear();
    		this.view.repaint();
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
		
		if(this.objs.contains(object)==true){
			this.view.getCanvas().clear();
			this.view.repaint();
			recalculPoints();
		}
		
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
			if(e.getSource()==this.view.getItemInit()){
					this.objs=new ArrayList<GeoObject>();
					this.recalculPoints();
			}else
		if(e.getSource()==this.view.getBtnTriangle()){
			this.cadresaisir("triangle");
		}else
		if(e.getSource()==this.view.getBtnCercle()){
			this.cadresaisir("cercle");
		}else if(e.getSource()==this.view.getBtnElipse()){
			this.cadresaisir("ellipse");
		}else if(e.getSource()==this.view.getBtnSegment()){
			this.cadresaisir("segment");
		}else if(e.getSource()==this.view.getBtnRectangle()){
			this.cadresaisir("rectangle");
			//action sur le btn remove
		}else if(e.getSource()==this.view.getOperationJMenuItem().getItemRemove()){
			this.ecrireConsole(" remove "+e.getSource()+"\n"+this.save);
			this.deselectionner();
		}
	    
		if(e.getSource()==this.panelPropriete.validerBtn){
			String name=(String) this.panelPropriete.jtableChamp.getModel().getValueAt(0,1);
			if(this.panelPropriete.jtableChamp.getColumnName(0)=="carre"){				
				this.addObjet(new Carre(name,this.creeGeoObject.creeFigure(panelPropriete),this));
			}else 
				if(this.panelPropriete.jtableChamp.getColumnName(0)=="rectangle"){
				this.addObjet(new Rectangle(name,this.creeGeoObject.creeFigure(panelPropriete),this));
			}else 
				if(this.panelPropriete.jtableChamp.getColumnName(0)=="cercle"){
				ArrayList<Point> d=this.creeGeoObject.creeFigure(panelPropriete);
				this.addObjet(new Cercle(name,d.get(0),d.get(1),this));
			}else 
				if(this.panelPropriete.jtableChamp.getColumnName(0)=="ellipse"){
				ArrayList<Point> d=this.creeGeoObject.creeFigure(panelPropriete);
				this.addObjet(new Ellipse(name,d.get(0),d.get(1),d.get(2),this));
			}else 
				if(this.panelPropriete.jtableChamp.getColumnName(0)=="triangle"){
				this.addObjet(new Triangle(name,this.creeGeoObject.creeFigure(panelPropriete),this));
			}else 
				if(this.panelPropriete.jtableChamp.getColumnName(0)=="segment"){
					ArrayList<Point> d=this.creeGeoObject.creeFigure(panelPropriete);
					this.addObjet(new Segment(d.get(0),d.get(1),this));
			}else 
				if(this.panelPropriete.jtableChamp.getColumnName(0)=="point"){
					ArrayList<Point> d=this.creeGeoObject.creeFigure(panelPropriete);
					this.addObjet(new Point(name,d.get(0).getX(),d.get(0).getY(),this));
			}
	    	
	    }
		this.view.getCanvas().clear();
		this.view.repaint();
		recalculPoints();
		this.view.getPanelPropriete().setVisible(true);
		}
	

	public void mouseClicked(MouseEvent e) {
            // a priori inutile
            // mais customisable si necessaire
		this.select=this.selectOb(e);
		/*this.mouseCl=this.viewport.convert(e.getX(),e.getY());
		this.mouseCl.setX( (Math.round(this.mouseCl.getX()*Math.pow(10,1)) )/ (Math.pow(10,1)) );
		this.mouseCl.setY( (Math.round(this.mouseCl.getY()*Math.pow(10,1)) )/ (Math.pow(10,1)) );
		*/
		
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
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		Point p=this.viewport.convert(e.getX(),e.getY());
		p.setX( (Math.round(p.getX()*Math.pow(10,1)) )/ (Math.pow(10,1)) );
		p.setY( (Math.round(p.getY()*Math.pow(10,1)) )/ (Math.pow(10,1)) );
		this.ecrireConsole("vale "+p.getX());
		if(this.select instanceof Point ){
			for(GeoObject o:this.objs ){
				if(o==this.select){
					o.deplacer(p.getX(),p.getY());
					this.update(select);
					
				}
				
				if(o!=this.select){
					o.update();
				}
					
			}
		}
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent e) {
		this.select=this.selectOb(e);
		this.selectionner(this.select);
		maybeShowPopup(e);
            // TODO: a completer pour un clique souris dans le canevas
	}

        /**
         * Cette fonction permet de realiser toutes les taches inherante a la
         * selection d'un objet geometrique dans la vue. Cette fonction est tres
         * utile pour marquer l'objet selectionne de maniere plus significative.
         * 
         * @param obj objet a selectionne
         */
	private void selectionner(GeoObject obj) {
		// TODO: a completer
		//this.ecrireConsole(""+obj.getOperations());
		
		if(obj!=null){
			
			
			for(Operation op: obj.getOperations()){
				if(op instanceof MediatriceOperation && obj instanceof Segment){
					OperationControleur p=new OperationControleur(obj,op,this);
					this.view.getOperationJMenuItem().getItemMediatrice().addActionListener(p);
					if(this.opControleur.contains(p)==false && this.opControleur!=null)
						this.opControleur.add(p);
				}else	
				if(op instanceof MedianeOperation && obj instanceof Triangle){
					OperationControleur p=new OperationControleur(obj,op,this);
					this.view.getOperationJMenuItem().getItemMediane().addActionListener(p);
					if(this.opControleur.contains(p)==false && this.opControleur!=null)
						this.opControleur.add(p);
				}
				
			}
		}
	}
	
	private void maybeShowPopup(MouseEvent e) {
		this.view.setPopupMenu(new JPopupMenu());
		if (e.isPopupTrigger()) {
			if(this.select instanceof Segment){
				//this.view.getOperationJMenuItem().getItemMediatrice().addActionListener(this.);
				this.view.getPopupMenu().add(this.view.getOperationJMenuItem().getItemMediatrice());
				this.view.getPopupMenu().add(this.view.getOperationJMenuItem().getItemDeplacer());
				this.view.getPopupMenu().add(this.view.getOperationJMenuItem().getItemRemove());
			}else if(this.select instanceof Cercle){
				this.view.getPopupMenu().add(this.view.getOperationJMenuItem().getItemRemove());
			}else if(this.select instanceof Ellipse){
				this.view.getPopupMenu().add(this.view.getOperationJMenuItem().getItemRemove());
			}else if(this.select instanceof Triangle){
				this.view.getPopupMenu().add(this.view.getOperationJMenuItem().getItemRemove());
				this.view.getPopupMenu().add(this.view.getOperationJMenuItem().getItemMediane());
			}else if(this.select instanceof Carre){
				this.view.getPopupMenu().add(this.view.getOperationJMenuItem().getItemRemove());
			}else if(this.select instanceof Rectangle){
				this.view.getPopupMenu().add(this.view.getOperationJMenuItem().getItemRemove());
			
			}else if(this.select instanceof Droite){
				this.view.getPopupMenu().add(this.view.getOperationJMenuItem().getItemRemove());
			}
			
		this.view.getPopupMenu().show(e.getComponent(),e.getX(), e.getY());
		}
	} 
	private GeoObject selectOb(MouseEvent e){
		Point p=this.viewport.convert(e.getX(),e.getY());
		p.setX( (Math.round(p.getX()*Math.pow(10,1)) )/ (Math.pow(10,1)) );
		p.setY( (Math.round(p.getY()*Math.pow(10,1)) )/ (Math.pow(10,1)) );
		this.ecrireConsole("la souris pointe sur P:"+p.getX()+"/"+p.getY());
		for(GeoObject ob: this.objs){
			this.ecrireConsole(" arrondi"+p.getX());
				if(ob instanceof Segment){
					Segment s=(Segment)(ob);
					this.ecrirePropriete("Nom figure: "+s.getName()+
					"\n"+"Longueur ="+s.getLong()
							);
					if(s.contient(p)){
						this.ecrireConsole("un  segment selectionne");
						return s;
					}
				}else
			if(ob instanceof Point){
				Point pnt=(Point)(ob);
				this.ecrirePropriete("Nom figure: "+pnt.getName()+
						"\n"+"position x ="+pnt.getX()+"\n"+
						"position Y ="+pnt.getY()
								);
				if(pnt.contient(p)){
					this.ecrireConsole("un  Point selectionne");
					return pnt;
				}
			}
			if(ob instanceof Droite){
				Droite d=(Droite)(ob);
				this.ecrirePropriete("Nom figure: "+d.getName()+
						"\n"+"La pente ="+d.pente+"\n"
								);
				if(d.contient(p)){
					this.ecrireConsole("une droite selectionne");
					return d;
				}
			}else if(ob instanceof Carre){
				Carre c=(Carre)(ob);
				this.ecrirePropriete("Nom figure: "+c.getName()+
						"\n"+"L Aire ="+c.calculerAire()+"\n"+
						"Perimetre ="+c.perimetre
								);
				if(c.contient(p)){
					this.ecrireConsole("un carre selectionne");
					return c;
				}
			}else if(ob instanceof Rectangle){
				Rectangle c=(Rectangle)(ob);
				this.ecrirePropriete("Nom figure: "+c.getName()+
						"\n"+"L Aire ="+c.calculerAire()+"\n"+
						"Perimetre ="+c.perimetre
								);
				if(c.contient(p)){
					this.ecrireConsole("un Rectangle selectionne");
					return c;
				}
			}else if(ob instanceof Cercle){
				Cercle c=(Cercle)(ob);
				if(c.contient(p)){
					this.ecrireConsole("un Cercle selectionne");
					return c;
				}
			}else if(ob instanceof Ellipse){
				Ellipse c=(Ellipse)(ob);
				if(c.contient(p)){
					this.ecrireConsole("un Ellipse selectionne");
					return c;
				}
			}else if(ob instanceof Triangle){
				Triangle c=(Triangle)(ob);
				this.ecrirePropriete("Nom figure: "+c.getName()+
						"\n"+"L Aire ="+c.calculerAire()+"\n"+
						"Perimetre ="+c.perimetre
								);
				if(c.contient(p)){
					this.ecrireConsole("un triangle selectionne");
					return c;
				}
			}
		}
		return null;
	}
	/**
         * Operation permettant de deselectionner le dernier objet selectionne
         * (si il existe). On pourra enlever tous marqueurs present sur l'interface
         * graphique a ce moment ainsi que les operations anciennement realisable.
         */	
	private void deselectionner() {
		// TODO: a completer
		GeoObject save=null;

		this.ecrireConsole(" object selectionne :"+this.select+"\n");
		if(this.select !=null){
					save=this.select;
					if(save instanceof Segment){
						save=(Segment)save;
						this.objs.remove(((Segment) save).getP1());
						this.objs.remove(((Segment) save).getP2());
					}
					else if(save instanceof Carre){
						save=(Carre)save;
						for(Point p:((Carre) save).getControles()){
							this.objs.remove(p);
						}
					}else if(save instanceof Rectangle){
						save=(Rectangle)save;
						for(Point p: (((Polygone) save).getControles())){
							this.objs.remove(p);
						}
					}else if(save instanceof Triangle){
						save=(Triangle)save;
						for(Point p: (((Polygone) save).getControles())){
							this.objs.remove(p);
						}
					}else if(save instanceof Cercle){
						save=(Cercle)save;
						this.objs.remove(((Cercle) save).getP1());
						this.objs.remove(((Cercle) save).getCentre());
					}
					else if(save instanceof Ellipse){
						save=(Ellipse)save;
						this.objs.remove(((Ellipse) save).getP1());
						this.objs.remove(((Ellipse) save).getP2());
						this.objs.remove(((Ellipse) save).getCentre());
					}
					//forcer la suppression
					ArrayList<GeoObject>ob = new ArrayList<GeoObject>();
					for(int i=0;i<this.objs.size();i++){
						if(this.objs.get(i)!=select){
							ob.add(this.objs.get(i));
						}
					}
					this.objs=ob;
						this.ecrireConsole("SUPPRESSION realise avec succes");
					
		}
		if(save.getOperations().isEmpty()==false){
			save.getOperations().clear();
		}
		this.select=null;
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
            
            try {
				d.visitDroite(droite).setCouleur(Color.red);
				d.visitDroite(droite2).setCouleur(Color.red);
				
				view.getCanvas().addGraphique(d.visitDroite(droite));
				view.getCanvas().addGraphique(d.visitDroite(droite2));
			} catch (VisiteurException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
            for (GeoObject o : objs) {
            	Graphique c;
		try {
			
			this.repere(view.getCanvas(), d);
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
		if(ope instanceof MediatriceOperation || ope instanceof MedianeOperation){
			if(ope instanceof MedianeOperation){
				try{
					
					String res = JOptionPane.showInputDialog(view, ope.getDescriptionArgument(0), ope.getTitle(),JOptionPane.QUESTION_MESSAGE);
					int i=Integer.parseInt(res);
					ope.setArgument(i,new Integer(i));
					this.ecrireConsole(" tracer mediane du segement :"+new Integer(res));
					
				}catch(Exception e){
					
				}
			}
		}else{
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
		}
		
                // Dans notre application on autorise un resultat, que nous devons
                // interprété. Pas de resultat correspond au pointeur null
		Object o = ope.calculer();
		
		if(o != null) {
                       // on a bien trouve un resultat. Mais on ne connait pas
                       // sa nature on va donc le tester
			if(GeoObject.class.isAssignableFrom(o.getClass())) {
                            // c'est un objet analytique on l'ajoute dans notre systeme
				//this.save=(GeoObject)o;
				this.addObjet((GeoObject) o);
				//this.addObjet(this.save);
				//this.objs.add(save);
				//this.ecrireConsole("controleur Media: "+((GeoObject) o).getControleur()+" moi: "+this);
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
	
	private void repere(GeoAnalytiqueView view,Dessinateur d){
		for(int i=-10;i<=9;i++){
			Point p1=new Point(-0.2,i,this);
			Point p2=new Point(0.2,i,this);
			
			Point p11=new Point(i,-0.2,this);
			Point p22=new Point(i,0.2,this);
			try {
			view.addGraphique(d.visitSegment(new Segment(p1,p2,this)));		
			view.addGraphique(d.visitSegment(new Segment(p11,p22,this)));	
			} catch (VisiteurException e1) {
					// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
		}
	}
	
	//ecrire dans la console
	public void ecrireConsole(String s){
		this.view.getTextareaConsole().setText(this.view.getTextareaConsole().getText()+"\n"+s);
	}
	
	public void ecrirePropriete(String s){
		String t="La liste des proprietes de la figure :\n";
		this.view.getTextarePropriete().setText(t+s+"\n");
	}
	
	
	
}

package geoanalytique;
 
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;

import geoanalytique.controleur.GeoAnalytiqueControleur;
import geoanalytique.gui.GeoAnalytiqueGUI;
import geoanalytique.model.*;
import geoanalytique.model.geoobject.operation.MedianeOperation;
import geoanalytique.model.geoobject.operation.MediatriceOperation;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;

/**lol de bobdi
 * Classe de lancement principale de l'application.
 * Vous pouvez modifier comme vous voulez ce lanceur minimale.
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
  
	public static void main(String[] args) {
    	GeoAnalytiqueGUI panel = new GeoAnalytiqueGUI();
    	JPanel pan=new JPanel(new BorderLayout());
    	
    	JFrame frame = new JFrame("GeoAnalytique - version 0.01");

    	// example du prof
    	//frame.add(panel);
    	frame.getContentPane().add(panel, java.awt.BorderLayout.CENTER);
    
    	frame.setSize(1024,778);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	frame.setJMenuBar(panel.menuBar);
    	frame.pack();
    	//frame.setVisible(true);
    	

    	
    	
    	GeoAnalytiqueControleur controleur = new GeoAnalytiqueControleur(panel);
    	controleur.prepareTout();
    	//frame.PanelGraphiq.add(panel);
        // Petit exemple
        //controleur.addObjet(new Point("Ori",0,0, controleur));
        Point c=new Point("Ori", 6,6, controleur);
        Point p=new Point("Ori",0,-1, controleur);
        Point p2=new Point("Ori",-1,1, controleur);
        Cercle e=new Cercle(c,p,controleur);
        Segment s=new Segment(p,p2,controleur);
        Droite mil=(Droite) (new MediatriceOperation(1,s)).calculer();
        
        ArrayList<Point> ct=new ArrayList<Point>();
        ct.add(new Point(2,6,controleur));
        ct.add(new Point(4,6,controleur));
        ct.add(new Point(4,4,controleur));
        ct.add(new Point(2,4,controleur));
        
        controleur.addObjet(new Point(4,4,controleur));
        controleur.addObjet(new Point(4,6,controleur));
        /*
        ct.add(new Point(2,2,controleur));
        ct.add(new Point(5,5,controleur));
        ct.add(new Point(2,3,controleur));
       */
        //Polygone PP=new Carre(ct,controleur);
        //Polygone PP=new Rectangle(ct,controleur);
        Polygone PP=new Triangle(ct,controleur);
        Droite mediane =(Droite)(new MedianeOperation(3,PP)).calculer();
        //Segment mediane =(Segment)(new MedianeOperation(3,PP)).calculer();
        
        controleur.addObjet(mediane);
        controleur.addObjet(PP);
        //controleur.lanceOperation(s,new MediatriceOperation(2,s));
       // controleur.addObjet(s);
       // controleur.addObjet(mil);
        System.out.println(" la pente"+mil.pente);
        controleur.addObjet(p);
        controleur.addObjet(p2);
        
    	
    	frame.setVisible(true);
    	
    }

}

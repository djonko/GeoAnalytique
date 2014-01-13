package geoanalytique;
 
import java.awt.Color;

import geoanalytique.controleur.GeoAnalytiqueControleur;
import geoanalytique.gui.GeoAnalytiqueGUI;
import geoanalytique.model.*;
import geoanalytique.model.geoobject.operation.MediatriceOperation;

import javax.swing.JFrame;

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
    	
    	JFrame frame = new JFrame("GeoAnalytique - version 0.01");
    
    	frame.setContentPane(panel);
    	
    	//frame.getContentPane().add(panel);
    	frame.setSize(800, 800);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	Menu menu=new Menu();
    	frame.setJMenuBar(menu.setMenu());
    	//frame.pack();
    	
    	
    	GeoAnalytiqueControleur controleur = new GeoAnalytiqueControleur(panel);
    	controleur.prepareTout();
        
        // Petit exemple
        //controleur.addObjet(new Point("Ori",0,0, controleur));
        Point c=new Point("Ori", 6,6, controleur);
        Point p=new Point("Ori",0,-1, controleur);
        Point p2=new Point("Ori",-1,1, controleur);
        Cercle e=new Cercle(c,p,controleur);
        Segment s=new Segment(p,p2,controleur);
        Droite mil=(Droite) (new MediatriceOperation(1,s)).calculer();
        controleur.addObjet(s);
        controleur.addObjet(mil);
        System.out.println(" la pente"+mil.pente);
        controleur.addObjet(p);
        controleur.addObjet(p2);
        
    	
    	frame.setVisible(true);
    	
    }

}

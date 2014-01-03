package geoanalytique;
 
import geoanalytique.controleur.GeoAnalytiqueControleur;
import geoanalytique.gui.GeoAnalytiqueGUI;
import geoanalytique.model.Point;
import geoanalytique.model.Segment;

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
    	frame.getContentPane().add(panel);
    	frame.setSize(800, 600);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.pack();
    	
    	GeoAnalytiqueControleur controleur = new GeoAnalytiqueControleur(panel);
    	controleur.prepareTout();
        
        // Petit exemple
        controleur.addObjet(new Point("Ori", 0,0, controleur));
        Point p1=new Point(4,3,controleur);
        Point p2=new Point(2,2,controleur);
        controleur.addObjet(p1);
    	
    	frame.setVisible(true);
    	
    }

}

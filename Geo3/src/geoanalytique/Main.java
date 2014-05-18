package geoanalytique;
 




import geoanalytique.controleur.GeoAnalytiqueControleur;
import geoanalytique.gui.GeoAnalytiqueGUI;
import geoanalytique.model.*;


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

    	// example du prof
    	//frame.add(panel);
    	frame.getContentPane().add(panel, java.awt.BorderLayout.CENTER);
    
    	frame.setSize(800,778);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	frame.setJMenuBar(panel.menuBar);
    	frame.pack();
    	//frame.setVisible(true);
    	

    	
    	
    	GeoAnalytiqueControleur controleur = new GeoAnalytiqueControleur(panel);
    	controleur.prepareTout();
    	
    	
        
    	Point p=new Point("Ori",4,4, controleur);
    	controleur.addObjet(p);
    	/*
    	Point p=new Point("Ori",4,4, controleur);
        Point p2=new Point("Ori",4,7, controleur);
        
        Point p22=new Point((p2.getY()-p.getY())+p.getX(),p.getY(),controleur);
        System.out.println(p22.getY()+"voila");
        controleur.addObjet(p22);
        Segment s=new Segment(p,p2,controleur);
        Cercle cl=new Cercle(p,p2,controleur);
        Droite mil=(Droite) (new MediatriceOperation(1,s)).calculer();
        controleur.addObjet(cl);
        ArrayList<Point> ct=new ArrayList<Point>();
        ct.add(new Point(2,6,controleur));
        ct.add(new Point(4,6,controleur));
        ct.add(new Point(4,4,controleur));
        ct.add(new Point(2,4,controleur));
        
        controleur.addObjet(new Point(4,4,controleur));
        controleur.addObjet(new Point(4,6,controleur));
      
        ct.add(new Point(2,2,controleur));
        ct.add(new Point(5,5,controleur));
        ct.add(new Point(2,3,controleur));
      
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
        
        
        //pour un segment
        Point p=new Point("Ori",2,2, controleur);
        Point p2=new Point("Ori",4,6, controleur);
        Segment s=new Segment(p,p2,controleur);
        Droite mil=(Droite) (new MediatriceOperation(s)).calculer();
        controleur.addObjet(s);
        controleur.addObjet(mil);
        
        //pour triangle
           ArrayList<Point> ct=new ArrayList<Point>();
        ct.add(new Point(2,2,controleur));
        ct.add(new Point(2,6,controleur));
        ct.add(new Point(6,6,controleur));
        
        Polygone PP=new Triangle(ct,controleur);
        Droite mediane =(Droite)(new MedianeOperation(3,PP)).calculer();
        controleur.addObjet(PP);
        controleur.addObjet(mediane);
         
        */
    	
    	frame.setVisible(true);

    }

}

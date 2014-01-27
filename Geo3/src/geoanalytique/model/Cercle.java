package geoanalytique.model;
 
import geoanalytique.controleur.GeoAnalytiqueControleur;
import geoanalytique.exception.VisiteurException;
import geoanalytique.util.GeoObjectVisitor;

/**
 * Modele mathematique pour les cercles.
 * 
 */
public class Cercle extends Ellipse {
	
	public Cercle(Point c,Point p1,GeoAnalytiqueControleur controleur){
		super(c,p1,new Point((p1.getY()-c.getY())+c.getX(),c.getY(),controleur),controleur);
		
		
	}
	public Cercle(String Name,Point c,Point p1,GeoAnalytiqueControleur controleur){
		super(Name,c,p1,new Point((p1.getY()-c.getY())+c.getX(),c.getY(),controleur),controleur);
		//super(Name,c,p1,new Point(p1.getX(),(p1.getX()-c.getX())+c.getY(),controleur),controleur);	
	}
	
        @Override
	public <T> T visitor(GeoObjectVisitor<T> obj) throws VisiteurException {
            // TODO: a completer
        	return obj.visitEllipse(this);
           // return null;
	}

	@Override
	public boolean contient(Point p) {
            // TODO: a completer
            return false;
	}
}

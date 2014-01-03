package geoanalytique.model;
 
import geoanalytique.controleur.GeoAnalytiqueControleur;
import geoanalytique.exception.VisiteurException;
import geoanalytique.util.GeoObjectVisitor;

/**
 * Modele mathematique pour les cercles.
 * 
 */
public class Cercle extends Ellipse {
	
	public Cercle(Point c,Segment r1,Segment r2,GeoAnalytiqueControleur controleur){
		super(c,r1,r2,controleur);
		
	}
	public Cercle(String Name,Point c,Segment r1,Segment r2,GeoAnalytiqueControleur controleur){
		super(Name,c,r1,r2,controleur);	
	}
	
        @Override
	public <T> T visitor(GeoObjectVisitor<T> obj) throws VisiteurException {
            // TODO: a completer
            return null;
	}

	@Override
	public boolean contient(Point p) {
            // TODO: a completer
            return false;
	}
}

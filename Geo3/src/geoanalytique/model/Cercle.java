package geoanalytique.model;
 
import geoanalytique.controleur.GeoAnalytiqueControleur;
import geoanalytique.exception.VisiteurException;
import geoanalytique.util.GeoObjectVisitor;

/**
 * Modele mathematique pour les cercles.
 * 
 */

public class Cercle extends Ellipse {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
		if (this.getCentre().calculerDistance(this.getP2())>=Math.sqrt(Math.pow(p.getX()-this.getCentre().getX(),2)+Math.pow(p.getY()-this.getCentre().getY(),2)))
            return true;
        else
            return false;
	}
	public double perimetre(){
		
		return 2 * Math.PI * this.getP1().calculerDistance(this.getCentre());
	}
	
	public double calculerAire(){
	return super.aire= this.getP1().calculerDistance(this.getCentre())*this.getP1().calculerDistance(this.getCentre())*Math.PI ;
	}
	
	
}

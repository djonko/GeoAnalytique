package geoanalytique.model;

import geoanalytique.util.GeoObjectVisitor;
import geoanalytique.controleur.GeoAnalytiqueControleur;
import geoanalytique.exception.VisiteurException;
 

/**
 *        Un segment est considerer comme une droite car nous passons par au moins 
 *        1 point et que la pente est aussi definit dans le Segment. En revanche 
 *        on pourra lancer une exception si le traitement ne peut s'appliquer sur 
 *        le segment en cours.
 * 
 * 
 */
public class Segment extends Droite {
	//les attributs 
	private Point e1;
	private Point e2;
	private double longueur;
	
	
    public Segment (Point a, Point b,GeoAnalytiqueControleur controleur) {
    	super(a,a.calculPente(b),controleur);
    	e1=a;
    	e2=b;
    	this.longueur=a.calculerDistance(b);
        // TODO: a completer
    }
    
    @Override
    public boolean equals(Object o) {
    	return (this.longueur==((Segment) o).getLong())?true:false;
        // TODO: a completer
        //return false;
    }
    
    	@Override
	public boolean contient(Point p) {
            // TODO: a completer
    		return super.contient(p);
            //return false;
	}
    
    @Override
	public <T> T visitor(GeoObjectVisitor<T> obj) throws VisiteurException {
            // TODO: a completer
            return null;
	}

	public Point getP1() {
		return e1;
	}

	public void setP1(Point e1) {
		this.e1 = e1;
	}

	public Point getP2() {
		return e2;
	}

	public void setP2(Point e2) {
		this.e2 = e2;
	}

	public double getLong() {
		return longueur;
	}

	public void setLong(double longueur) {
		this.longueur = longueur;
	}
}


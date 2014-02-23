package geoanalytique.model;

import geoanalytique.util.GeoObjectVisitor;
import geoanalytique.controleur.GeoAnalytiqueControleur;
import geoanalytique.exception.VisiteurException;

/** 
 * Modele mathematique pour les ellipses 
 * 
 */
public class Ellipse extends Surface {
   
	private Point p1;
	private Point p2;
	private Point centre;
	
	public Ellipse(Point c,Point p1,Point p2,GeoAnalytiqueControleur controleur){
		super(controleur);
		this.centre=c;
		this.setP1(p1);
		this.setP2(p2);
		this.p1.setX(this.centre.getX());
		this.p2.setY(this.centre.getY());
		
	}
	
	public Ellipse(String Name,Point c,Point p1,Point p2,GeoAnalytiqueControleur controleur){
		super(Name,controleur);
		this.centre=c;
		this.setP1(p1);
		this.setP2(p2);
		this.p1.setX(this.centre.getX());
		this.p2.setY(this.centre.getY());
		
	}

    @Override
    public double calculerAire() {
        // TODO: a completer
        throw new UnsupportedOperationException("Not supported yet.");
    	//return Math.PI*this.r1.getLong()*this.r2.getLong();
        
    }

    
    @Override
    public boolean equals(Object o) {
        // TODO: a completer
    	if(o!=null && o instanceof Ellipse){
    		//return(this.r1.equals(o) && this.r2.equals(o) && this.centre.equals(o));
    		return false;
    	}else
        return false;
    }
    
	@Override
	public boolean contient(Point p) {
               // TODO: a completer
		//if (this.getCentre().calculerDistance(this.getP2())>=Math.sqrt(Math.pow(p.getX()-this.getCentre().getX(),2)+Math.pow(p.getY()-this.getCentre().getY(),2)))
			if (this.getCentre().calculerDistance(this.getP1())>=Math.sqrt(Math.pow(p.getX()-this.getCentre().getX(),2)+Math.pow(p.getY()-this.getCentre().getY(),2)))
				return true;
            return false;
	}
    
    @Override
	public <T> T visitor(GeoObjectVisitor<T> obj) throws VisiteurException {
            // TODO: a completer
    	return obj.visitEllipse(this);
            //return null;
	}

    @Override
    public Point calculerCentreGravite() {
        // TODO: a completer
        return null;
    }


	


	

	public Point getCentre() {
		return this.centre;
	}

	public void setCentre(Point centre) {
		this.centre = centre;
	}

	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}

	@Override
	public void deplacer(double dx, double dy) {
		// TODO Auto-generated method stub
		
	}
}
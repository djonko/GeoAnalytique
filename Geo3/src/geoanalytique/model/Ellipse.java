package geoanalytique.model;

import geoanalytique.util.GeoObjectVisitor;
import geoanalytique.controleur.GeoAnalytiqueControleur;
import geoanalytique.exception.VisiteurException;

/** 
 * Modele mathematique pour les ellipses 
 * 
 */
public class Ellipse extends Surface {
   
	private Segment r1;
	private Segment r2;
	private Point centre;
	
	public Ellipse(Point c,Segment r1,Segment r2,GeoAnalytiqueControleur controleur){
		super(controleur);
		this.r1=r1;
		this.r2=r2;
		this.centre=c;
	}
	
	public Ellipse(String Name,Point c,Segment r1,Segment r2,GeoAnalytiqueControleur controleur){
		super(Name,controleur);
		this.r1=r1;
		this.r2=r2;
		this.centre=c;
		
	}

    @Override
    public double calculerAire() {
        // TODO: a completer
        //throw new UnsupportedOperationException("Not supported yet.");
    	return Math.PI*this.r1.getLong()*this.r2.getLong();
        
    }

    
    @Override
    public boolean equals(Object o) {
        // TODO: a completer
    	if(o!=null && o instanceof Ellipse){
    		Ellipse E=(Ellipse)o;
    		return(this.r1.equals(o) && this.r2.equals(o));
    	}else
        return false;
    }
    
	@Override
	public boolean contient(Point p) {
               // TODO: a completer
            return false;
	}
    
    @Override
	public <T> T visitor(GeoObjectVisitor<T> obj) throws VisiteurException {
            // TODO: a completer
            return null;
	}

    @Override
    public Point calculerCentreGravite() {
        // TODO: a completer
        return null;
    }


	public Segment getR1() {
		return r1;
	}


	public void setR1(Segment r1) {
		this.r1 = r1;
	}


	public Segment getR2() {
		return r2;
	}


	public void setR2(Segment r2) {
		this.r2 = r2;
	}

	public Point getCentre() {
		return centre;
	}

	public void setCentre(Point centre) {
		this.centre = centre;
	}
}
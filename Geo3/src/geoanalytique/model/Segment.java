package geoanalytique.model;

import geoanalytique.model.geoobject.operation.MediatriceOperation;
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
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//les attributs 
	private Point e1;
	private Point e2;
	private double longueur;
	
	
    public Segment (Point a, Point b,GeoAnalytiqueControleur controleur) {
    	super(a,a.calculPente(b),controleur);
    	super.operations.add(new MediatriceOperation(this,super.getControleur()));
    	e1=a;
    	e2=b;
    	this.longueur=a.calculerDistance(b);
    	
        // TODO: a completer
    }
    
    @Override
    public boolean equals(Object o) {
    
    	if(o instanceof Segment){
    		if( ((Segment) o).e1.equals(this.e1) && ((Segment) o).e2.equals(this.e2))
    			return true;
    		else
    			return false;
    	}
        // TODO: a completer
        return false;
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
    	return obj.visitSegment(this);
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
	
	public void deplacer(double dx, double dy,Point apres){
		Point t=depl(dx,dy,this.min(),false);
		Point t2=depl(dx,dy,this.max(),true);
		
		this.min().setX(apres.getX() - t.getX());
		this.min().setY(apres.getY() - t.getY());
		
		this.max().setX(apres.getX() + t2.getX());
		this.max().setY(apres.getY() + t2.getY());
		
	}
	public Point depl(double x,double y,Point p2,boolean t){
		double dx,dy;
		
		//t=true implique max
		if(t){
			dx=(x - p2.getX())*-1;
			dy=(y - p2.getY())*-1;
		}else{
			dx=x - p2.getX();
			dy=y - p2.getY();
		}
		return new Point(dx,dy,null);	
	}
	
	public Point max(){
		Point e1=this.e1;
		Point e2=this.e2;
		if(e1.getX()>e2.getX() && e1.getY()>e2.getY() )
			return e1;
		else
			return e2;
			
	}
	public Point min(){
		Point e1=this.e1;
		Point e2=this.e2;
		if(e1.getX()>e2.getX() && e1.getY()>e2.getY() )
			return e2;
		else
			return e1;
			
	}
	public void update(){
		this.longueur=this.e1.calculerDistance(e2);
	}
}


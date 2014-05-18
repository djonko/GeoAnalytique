package geoanalytique.model;

import geoanalytique.controleur.GeoAnalytiqueControleur;

import java.util.ArrayList;
import java.util.Collection;

public class Rectangle extends Polygone{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Rectangle(Collection<Point> controles,
			GeoAnalytiqueControleur controleur) {
		super(controles, controleur);
		// TODO Auto-generated constructor stub
		this.aire=this.calculerAire();
		this.perimetre=(this.getSegment(1).getLong()+this.getSegment(2).getLong())*2;
	}

	public Rectangle(String name,Collection<Point> controles,GeoAnalytiqueControleur controleur) {
    	super(name,controles,controleur);
    	this.aire=this.calculerAire();
		this.perimetre=(this.getSegment(1).getLong()+this.getSegment(2).getLong())*2;

        // TODO: a completer
    }
	
	@Override
	public Segment getSegment(int nb) {
		// TODO Auto-generated method stub
		switch(nb){
		case 1:return new Segment(((ArrayList<Point>) super.controles).get(0),((ArrayList<Point>) super.controles).get(1),this.getControleur());
		case 2:return new Segment(((ArrayList<Point>) super.controles).get(1),((ArrayList<Point>) super.controles).get(2),this.getControleur());
		case 3:return new Segment(((ArrayList<Point>) super.controles).get(2),((ArrayList<Point>) super.controles).get(3),this.getControleur());
		case 4:return new Segment(((ArrayList<Point>) super.controles).get(3),((ArrayList<Point>) super.controles).get(0),this.getControleur());
		default:return null;
		}
	}

	@Override
	public double calculerAire() {
		// TODO Auto-generated method stub
		Segment c=getSegment(1);
		Segment c2=getSegment(2);
		return c.getLong()*c2.getLong();
	}

	public Point calculerCentreGravite() {
		// TODO Auto-generated method stub
		double zx=0;
		double zy=0;
		for(Point p:controles){
			zx+=p.getX();
			zy+=p.getY();
		}
		zx=zx/4;zy=zy/4;
		return new Point(zx, zy,null );
		//return null;
	}
	public boolean contient(Point p) {
        // TODO: a completer
		if((this.plusPetit().getX()<=p.getX() && this.plusGrand().getX()>=p.getX()) && (this.plusPetit().getY()<=p.getY() && this.plusGrand().getY()>=p.getY())){
			return true;
		}else{
			for(int i=1;i<=4;i++){
				if(this.getSegment(i).contient(p))
					return true;
			}
		}
        return false;
	}
	
	private Point plusGrand(){
		Point max=((ArrayList<Point>) this.controles).get(0);
		for(Point p: this.controles){
			if(p.getX()>max.getX() &&p.getY()>max.getY()){
				max=p;
			}
		}
		return max;
	}
	private Point plusPetit(){
		Point min=((ArrayList<Point>) this.controles).get(0);
		for(Point p: this.controles){
			if(p.getX()<min.getX() && p.getY()<min.getY()){
				min=p;
			}
		}
		return min;
	}

	@Override
	public void deplacer(double dx, double dy) {
		// TODO Auto-generated method stub
		
	}
	
	public void update(){
		this.aire=this.calculerAire();
		this.perimetre=(this.getSegment(1).getLong()+this.getSegment(2).getLong())*2;
	}
}

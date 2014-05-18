package geoanalytique.model;

import geoanalytique.controleur.GeoAnalytiqueControleur;
import geoanalytique.model.geoobject.operation.MedianeOperation;
import java.util.ArrayList;
import java.util.Collection;

;

public class Triangle extends Polygone {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Triangle(Collection<Point> controles,
			GeoAnalytiqueControleur controleur) {
		super(controles, controleur);
		this.aire=this.calculerAire();
		this.perimetre=0;
	}

	public Triangle(String name,Collection<Point> controles,GeoAnalytiqueControleur controleur) {
    	super(name,controles,controleur);
    	super.operations.add(new MedianeOperation(2,this,super.getControleur()));
    	this.aire=this.calculerAire();
		this.perimetre=0;
    }

	@Override
	public Segment getSegment(int nb) {
		switch(nb){
		case 1:return new Segment(((ArrayList<Point>) super.controles).get(0),((ArrayList<Point>) super.controles).get(1),this.getControleur());
		case 2:return new Segment(((ArrayList<Point>) super.controles).get(1),((ArrayList<Point>) super.controles).get(2),this.getControleur());
		case 3:return new Segment(((ArrayList<Point>) super.controles).get(2),((ArrayList<Point>) super.controles).get(0),this.getControleur());
		default:return null;
		}
	}

	public boolean contient(Point p){
		if((this.plusPetit().getX()<=p.getX() && this.plusGrand().getX()>=p.getX()) && (this.plusPetit().getY()<=p.getY() && this.plusGrand().getY()>=p.getY())){
			
			return true;
		}
		
		return false;
		
	}
	@Override
	public double calculerAire() {
		// TODO Auto-generated method stub
		Segment s1=this.getSegment(1);
		Double t=s1.getP1().calculerDistance(this.getSegment(2).getP2());
		Double t2=s1.getLong()*t;
		return t2 / 2;
	}
	
	public double calculerPerimatre() {
		// TODO Auto-generated method stub
		Segment s1=this.getSegment(1);
		Segment s2=this.getSegment(2);
		Segment s3=this.getSegment(3);
		Double p=s1.getLong()+s2.getLong()+s3.getLong();
		return p;
	}

	@Override
	public Point calculerCentreGravite() {
		double zx=0;
		double zy=0;
		for(Point p:this.controles){
			zx+=p.getX();zy+=p.getY();
		}
		zx=zx/3;zy=zy/3;
		return new Point(zx, zy,null);
	}

	@Override
	public void deplacer(double dx, double dy) {
		// TODO Auto-generated method stub
		
	}
	private Point plusGrand(){
		Point max=((ArrayList<Point>) this.controles).get(0);
		for(Point p: this.controles){
			if(p.getX()>max.getX() && p.getY()>max.getY()){
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

}

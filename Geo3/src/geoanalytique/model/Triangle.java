package geoanalytique.model;

import geoanalytique.controleur.GeoAnalytiqueControleur;
import geoanalytique.model.geoobject.operation.MedianeOperation;
import geoanalytique.model.geoobject.operation.MediatriceOperation;

import java.util.ArrayList;
import java.util.Collection;

;

public class Triangle extends Polygone {

	public Triangle(Collection<Point> controles,
			GeoAnalytiqueControleur controleur) {
		super(controles, controleur);
		this.aire=this.calculerAire();
		this.perimetre=0;
		// TODO Auto-generated constructor stub
	}

	public Triangle(String name,Collection<Point> controles,GeoAnalytiqueControleur controleur) {
    	super(name,controles,controleur);
    	super.operations.add(new MedianeOperation(2,this,super.getControleur()));
    	this.aire=this.calculerAire();
		this.perimetre=0;
        // TODO: a completer
    }

	@Override
	public Segment getSegment(int nb) {
		// TODO Auto-generated method stub
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
		return 0;
	}

	@Override
	public Point calculerCentreGravite() {
		// TODO Auto-generated method stub
		return null;
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

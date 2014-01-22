package geoanalytique.model;

import geoanalytique.controleur.GeoAnalytiqueControleur;

import java.util.ArrayList;
import java.util.Collection;

public class Rectangle extends Polygone{

	public Rectangle(Collection<Point> controles,
			GeoAnalytiqueControleur controleur) {
		super(controles, controleur);
		// TODO Auto-generated constructor stub
	}

	public Rectangle(String name,Collection<Point> controles,GeoAnalytiqueControleur controleur) {
    	super(name,controles,controleur);

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

	@Override
	public Point calculerCentreGravite() {
		// TODO Auto-generated method stub
		return null;
	}

}
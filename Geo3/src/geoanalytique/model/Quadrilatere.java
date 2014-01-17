package geoanalytique.model;

import geoanalytique.controleur.GeoAnalytiqueControleur;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;


public class Quadrilatere extends Polygone{

	public Quadrilatere(Collection<Point> controles,GeoAnalytiqueControleur controleur) {
		super(controles, controleur);
		// TODO Auto-generated constructor stub
	}
	
	public Quadrilatere(String name,Collection<Point> controles,GeoAnalytiqueControleur controleur) {
    	super(name,controles,controleur);
    	//Collection<Point> k=controles;
    	//Collection<Point> t=new ArrayList<Point>();
        // TODO: a completer
    }

	@Override
	public Segment getSegment(int nb) {
		// TODO Auto-generated method stub
		
		return null;
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

}

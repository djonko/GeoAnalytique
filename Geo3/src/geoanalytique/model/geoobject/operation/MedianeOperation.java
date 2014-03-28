package geoanalytique.model.geoobject.operation;

import geoanalytique.controleur.GeoAnalytiqueControleur;
import geoanalytique.exception.ArgumentOperationException;
import geoanalytique.exception.IncorrectTypeOperationException;
import geoanalytique.model.*;
import geoanalytique.util.*;

public class MedianeOperation implements Operation{
	
	private Triangle trgl;
	private int num;
	private GeoAnalytiqueControleur controleur;
	
	public MedianeOperation(int num,GeoObject o,GeoAnalytiqueControleur c){
		if (o instanceof Triangle){
			this.trgl=(Triangle) o;
			this.num=num;
			this.controleur=c;
		}
	}
	
	
	public String getTitle() {
		// TODO Auto-generated method stub
		return "la Mediane";
	}

	@Override
	public int getArite() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setArgument(int num, Object o)
			throws ArgumentOperationException, IncorrectTypeOperationException {
		if(o instanceof Integer)
			this.num=num;
		System.out.println("sssssssssssssssssssssssssssssssssss "+this.num);
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public Class getClassArgument(int num) {
		// TODO Auto-generated method stub
		return Integer.class;
	}

	@Override
	public Object calculer() {
		
		if(num>=1 && num<3){
			Point p=this.trgl.getSegment(num).getP1();
			Point mil=this.trgl.getSegment(num+1).getP1().milieuDeuxPoint(this.trgl.getSegment(num+1).getP2());
			double pente=mil.calculPente(p);
			return new Droite(p,-pente,this.trgl.getControleur());
		}else if(num==3){
			Point p=this.trgl.getSegment(num).getP1();
			Point mil=this.trgl.getSegment(1).getP1().milieuDeuxPoint(this.trgl.getSegment(1).getP2());
			double pente=mil.calculPente(p);
			return new Droite(p,-pente,this.trgl.getControleur());
		}
		else return null;
	}

	@Override
	public String getDescriptionArgument(int num)
			throws ArgumentOperationException {
		// TODO Auto-generated method stub
		return "Entrez le numero du segment /nEx:1 ou 2 ou 3";
	}

	public GeoAnalytiqueControleur getControleur() {
		return controleur;
	}
}

package geoanalytique.model.geoobject.operation;

import geoanalytique.exception.ArgumentOperationException;
import geoanalytique.exception.IncorrectTypeOperationException;
import geoanalytique.model.*;
import geoanalytique.util.*;

public class MedianeOperation implements Operation{
	
	private Triangle trgl;
	private int num;
	
	public MedianeOperation(int num,Object o){
		this.trgl=(Triangle) o;
		this.num=num;
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
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public Class getClassArgument(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object calculer() {
		// TODO Auto-generated method stub
		Point p=this.trgl.getSegment(1).getP1();
		Point mil=this.trgl.getSegment(2).getP1().milieuDeuxPoint(this.trgl.getSegment(2).getP2());
		double pente=mil.calculPente(p);
		return new Droite(p,-pente,this.trgl.getControleur());
	}

	@Override
	public String getDescriptionArgument(int num)
			throws ArgumentOperationException {
		// TODO Auto-generated method stub
		return null;
	}

}

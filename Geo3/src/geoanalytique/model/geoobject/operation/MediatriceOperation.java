package geoanalytique.model.geoobject.operation;

import geoanalytique.exception.ArgumentOperationException;
import geoanalytique.exception.IncorrectTypeOperationException;
import geoanalytique.model.Droite;
import geoanalytique.model.GeoObject;
import geoanalytique.model.Point;
import geoanalytique.model.Segment;
import geoanalytique.util.Operation;

public class MediatriceOperation implements Operation {
	private Segment obj;
	private int num;
	
	public MediatriceOperation(int num,Object o){
		try{
			this.setArgument(num, o);
		}catch(Exception e){
			this.obj=null;
		}
	}
	
	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "la Mediatrice";
	}

	@Override
	public int getArite() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public void setArgument(int num, Object o) throws ArgumentOperationException, IncorrectTypeOperationException {
		// TODO Auto-generated method stub
		obj=(Segment)o;
		this.num=num;
		
	}

	@Override
	public Class getClassArgument(int num) {
		// TODO Auto-generated method stub
		return Segment.class;
	}
	
	
	@Override
	public Object calculer() {
		// TODO Auto-generated method stub
		Point mil=this.obj.getP1().milieuDeuxPoint(this.obj.getP2());
		return new Droite(mil,this.obj.pente+Math.tan(90),this.obj.getControleur());
		//return null;
	}

	@Override
	public String getDescriptionArgument(int num)
			throws ArgumentOperationException {
		// TODO Auto-generated method stub
		return "retourne la droite qui represente la mediatrice dun segment ";
	}

}

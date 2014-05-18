package geoanalytique.model.geoobject.operation;

import geoanalytique.controleur.GeoAnalytiqueControleur;
import geoanalytique.exception.ArgumentOperationException;
import geoanalytique.exception.IncorrectTypeOperationException;
import geoanalytique.model.Droite;
import geoanalytique.model.GeoObject;
import geoanalytique.model.Point;
import geoanalytique.model.Segment;
import geoanalytique.util.Operation;

public class MediatriceOperation implements Operation {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private GeoObject obj;
	private transient Segment s;
	private GeoAnalytiqueControleur controleur;
	
	public MediatriceOperation(GeoObject o,GeoAnalytiqueControleur c){
		//this.setObj(o);
		if(o instanceof GeoObject){
			this.s=(Segment)o;
		}
		this.controleur=c;
		
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
		
		
		
	}

	@Override
	public Class<Segment> getClassArgument(int num) {
		// TODO Auto-generated method stub
		return Segment.class;
	}
	
	
	@Override
	public GeoObject calculer() {
		// TODO Auto-generated method stub
		Point mil=this.s.getP1().milieuDeuxPoint(this.s.getP2());
		
		//return new Droite(mil,this.s.pente+Math.tan(90),this.s.getControleur());
		//return null;
		return new Droite("droite",mil,1/(s.getP1().calculPente(mil)),this.controleur);
	}

	@Override
	public String getDescriptionArgument(int num)
			throws ArgumentOperationException {
		// TODO Auto-generated method stub
		return "retourne la droite qui represente la mediatrice dun segment ";
	}

	public GeoObject getObj() {
		return obj;
	}

	public void setObj(GeoObject obj) {
		this.obj = obj;
	}
	public GeoAnalytiqueControleur getControleur() {
		return controleur;
	}

	public void setControleur(GeoAnalytiqueControleur controleur) {
		this.controleur = controleur;
	}

}

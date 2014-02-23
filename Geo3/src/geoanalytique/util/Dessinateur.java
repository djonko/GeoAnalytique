package geoanalytique.util;
 
import geoanalytique.exception.VisiteurException;
import geoanalytique.graphique.*;
import geoanalytique.model.*;


/**
 * Cette objet est utilise par le presenteur, pour 'convertir' les modeles
 * en objet graphique utilisable par la vue. Le dessinateur repose sur le design pattern
 * Visitor. 
 * 
 * 
 *
 */
public class Dessinateur implements GeoObjectVisitor<Graphique> {

    private ViewPort viewport;
    
	/**
	 * 
	 */
	public Dessinateur(ViewPort viewport) {
            this.viewport = viewport;
	}

	/**
	 * @see geoanalytique.model.GeoObjectVisitor#visitDroite(geoanalytique.model.Droite)
	 */
	public Graphique visitDroite(Droite d) throws VisiteurException {
            // TODO: a completer
		//double yma=d.p.getY()+ (d.pente *(viewport.getXMax()-d.p.getX()));
		//double ymi=d.p.getY()- (d.pente *(viewport.getXMin()-d.p.getX()));

		GCoordonnee c=viewport.convert(d.p.getX(),d.p.getY());
		int ymax=(int)(c.getY()+(d.pente*(viewport.getLargeur()- c.getX())));
		int ymin=(int)(c.getY()-(d.pente* c.getX()));
		System.out.println("p1:"+0+"/"+ymin+" p2:"+viewport.getLargeur()+"/"+ymax);
		return new GLigne(0,ymin,viewport.getLargeur(),ymax);
		
            //return null;
	}

	/**
	 * @see geoanalytique.model.GeoObjectVisitor#visitEllipse(geoanalytique.model.Ellipse)
	 */
	public Graphique visitEllipse(Ellipse e) throws VisiteurException {
            // TODO: a completer
		double p1y,p2x;
		GCoordonnee c=viewport.convert(e.getCentre().getX(), e.getCentre().getY());
		GCoordonnee p1=viewport.convert(e.getP1().getX(),e.getP1().getY());
		GCoordonnee p2=viewport.convert(e.getP2().getX(),e.getP2().getY());
		if(e.getP1().getY()<e.getCentre().getY())
			p1y=(e.getCentre().getY()-e.getP1().getY())+e.getCentre().getY();
			
		else
			p1y=e.getP1().getY();
		if(e.getP2().getX()<e.getCentre().getX())
			p2x=(e.getCentre().getX()-e.getP2().getX())+e.getCentre().getX();
			
		else
			p2x=e.getP2().getX();
		
		int l=(int) Math.sqrt((c.getX()-p1.getX())*(c.getX()-p1.getX())+(c.getY()-p1.getY())*(c.getY()-p1.getY()));
		int h=(int) Math.sqrt((c.getX()-p2.getX())*(c.getX()-p2.getX())+(c.getY()-p2.getY())*(c.getY()-p2.getY()));
		GCoordonnee c2=viewport.convert(-(p2x-e.getCentre().getX())+e.getCentre().getX(),p1y);
		System.out.println("hauteur "+h+" largeur"+l);
        return new GOvale(c2.getX(),c2.getY(),h*2,l*2);
	}

	/**
	 * @see geoanalytique.model.GeoObjectVisitor#visitPoint(geoanalytique.model.Point)
	 */
	public Graphique visitPoint(Point o) throws VisiteurException {
            GCoordonnee c = viewport.convert(((Point)o).getX(),((Point)o).getY());
            return c;
	}

	/**
	 * @see geoanalytique.model.GeoObjectVisitor#visitPolygone(geoanalytique.model.Polygone)
	 */
	public Graphique visitPolygone(Polygone p) throws VisiteurException {
            // TODO: a completer
		GCoordonnee c;
		Segment s;
		int tabx[]=null,taby[]=null,taille=0;
		if(p instanceof Carre || p instanceof Rectangle){
			//return this.visitSegment(p.getSegment(1));
			tabx=new int[4];
			taby=new int[4];
			taille=4;
			
		}else if(p instanceof Triangle){
			tabx=new int[3];
			taby=new int[3];
			taille=3;
		}
	if(taille!=0){
		for(int i=1;i<=taille;i++){
			s=p.getSegment(i);
			c=viewport.convert(s.getP1().getX(),s.getP1().getY());
			//c2=viewport.convert(s.getP2().getX(),s.getP2().getY());
			//c3=viewport.convert(s.getP1().getX(),s.getP1().getY());
			tabx[i-1]=c.getX();
			taby[i-1]=c.getY();
		}
		return new GPolygone(tabx,taby,taille);
	}
	else return null;
	}

	/**
	 * @see geoanalytique.model.GeoObjectVisitor#visitSegment(geoanalytique.model.Segment)
	 */
	public Graphique visitSegment(Segment s) throws VisiteurException {
            // TODO: a completer
		
		GCoordonnee c1=viewport.convert(s.getP1().getX(),s.getP1().getY());
		GCoordonnee c2=viewport.convert(s.getP2().getX(),s.getP2().getY());
		return new GLigne(c1.getX(),c1.getY(),c2.getX(),c2.getY());
		
	}
	
	
}

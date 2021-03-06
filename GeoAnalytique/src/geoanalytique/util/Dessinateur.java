package geoanalytique.util;
 
import geoanalytique.exception.VisiteurException;
import geoanalytique.graphique.GCoordonnee;
import geoanalytique.graphique.GLigne;
import geoanalytique.graphique.Graphique;
import geoanalytique.model.Droite;
import geoanalytique.model.Ellipse;
import geoanalytique.model.Point;
import geoanalytique.model.Polygone;
import geoanalytique.model.Segment;
import geoanalytique.model.ViewPort;

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
		GCoordonnee c=(GCoordonnee) this.visitPoint(d.p);
		int ymax=c.getY()+((int)d.pente*(viewport.getLargeur()- c.getX()));
		int ymin=c.getY()-((int)d.pente* c.getX());
		return new GLigne(viewport.getLargeur(),ymax,0,ymin);
            //return null;
	}

	/**
	 * @see geoanalytique.model.GeoObjectVisitor#visitEllipse(geoanalytique.model.Ellipse)
	 */
	public Graphique visitEllipse(Ellipse e) throws VisiteurException {
            // TODO: a completer
            return null;
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
            return null;
	}

	/**
	 * @see geoanalytique.model.GeoObjectVisitor#visitSegment(geoanalytique.model.Segment)
	 */
	public Graphique visitSegment(Segment s) throws VisiteurException {
            // TODO: a completer
		Graphique c=this.visitPoint(s.getP1());
		Graphique c2=this.visitPoint(s.getP2());
		return new GLigne(((GCoordonnee) c).getX(),((GCoordonnee) c).getY(),((GCoordonnee) c2).getX(),((GCoordonnee) c2).getY());
           // return null;
	}
}

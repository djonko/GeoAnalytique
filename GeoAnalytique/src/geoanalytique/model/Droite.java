package geoanalytique.model;
 
import geoanalytique.util.GeoObjectVisitor;
import geoanalytique.controleur.GeoAnalytiqueControleur;
import geoanalytique.exception.VisiteurException;

/**
 * Modele mathematique pour les droites
 * 
 */

public class Droite extends GeoObject {
	//les attributs
	double pente;
	double ordonnee_origine;
	
	
    // Ce constructeur EST INTERDIT d'utilisation
    // PAR CONSEQUENT IL NE FAUT PAS LE MODIFIER
    // OU MIEUX IL FAUT LE SUPPRIMER.
    // On laisse ce constructeur au debut, pour pouvoir compiler le programme
    // simplement
    public Droite() {
       throw new RuntimeException("INTERDICTION D'UTILISER CE CONSTRUCTEUR!!!!") ;
    }
    
    public Droite(Point p, double pente,GeoAnalytiqueControleur controleur) {
        // TODO: a completer
    	super(controleur);//a completer
    	this.pente=pente;
    	this.ordonnee_origine=p.getY()-(p.getX()*this.pente);
    }
    
    @Override
    public boolean equals(Object o) {
        // TODO: a completer
        return false;
    }
    
   	@Override
	public <T> T visitor(GeoObjectVisitor<T> obj) throws VisiteurException {
            // TODO: a completer
            return null;
	}

	@Override
	public boolean contient(Point p) {
            // TODO: a completer
		if(((this.pente*p.getX())-p.getY()+this.ordonnee_origine)==0.0)
			return true;
		return false;
	}
	
	
    
}
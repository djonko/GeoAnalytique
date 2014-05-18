package geoanalytique.model;
 
import geoanalytique.util.GeoObjectVisitor;
import geoanalytique.controleur.GeoAnalytiqueControleur;
import geoanalytique.exception.VisiteurException;


/**
 * Modele mathematique pour les droites
 * 
 */

public class Droite extends GeoObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//les attributs
	public double pente;
	public Point p;
	
	
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
    	this.p=p;
    	
    }
    public Droite(String Name,Point p, double pente,GeoAnalytiqueControleur controleur) {
        // TODO: a completer
    	super(Name,controleur);//a completer
    	this.pente=pente;
    	this.p=p;
    	
    }
    
    @Override
    public boolean equals(Object o) {
        // TODO: a completer
    	if(o != null && o instanceof Droite)
    		return this.contient(((Droite) o).p) && ((Droite) o).contient(this.p);
    	else
        return false;
    }
    
   	@Override
	public <T> T visitor(GeoObjectVisitor<T> obj) throws VisiteurException {
            // TODO: a completer
   		return obj.visitDroite(this);
	}

	@Override
	public boolean contient(Point p) {
            // TODO: a completer
		return (this.p.calculPente(p)==this.pente)?true:false;
		
	}

	@Override
	public void deplacer(double dx, double dy) {
		this.p.deplacer(dx, dy);
		
	}
	
	
    
}
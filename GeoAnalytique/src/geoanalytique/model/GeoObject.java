package geoanalytique.model;
 
import geoanalytique.util.GeoObjectVisitor;
import geoanalytique.controleur.GeoAnalytiqueControleur;
import geoanalytique.exception.VisiteurException;
import geoanalytique.model.geoobject.operation.ChangeNomOperation;
import geoanalytique.util.Operation;
import java.util.ArrayList;

/**
 * Classe de base a tous objets geometriques
 * 
 */
public abstract class GeoObject {
    private static int count = 0;
    private ArrayList<Operation> operations;
    
    private String name;
    private GeoAnalytiqueControleur controleur;

    // Ce constructeur EST INTERDIT d'utilisation
    // PAR CONSEQUENT IL NE FAUT PAS LE MODIFIER
    // OU MIEUX IL FAUT LE SUPPRIMER.
    // On laisse ce constructeur au debut, pour pouvoir compiler le programme
    // simplement
    public GeoObject() {
       throw new RuntimeException("INTERDICTION D'UTILISER CE CONSTRUCTEUR!!!!") ;
    }
    
    public GeoObject (String name,GeoAnalytiqueControleur controleur) {
        operations = new ArrayList<Operation>();
        operations.add(new ChangeNomOperation(this));
        this.name=name;
        this.setControleur(controleur);
        // TODO: a completer
    }
    
    public GeoObject (GeoAnalytiqueControleur controleur) {
        this.name = this.getClass().getSimpleName()+(count++);
        // TODO: a completer
        this.setControleur(controleur);
    }

    public String getName() {
        // TODO: a completer
        return this.name;
    }
    
    
    public void modifie() {
    	// TODO: a completer
    }

    public void setName (String name) {
        // TODO: a completer
    	this.name=name;
    }

    public abstract boolean contient(Point p);
    
    public abstract <T> T visitor(GeoObjectVisitor<T> obj) throws VisiteurException;

	public GeoAnalytiqueControleur getControleur() {
		return controleur;
	}

	public void setControleur(GeoAnalytiqueControleur controleur) {
		this.controleur = controleur;
	}
}


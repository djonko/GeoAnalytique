package geoanalytique.model;
 
import geoanalytique.util.GeoObjectVisitor;
import geoanalytique.controleur.GeoAnalytiqueControleur;
import geoanalytique.exception.VisiteurException;
import geoanalytique.model.geoobject.operation.ChangeNomOperation;
import geoanalytique.util.Operation;

import java.awt.Color;
import java.util.ArrayList;

/**
 * Classe de base a tous objets geometriques
 * 
 */
public abstract class GeoObject {
    private static int count = 0;
    protected ArrayList<Operation> operations;
    
    private String name;
    private GeoAnalytiqueControleur controleur;
    ///public ArrayList<GeoObject> GeoObjetOperation;

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
        operations = new ArrayList<Operation>();
        operations.add(new ChangeNomOperation(this));
        this.setControleur(controleur);
    }

    public String getName() {
        // TODO: a completer
        return this.name;
    }
    
    
    public void modifie() {
    	// TODO: a completer
    	
    }
    
    public abstract void  deplacer(double dx, double dy);

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
	public ArrayList<Operation> getOperations() {
		return operations;
	}
}


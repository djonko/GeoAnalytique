package geoanalytique.controleur; 

import geoanalytique.model.GeoObject;
import geoanalytique.util.Operation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Gestionnaire d'evenement pour les operations sur un objet.
 * Il est important vu le nombre d'operation possible pour certains objets
 * d'avoir des petites entites annexes pour mieux decouper les besoins.
 * 
 *
 */
public class OperationControleur implements ActionListener {
	/**
         * Constructeur unique du listener.
         * @param o objet associe a l'operation
         * @param ope operation devant etre realise sur l'objet <i>o</i> si un
         * evenement survient.
         * @param owner controleur principale (contenant tous les objets)
         */
	private GeoObject ob;
	private Operation ope;
	private GeoAnalytiqueControleur controleur;
	
	
        public OperationControleur(GeoObject o, Operation ope, GeoAnalytiqueControleur owner) {
            // TODO: a completer
        	this.setOb(o);
        	this.setOpe(ope);
        	this.setControleur(owner);
	}

        
	/**
         * Lorsque ce listener est active, cette objet lance l'operation depuis le controleur
         * principale sur l'objet associe.
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	public void actionPerformed(ActionEvent e) {
		// TODO: a completer
		this.controleur.lanceOperation(this.ob,this.ope);
	}


	public Operation getOpe() {
		return ope;
	}


	public void setOpe(Operation ope) {
		this.ope = ope;
	}


	public GeoObject getOb() {
		return ob;
	}


	public void setOb(GeoObject ob) {
		this.ob = ob;
	}


	public GeoAnalytiqueControleur getControleur() {
		return controleur;
	}


	public void setControleur(GeoAnalytiqueControleur controleur) {
		this.controleur = controleur;
	}

}

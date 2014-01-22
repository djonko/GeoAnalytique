/*
 * GeoAnalytiqueView.java
 *
 * Created on 09 juin 2012, 03:11
 */

package geoanalytique.view;

import geoanalytique.graphique.Graphique; 

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 * Cette classe represente la zone a dessin pour afficher les objets geometriques
 * 
 */
// TODO (optionnel): modifier la classe de base, pour une classe plus adapte
public class GeoAnalytiqueView extends javax.swing.JPanel {
    private static final long serialVersionUID = -5516505527325580028L;
	private ArrayList<Graphique> graphiques;
    
    /** Creates new form GeoAnalytiqueView */
    public GeoAnalytiqueView() {
    	this.setBackground(Color.white);
        initComponents();
        graphiques = new ArrayList<Graphique>();
    }
    
    public void addGraphique(Graphique g) {
    	graphiques.add(g);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    	
    	
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 255, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    
    @Override
    public void paint(Graphics g) {
        for (Graphique graphique : graphiques) {
			graphique.paint(g);
		}
    }

	public void clear() {
		graphiques.clear();
	}

	public void removeGraphique(Graphique c) {
		graphiques.remove(c);		
	}
}

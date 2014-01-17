/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geoanalytique.gui;

import geoanalytique.view.GeoAnalytiqueView;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 * Classe representant l'interface graphique principale.
 * 
 * 
 */
public class GeoAnalytiqueGUI extends JPanel {

   private GeoAnalytiqueView grille;
    
   
   public GeoAnalytiqueGUI() {
       grille = new GeoAnalytiqueView();
       // TODO: a modifier!!!
       //this.setLayout(new FlowLayout());
       
       //
       this.setLayout(new BorderLayout(300,300));
       
       
 
       
       this.add(grille);
       
       // TODO: a completer
  
   }
   
   public GeoAnalytiqueView getCanvas() {
    	return grille;
    }
    
    public Container getPanelElements() {
    	// TODO: a completer
    	
        return null;
    }
    
    public Container getPanelIDs() {
    	// TODO: a completer
        return null;
    }
    
    public Container getPanelOperations() {
    	// TODO: a completer
        return null;
    }

    
    
    
}

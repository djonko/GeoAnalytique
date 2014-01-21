/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geoanalytique.gui;

import geoanalytique.view.GeoAnalytiqueView;

import java.awt.Container;

import javax.swing.*;

/**
 * Classe representant l'interface graphique principale.
 * 
 * 
 */
public class GeoAnalytiqueGUI extends JPanel {

   private GeoAnalytiqueView grille;
   
   //mes modifff
   private JPanel PanelOutil;
   private JButton jButton1;
   private JButton jButton2;
   //fin modi

   public GeoAnalytiqueGUI() {
       grille = new GeoAnalytiqueView();
       grille.setBorder(javax.swing.BorderFactory.createTitledBorder("salut"));
       //mes modi
       PanelOutil = new javax.swing.JPanel();
       jButton1 = new javax.swing.JButton();
       jButton2 = new javax.swing.JButton();
       
      this.setBackground(new java.awt.Color(255, 204, 255));
      this.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
      
      PanelOutil.setBorder(javax.swing.BorderFactory.createEtchedBorder());
      PanelOutil.setMaximumSize(new java.awt.Dimension(100, 333));
      PanelOutil.setPreferredSize(new java.awt.Dimension(4, 4));
      
      jButton1.setText("jButton1");

      jButton2.setText("jButton2");
      
      
      
      javax.swing.GroupLayout PanelOutilLayout = new javax.swing.GroupLayout(PanelOutil);
      PanelOutil.setLayout(PanelOutilLayout);
      PanelOutilLayout.setHorizontalGroup(
          PanelOutilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(PanelOutilLayout.createSequentialGroup()
              .addGroup(PanelOutilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(PanelOutilLayout.createSequentialGroup()
                      .addGap(11, 11, 11)
                      .addComponent(jButton1))
                  .addGroup(PanelOutilLayout.createSequentialGroup()
                      .addContainerGap()
                      .addComponent(jButton2)))
              .addContainerGap(22, Short.MAX_VALUE))
      );
      PanelOutilLayout.setVerticalGroup(
          PanelOutilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(PanelOutilLayout.createSequentialGroup()
              .addGap(5, 5, 5)
              .addComponent(jButton1)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addComponent(jButton2)
              .addContainerGap(309, Short.MAX_VALUE))
      );
      
      
      javax.swing.GroupLayout FenContainerLayout = new javax.swing.GroupLayout(this);
      this.setLayout(FenContainerLayout);
      FenContainerLayout.setHorizontalGroup(
          FenContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(FenContainerLayout.createSequentialGroup()
              .addComponent(PanelOutil, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addComponent(grille,700,javax.swing.GroupLayout.PREFERRED_SIZE,700)
              .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      FenContainerLayout.setVerticalGroup(
          FenContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(PanelOutil, javax.swing.GroupLayout.PREFERRED_SIZE,700, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(grille, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      
      //
     
      grille.setSize(600,600);
      
       // fin de moi
       
       // TODO: a modifier!!!
       //this.setLayout(new FlowLayout());
       
       //
       //this.setLayout(new BorderLayout(300,300));
       
       
 
       
       //this.add(grille);
       
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

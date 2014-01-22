/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geoanalytique.gui;

import geoanalytique.view.GeoAnalytiqueView;

import java.awt.Color;
import java.awt.Container;

import javax.swing.*;

/**
 * Classe representant l'interface graphique principale.
 * 
 * 
 */
public class GeoAnalytiqueGUI extends JPanel {

   private GeoAnalytiqueView grille;
   private JPanel panelGrille;

// Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btnCarre;
   private javax.swing.JButton btnCercle;
   private javax.swing.JButton btnDroite;
   private javax.swing.JButton btnElipse;
   private javax.swing.JButton btnRectangle;
   private javax.swing.JButton btnSegment;
   private javax.swing.JButton btnTriangle;
   private javax.swing.JMenuItem itemCarre;
   private javax.swing.JMenuItem itemCercle;
   private javax.swing.JMenuItem itemDoc;
   private javax.swing.JMenuItem itemDroite;
   private javax.swing.JMenuItem itemInit;
   private javax.swing.JMenuItem itemLicence;
   private javax.swing.JMenuItem itemNouveau;
   private javax.swing.JMenuItem itemRealiser;
   private javax.swing.JMenuItem itemSortir;
   private javax.swing.JMenuItem itemTheme;
   private javax.swing.JScrollPane jScrollPaneConsole;
   private javax.swing.JScrollPane jScrollPaneLog;
   private javax.swing.JPopupMenu.Separator jSeparator1;
   //private javax.swing.JPanel jpanelContainer;
   private javax.swing.JTabbedPane jtablePanel;
   private javax.swing.JMenu menuAide;
   private javax.swing.JMenu menuApropo;
   public javax.swing.JMenuBar menuBar;
   private javax.swing.JMenu menuDessin;
   private javax.swing.JMenu menuFichier;
   private javax.swing.JMenu menuForme;
   private javax.swing.JMenu menuPreference;
   private javax.swing.JPanel panelConsole;
   private javax.swing.JPanel panelLog;
   private javax.swing.JPanel panelOutil;
   private javax.swing.JPanel panelPropriete;
   private javax.swing.JPanel panelgauchePro;
   private javax.swing.JTabbedPane tablepanelGauche;
   private javax.swing.JTextArea textareLog;
   private javax.swing.JTextArea textareaConsole;
   private javax.swing.JToolBar toolbar;
   // End of variables declaration//GEN-END:variables

   private void initialisation(){
	   //this = new javax.swing.JPanel();
       toolbar = new javax.swing.JToolBar();
       btnCarre = new javax.swing.JButton();
       btnCercle = new javax.swing.JButton();
       btnDroite = new javax.swing.JButton();
       btnElipse = new javax.swing.JButton();
       btnSegment = new javax.swing.JButton();
       btnTriangle = new javax.swing.JButton();
       btnRectangle = new javax.swing.JButton();
       panelOutil = new javax.swing.JPanel();
       jtablePanel = new javax.swing.JTabbedPane();
       panelConsole = new javax.swing.JPanel();
       jScrollPaneConsole = new javax.swing.JScrollPane();
       textareaConsole = new javax.swing.JTextArea();
       panelLog = new javax.swing.JPanel();
       jScrollPaneLog = new javax.swing.JScrollPane();
       textareLog = new javax.swing.JTextArea();
       panelPropriete = new javax.swing.JPanel();
       
       panelGrille=new JPanel();
       grille = new GeoAnalytiqueView();
       
     
       
       tablepanelGauche = new javax.swing.JTabbedPane();
       panelgauchePro = new javax.swing.JPanel();
       menuBar = new javax.swing.JMenuBar();
       menuFichier = new javax.swing.JMenu();
       itemNouveau = new javax.swing.JMenuItem();
       jSeparator1 = new javax.swing.JPopupMenu.Separator();
       itemInit = new javax.swing.JMenuItem();
       itemSortir = new javax.swing.JMenuItem();
       menuForme = new javax.swing.JMenu();
       menuDessin = new javax.swing.JMenu();
       itemCarre = new javax.swing.JMenuItem();
       itemCercle = new javax.swing.JMenuItem();
       itemDroite = new javax.swing.JMenuItem();
       menuPreference = new javax.swing.JMenu();
       itemTheme = new javax.swing.JMenuItem();
       menuAide = new javax.swing.JMenu();
       itemDoc = new javax.swing.JMenuItem();
       menuApropo = new javax.swing.JMenu();
       itemRealiser = new javax.swing.JMenuItem();
       itemLicence = new javax.swing.JMenuItem();
       
       this.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 153, 255)));
       toolbar.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBox.highlight"));
       toolbar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)));
       toolbar.setFloatable(false);
       
       btnCarre.setText("Carre");
       btnCarre.setFocusable(false);
       btnCarre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
       btnCarre.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
       btnCarre.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               //btnCarreActionPerformed(evt);
           }
       });
       toolbar.add(btnCarre);

       btnCercle.setText("Cercle");
       btnCercle.setFocusable(false);
       btnCercle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
       btnCercle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
       btnCercle.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               //btnCercleActionPerformed(evt);
           }
       });
       toolbar.add(btnCercle);

       btnDroite.setText("Droite");
       btnDroite.setFocusable(false);
       btnDroite.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
       btnDroite.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
       btnDroite.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               //btnDroiteActionPerformed(evt);
           }
       });
       toolbar.add(btnDroite);

       btnElipse.setText("Elipse");
       btnElipse.setFocusable(false);
       btnElipse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
       btnElipse.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
       btnElipse.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               //btnElipseActionPerformed(evt);
           }
       });
       toolbar.add(btnElipse);

       btnSegment.setText("Segment");
       btnSegment.setFocusable(false);
       btnSegment.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
       btnSegment.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
       btnSegment.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               //btnSegmentActionPerformed(evt);
           }
       });
       toolbar.add(btnSegment);

       btnTriangle.setText("Triangle");
       btnTriangle.setFocusable(false);
       btnTriangle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
       btnTriangle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
       toolbar.add(btnTriangle);

       btnRectangle.setText("Rectangle");
       btnRectangle.setFocusable(false);
       btnRectangle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
       btnRectangle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
       btnRectangle.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               //btnRectangleActionPerformed(evt);
           }
       });
       toolbar.add(btnRectangle);
       
       panelOutil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
       
       //ajoute des element aux differents panel
       
       javax.swing.GroupLayout panelOutilLayout = new javax.swing.GroupLayout(panelOutil);
       panelOutil.setLayout(panelOutilLayout);
       panelOutilLayout.setHorizontalGroup(
           panelOutilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGap(0, 179, Short.MAX_VALUE)
       );
       panelOutilLayout.setVerticalGroup(
           panelOutilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGap(0, 0, Short.MAX_VALUE)
       );

       panelConsole.setBackground(new java.awt.Color(153, 153, 153));

       textareaConsole.setColumns(20);
       textareaConsole.setRows(5);
       jScrollPaneConsole.setViewportView(textareaConsole);

       javax.swing.GroupLayout panelConsoleLayout = new javax.swing.GroupLayout(panelConsole);
       panelConsole.setLayout(panelConsoleLayout);
       panelConsoleLayout.setHorizontalGroup(
           panelConsoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(panelConsoleLayout.createSequentialGroup()
               .addComponent(jScrollPaneConsole, javax.swing.GroupLayout.DEFAULT_SIZE, 919, Short.MAX_VALUE)
               .addContainerGap())
       );
       panelConsoleLayout.setVerticalGroup(
           panelConsoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(panelConsoleLayout.createSequentialGroup()
               .addContainerGap()
               .addComponent(jScrollPaneConsole, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
               .addContainerGap())
       );

       jtablePanel.addTab("Console", panelConsole);

       panelLog.setBackground(new java.awt.Color(255, 255, 255));

       textareLog.setColumns(20);
       textareLog.setRows(5);
       jScrollPaneLog.setViewportView(textareLog);

       javax.swing.GroupLayout panelLogLayout = new javax.swing.GroupLayout(panelLog);
       panelLog.setLayout(panelLogLayout);
       panelLogLayout.setHorizontalGroup(
           panelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(panelLogLayout.createSequentialGroup()
               .addContainerGap()
               .addComponent(jScrollPaneLog, javax.swing.GroupLayout.DEFAULT_SIZE, 919, Short.MAX_VALUE))
       );
       panelLogLayout.setVerticalGroup(
           panelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLogLayout.createSequentialGroup()
               .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jScrollPaneLog, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addGap(34, 34, 34))
       );

       jtablePanel.addTab("Log", panelLog);

       panelPropriete.setBackground(new java.awt.Color(231, 234, 234));

       javax.swing.GroupLayout panelProprieteLayout = new javax.swing.GroupLayout(panelPropriete);
       panelPropriete.setLayout(panelProprieteLayout);
       panelProprieteLayout.setHorizontalGroup(
           panelProprieteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGap(0, 929, Short.MAX_VALUE)
       );
       panelProprieteLayout.setVerticalGroup(
           panelProprieteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGap(0, 84, Short.MAX_VALUE)
       );

       jtablePanel.addTab("Propriétés", panelPropriete);

       panelGrille.setBackground(Color.WHITE);
       panelGrille.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Zone de Dessin", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 11), new java.awt.Color(255, 0, 0))); // NOI18N
       //panelGrille.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
       panelGrille.setPreferredSize(new java.awt.Dimension(800, 550));

       /*javax.swing.GroupLayout panelGrilleLayout = new javax.swing.GroupLayout(panelGrille);
       panelGrille.setLayout(panelGrilleLayout);
       panelGrilleLayout.setHorizontalGroup(
           panelGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGap(0, 688, Short.MAX_VALUE)
       );
       panelGrilleLayout.setVerticalGroup(
           panelGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGap(0, 0, Short.MAX_VALUE)
       );*/
       javax.swing.GroupLayout panelGrilleLayout = new javax.swing.GroupLayout(panelGrille);
       panelGrille.setLayout(panelGrilleLayout);
       panelGrilleLayout.setHorizontalGroup(
           panelGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGrilleLayout.createSequentialGroup()
               .addContainerGap()
               .addComponent(grille, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addContainerGap())
       );
       panelGrilleLayout.setVerticalGroup(
           panelGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(panelGrilleLayout.createSequentialGroup()
               .addComponent(grille, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addContainerGap())
       );

       panelgauchePro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

       javax.swing.GroupLayout panelgaucheProLayout = new javax.swing.GroupLayout(panelgauchePro);
       panelgauchePro.setLayout(panelgaucheProLayout);
       panelgaucheProLayout.setHorizontalGroup(
           panelgaucheProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGap(0, 229, Short.MAX_VALUE)
       );
       panelgaucheProLayout.setVerticalGroup(
           panelgaucheProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGap(0, 668, Short.MAX_VALUE)
       );

       tablepanelGauche.addTab("Propriete", panelgauchePro);

       javax.swing.GroupLayout jpanelContainerLayout = new javax.swing.GroupLayout(this);
       this.setLayout(jpanelContainerLayout);
       jpanelContainerLayout.setHorizontalGroup(
           jpanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addComponent(toolbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
           .addGroup(jpanelContainerLayout.createSequentialGroup()
               .addComponent(panelOutil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
               .addGroup(jpanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                   .addGroup(jpanelContainerLayout.createSequentialGroup()
                       .addComponent(jtablePanel)
                       .addGap(10, 10, 10))
                   .addGroup(jpanelContainerLayout.createSequentialGroup()
                       .addComponent(panelGrille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                       .addComponent(tablepanelGauche))))
       );
       jpanelContainerLayout.setVerticalGroup(
           jpanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(jpanelContainerLayout.createSequentialGroup()
               .addComponent(toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
               .addGroup(jpanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                   .addGroup(jpanelContainerLayout.createSequentialGroup()
                       .addGroup(jpanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(panelGrille, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE,javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(tablepanelGauche))
                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                       .addComponent(jtablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                   .addComponent(panelOutil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
       );
       
       //gestion cote menu
       menuBar.setBackground(new java.awt.Color(255, 255, 255));

       menuFichier.setText("Fichier");

       itemNouveau.setText("Nouveau");
       itemNouveau.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               //itemNouveauActionPerformed(evt);
           }
       });
       menuFichier.add(itemNouveau);
       menuFichier.add(jSeparator1);

       itemInit.setText("Initialiser");
       itemInit.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               //itemInitActionPerformed(evt);
           }
       });
       menuFichier.add(itemInit);

       itemSortir.setText("Sortir");
       itemSortir.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               //itemSortirActionPerformed(evt);
           }
       });
       menuFichier.add(itemSortir);

       menuBar.add(menuFichier);

       menuForme.setText("Formes");

       menuDessin.setText("Dessiner");

       itemCarre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
       itemCarre.setText("Un Carré");
       itemCarre.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               //itemCarreActionPerformed(evt);
           }
       });
       menuDessin.add(itemCarre);

       itemCercle.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
       itemCercle.setText("Un Cercle");
       itemCercle.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               //itemCercleActionPerformed(evt);
           }
       });
       menuDessin.add(itemCercle);

       itemDroite.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
       itemDroite.setText("Une Droite");
       itemDroite.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               //itemDroiteActionPerformed(evt);
           }
       });
       menuDessin.add(itemDroite);

       menuForme.add(menuDessin);

       menuBar.add(menuForme);

       menuPreference.setText("Préférences");

       itemTheme.setText("Changer Theme");
       menuPreference.add(itemTheme);

       menuBar.add(menuPreference);

       menuAide.setText("Aide");

       itemDoc.setText("Documentation");
       itemDoc.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               //itemDocActionPerformed(evt);
           }
       });
       menuAide.add(itemDoc);

       menuBar.add(menuAide);

       menuApropo.setText("A propos");

       itemRealiser.setText("Realiser par");
       menuApropo.add(itemRealiser);

       itemLicence.setText("Licence");
       menuApropo.add(itemLicence);

       menuBar.add(menuApropo);

   }
   
   
   
   public GeoAnalytiqueGUI() {
       
   
     this.initialisation();
      //grille.setSize(700,500);
      
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

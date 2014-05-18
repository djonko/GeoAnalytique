/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geoanalytique.gui;

import geoanalytique.view.GeoAnalytiqueView;

import java.awt.Color;
import java.awt.Container;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.UIManager;


/**
 * Classe representant l'interface graphique principale.
 * 
 * 
 */
@SuppressWarnings("serial")
public class GeoAnalytiqueGUI extends JPanel {

   private GeoAnalytiqueView grille;
   private JPanel panelGrille;
   private JButton btnCarre;
   private JButton btnZomPlus;
   private OperationJMenuItem operationJMenuItem;



private  JButton btnZomMoin;
   private  JButton btnCercle;
   private  JButton btnDroite;
   private  JButton btnElipse;
   private  JButton btnRectangle;
   private  JButton btnSegment;
   private  JButton btnTriangle;
   private  JMenuItem itemCarre;
   private  JMenuItem itemCercle;
   private  JMenuItem itemDoc;
   private  JMenuItem itemDroite;
   private  JMenuItem itemInit;
   private  JMenuItem itemLicence;
   private  JMenuItem itemNouveau;
   private  JMenuItem itemRealiser;
   private  JMenuItem itemSortir;
   private  JMenuItem itemTheme;
   private  JScrollPane jScrollPaneConsole;
   private  JScrollPane jScrollPaneLog;
   private  JPopupMenu.Separator jSeparator1;
   //private  JPanel jpanelContainer;
   private  JTabbedPane jtablePanel;
   private JPopupMenu popupMenu;
   private  JMenu menuAide;
   private  JMenu menuApropo;
   public  JMenuBar menuBar;
   private  JMenu menuDessin;
   private  JMenu menuFichier;
   private  JMenu menuForme;
   private  JMenu menuPreference;
   private  JPanel panelConsole;
   private  JPanel panelLog;
   private  JPanel panelOutil;
   private  JPanel panelPropriete;
   private  JScrollPane jScrollPanelProprie;
   private  JTextArea textarePropriete;
   private  JPanel panelgauchePro;
   private  JTabbedPane tablepanelGauche;
   private  JTextArea textareLog;
   private  JTextArea textareaConsole;
   private  JToolBar toolbar;
private JMenuItem itemOpen;
private JMenuItem itemSave;


private void initialisation(){
       toolbar = new  JToolBar();
       btnCarre = new  JButton();
       btnZomPlus=new JButton();
       btnZomMoin=new JButton();
       btnCercle = new  JButton();
       btnDroite = new  JButton();
       btnElipse = new  JButton();
       btnSegment = new  JButton();
       btnTriangle = new  JButton();
       btnRectangle = new  JButton();
       panelOutil = new  JPanel();
       jtablePanel = new  JTabbedPane();
       panelConsole = new  JPanel();
       jScrollPaneConsole = new  JScrollPane();
       textareaConsole = new  JTextArea();
       panelLog = new  JPanel();
       jScrollPaneLog = new  JScrollPane();
       jScrollPanelProprie = new  JScrollPane();
       textareLog = new  JTextArea();
       textarePropriete = new  JTextArea();
       panelPropriete = new  JPanel();
       
       panelGrille=new JPanel();
       grille = new GeoAnalytiqueView();
       operationJMenuItem=new OperationJMenuItem();
     
       
       tablepanelGauche = new  JTabbedPane();
       panelgauchePro = new  JPanel();
       popupMenu= new JPopupMenu();
       menuBar = new  JMenuBar();
       menuFichier = new  JMenu();
       itemNouveau = new  JMenuItem();
       itemOpen = new  JMenuItem();
       itemSave = new  JMenuItem();
       jSeparator1 = new  JPopupMenu.Separator();
       itemInit = new  JMenuItem();
       itemSortir = new  JMenuItem();
       menuForme = new  JMenu();
       menuDessin = new  JMenu();
       itemCarre = new  JMenuItem();
       itemCercle = new  JMenuItem();
       itemDroite = new  JMenuItem();
       menuPreference = new  JMenu();
       itemTheme = new  JMenuItem();
       menuAide = new  JMenu();
       itemDoc = new  JMenuItem();
       menuApropo = new  JMenu();
       itemRealiser = new  JMenuItem();
       itemLicence = new  JMenuItem();
       
       this.setBorder( BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 153, 255)));
       toolbar.setBackground( UIManager.getDefaults().getColor("CheckBox.highlight"));
       toolbar.setBorder( BorderFactory.createCompoundBorder( BorderFactory.createEtchedBorder(),  BorderFactory.createEmptyBorder(1, 1, 1, 1)));
       toolbar.setFloatable(false);
       
       
       
       btnCarre.setText("Carre");
       btnCarre.setFocusable(false);
       btnCarre.setHorizontalTextPosition( SwingConstants.CENTER);
       btnCarre.setVerticalTextPosition( SwingConstants.BOTTOM);

       toolbar.add(btnCarre);

       btnCercle.setText("Cercle");
       btnCercle.setFocusable(false);
       btnCercle.setHorizontalTextPosition( SwingConstants.CENTER);
       btnCercle.setVerticalTextPosition( SwingConstants.BOTTOM);

       toolbar.add(btnCercle);

       btnDroite.setText("Droite");
       btnDroite.setFocusable(false);
       btnDroite.setHorizontalTextPosition( SwingConstants.CENTER);
       btnDroite.setVerticalTextPosition( SwingConstants.BOTTOM);

       toolbar.add(btnDroite);

       btnElipse.setText("Ellipse");
       btnElipse.setFocusable(false);
       btnElipse.setHorizontalTextPosition( SwingConstants.CENTER);
       btnElipse.setVerticalTextPosition( SwingConstants.BOTTOM);
       toolbar.add(btnElipse);

       btnSegment.setText("Segment");
       btnSegment.setFocusable(false);
       btnSegment.setHorizontalTextPosition( SwingConstants.CENTER);
       btnSegment.setVerticalTextPosition( SwingConstants.BOTTOM);

       toolbar.add(btnSegment);

       btnTriangle.setText("Triangle");
       btnTriangle.setFocusable(false);
       btnTriangle.setHorizontalTextPosition( SwingConstants.CENTER);
       btnTriangle.setVerticalTextPosition( SwingConstants.BOTTOM);
       toolbar.add(btnTriangle);

       btnRectangle.setText("Rectangle");
       btnRectangle.setFocusable(false);
       btnRectangle.setHorizontalTextPosition( SwingConstants.CENTER);
       btnRectangle.setVerticalTextPosition( SwingConstants.BOTTOM);

       toolbar.add(btnRectangle);
       
       btnZomPlus.setText("Zoom +");
       btnZomPlus.setFocusable(false);
       btnZomPlus.setHorizontalTextPosition( SwingConstants.CENTER);
       btnZomPlus.setVerticalTextPosition( SwingConstants.BOTTOM);

       toolbar.add(btnZomPlus);
       
       btnZomMoin.setText("Zoom -");
       btnZomMoin.setFocusable(false);
       btnZomMoin.setHorizontalTextPosition( SwingConstants.CENTER);
       btnZomMoin.setVerticalTextPosition( SwingConstants.BOTTOM);
       toolbar.add(btnZomMoin);
       
       panelOutil.setBorder( BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
       
       //ajoute des element aux differents panel
       
        GroupLayout panelOutilLayout = new  GroupLayout(panelOutil);
       panelOutil.setLayout(panelOutilLayout);
       panelOutilLayout.setHorizontalGroup(
           panelOutilLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
           .addGap(0, 179, Short.MAX_VALUE)
       );
       panelOutilLayout.setVerticalGroup(
           panelOutilLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
           .addGap(0, 0, Short.MAX_VALUE)
       );

       panelConsole.setBackground(new java.awt.Color(153, 153, 153));

       textareaConsole.setColumns(20);
       textareaConsole.setRows(5);
       textareaConsole.setText("Console GeoAnalytique v1.0 !!! \n");
       jScrollPaneConsole.setViewportView(textareaConsole);

        GroupLayout panelConsoleLayout = new  GroupLayout(panelConsole);
       panelConsole.setLayout(panelConsoleLayout);
       panelConsoleLayout.setHorizontalGroup(
           panelConsoleLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
           .addGroup(panelConsoleLayout.createSequentialGroup()
               .addComponent(jScrollPaneConsole,  GroupLayout.DEFAULT_SIZE, 919, Short.MAX_VALUE)
               .addContainerGap())
       );
       panelConsoleLayout.setVerticalGroup(
           panelConsoleLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
           .addGroup(panelConsoleLayout.createSequentialGroup()
               .addContainerGap()
               .addComponent(jScrollPaneConsole,  GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
               .addContainerGap())
       );

       jtablePanel.addTab("Console", panelConsole);

       panelLog.setBackground(new java.awt.Color(255, 255, 255));

       textareLog.setColumns(20);
       textareLog.setRows(5);
       jScrollPaneLog.setViewportView(textareLog);

        GroupLayout panelLogLayout = new  GroupLayout(panelLog);
       panelLog.setLayout(panelLogLayout);
       panelLogLayout.setHorizontalGroup(
           panelLogLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
           .addGroup(panelLogLayout.createSequentialGroup()
               .addContainerGap()
               .addComponent(jScrollPaneLog,  GroupLayout.DEFAULT_SIZE, 919, Short.MAX_VALUE))
       );
       panelLogLayout.setVerticalGroup(
           panelLogLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
           .addGroup( GroupLayout.Alignment.TRAILING, panelLogLayout.createSequentialGroup()
               .addContainerGap( GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jScrollPaneLog,  GroupLayout.PREFERRED_SIZE, 62,  GroupLayout.PREFERRED_SIZE)
               .addGap(34, 34, 34))
       );

       jtablePanel.addTab("Log", panelLog);

       panelPropriete.setBackground(new java.awt.Color(231, 234, 234));
       panelPropriete.setLayout(new java.awt.BorderLayout());

       textarePropriete.setColumns(20);
       textarePropriete.setRows(5);
       textarePropriete.setText("La liste des proprietes de la figure :\n");
       jScrollPanelProprie.setViewportView(textarePropriete);

       panelPropriete.add(jScrollPanelProprie, java.awt.BorderLayout.CENTER);
       
       //soit un gestionnaire border ou group
     /*   GroupLayout panelProprieteLayout = new  GroupLayout(panelPropriete);
       panelPropriete.setLayout(panelProprieteLayout);
       panelProprieteLayout.setHorizontalGroup(
           panelProprieteLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
           .addGap(0, 929, Short.MAX_VALUE)
       );
       panelProprieteLayout.setVerticalGroup(
           panelProprieteLayout.createParallelGroup( GroupLayout.Alignment.LEADING)
           .addGap(0, 84, Short.MAX_VALUE)
       );*/

       jtablePanel.addTab("Propriétés", panelPropriete);

       panelGrille.setBackground(Color.WHITE);
       panelGrille.setBorder(BorderFactory.createTitledBorder(null, "Zone de Dessin", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 11), new java.awt.Color(255, 0, 0))); // NOI18N
       //panelGrille.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
       panelGrille.setPreferredSize(new java.awt.Dimension(544,544));

       /*GroupLayout panelGrilleLayout = new GroupLayout(panelGrille);
       panelGrille.setLayout(panelGrilleLayout);
       panelGrilleLayout.setHorizontalGroup(
           panelGrilleLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
           .addGap(0, 688, Short.MAX_VALUE)
       );
       panelGrilleLayout.setVerticalGroup(
           panelGrilleLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
           .addGap(0, 0, Short.MAX_VALUE)
       );*/
       GroupLayout panelGrilleLayout = new GroupLayout(panelGrille);
       panelGrille.setLayout(panelGrilleLayout);
       panelGrilleLayout.setHorizontalGroup(
           panelGrilleLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
           .addGroup(GroupLayout.Alignment.TRAILING, panelGrilleLayout.createSequentialGroup()
               .addContainerGap()
               .addComponent(grille, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
               .addContainerGap())
       );
       panelGrilleLayout.setVerticalGroup(
           panelGrilleLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
           .addGroup(panelGrilleLayout.createSequentialGroup()
               .addComponent(grille, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
               .addContainerGap())
       );

       panelgauchePro.setBorder(BorderFactory.createEtchedBorder());

       GroupLayout panelgaucheProLayout = new GroupLayout(panelgauchePro);
       panelgauchePro.setLayout(panelgaucheProLayout);
       panelgaucheProLayout.setHorizontalGroup(
           panelgaucheProLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
           .addGap(0, 229, Short.MAX_VALUE)
       );
       panelgaucheProLayout.setVerticalGroup(
           panelgaucheProLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
           .addGap(0, 668, Short.MAX_VALUE)
       );

       tablepanelGauche.addTab("Propriete", panelgauchePro);

       GroupLayout jpanelContainerLayout = new GroupLayout(this);
       this.setLayout(jpanelContainerLayout);
       jpanelContainerLayout.setHorizontalGroup(
           jpanelContainerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
           .addComponent(toolbar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
           .addGroup(jpanelContainerLayout.createSequentialGroup()
               .addComponent(panelOutil, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
               .addGroup(jpanelContainerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                   .addGroup(jpanelContainerLayout.createSequentialGroup()
                       .addComponent(jtablePanel)
                       .addGap(10, 10, 10))
                   .addGroup(jpanelContainerLayout.createSequentialGroup()
                       .addComponent(panelGrille, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                       .addComponent(tablepanelGauche))))
       );
       jpanelContainerLayout.setVerticalGroup(
           jpanelContainerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
           .addGroup(jpanelContainerLayout.createSequentialGroup()
               .addComponent(toolbar, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
               .addGroup(jpanelContainerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                   .addGroup(jpanelContainerLayout.createSequentialGroup()
                       .addGroup(jpanelContainerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                           .addComponent(panelGrille, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE)
                           .addComponent(tablepanelGauche))
                       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                       .addComponent(jtablePanel, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
                   .addComponent(panelOutil, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
       );
       
       //gestion cote menu
       menuBar.setBackground(new java.awt.Color(255, 255, 255));

       menuFichier.setText("Fichier");

       itemNouveau.setText("Nouveau");
       itemOpen.setText("Ouvrir");
       itemSave.setText("Enregistrer");
       
       //menuFichier.add(itemNouveau);
       menuFichier.add(itemOpen);
       menuFichier.add(itemSave);
       menuFichier.add(jSeparator1);

       itemInit.setText("Initialiser");
       menuFichier.add(itemInit);

       itemSortir.setText("Sortir");
;
       menuFichier.add(itemSortir);
       ///////////////////////////////////////////////////////////////////////////////////////////////////
       popupMenu.setBackground(new java.awt.Color(255, 255, 255));
      
       menuBar.add(menuFichier);

       menuForme.setText("Formes");

       menuDessin.setText("Dessiner");

       itemCarre.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
       itemCarre.setText("Un Carré");
       menuDessin.add(itemCarre);

       itemCercle.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
       itemCercle.setText("Un Cercle");

       menuDessin.add(itemCercle);

       itemDroite.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
       itemDroite.setText("Une Droite");

       menuDessin.add(itemDroite);

       menuForme.add(menuDessin);

       menuBar.add(menuForme);

       menuPreference.setText("Préférences");

       itemTheme.setText("Changer Theme");
       menuPreference.add(itemTheme);

       menuBar.add(menuPreference);

       menuAide.setText("Aide");

       itemDoc.setText("Documentation");

       menuAide.add(itemDoc);

       menuBar.add(menuAide);

       menuApropo.setText("A propos");

       itemRealiser.setText("Realiser par");
       menuApropo.add(itemRealiser);

       itemLicence.setText("Licence");
       menuApropo.add(itemLicence);

       menuBar.add(menuApropo);

   }
   
   
   
   public JScrollPane getjScrollPanelProprie() {
	return jScrollPanelProprie;
}



public JMenuItem getItemOpen() {
	return itemOpen;
}



public JMenuItem getItemSave() {
	return itemSave;
}



public void setjScrollPanelProprie(JScrollPane jScrollPanelProprie) {
	this.jScrollPanelProprie = jScrollPanelProprie;
}



public JTextArea getTextarePropriete() {
	return textarePropriete;
}



public void setTextarePropriete(JTextArea textarePropriete) {
	this.textarePropriete = textarePropriete;
}



public GeoAnalytiqueGUI() {
       
   
     this.initialisation();
      //grille.setSize(600,600);
      
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

    
    
    public GeoAnalytiqueView getGrille() {
    	return grille;
    }



    public JPanel getPanelGrille() {
    	return panelGrille;
    }



    public JButton getBtnCarre() {
    	return btnCarre;
    }



    public JButton getBtnCercle() {
    	return btnCercle;
    }



    public JButton getBtnDroite() {
    	return btnDroite;
    }



    public JButton getBtnElipse() {
    	return btnElipse;
    }



    public JButton getBtnRectangle() {
    	return btnRectangle;
    }



    public JButton getBtnSegment() {
    	return btnSegment;
    }



    public JButton getBtnTriangle() {
    	return btnTriangle;
    }



    public JMenuItem getItemCarre() {
    	return itemCarre;
    }



    public JMenuItem getItemCercle() {
    	return itemCercle;
    }



    public JMenuItem getItemDoc() {
    	return itemDoc;
    }



    public JMenuItem getItemDroite() {
    	return itemDroite;
    }



    public JMenuItem getItemInit() {
    	return itemInit;
    }



    public JMenuItem getItemLicence() {
    	return itemLicence;
    }



    public JMenuItem getItemNouveau() {
    	return itemNouveau;
    }



    public JMenuItem getItemRealiser() {
    	return itemRealiser;
    }



    public JMenuItem getItemSortir() {
    	return itemSortir;
    }



    public JMenuItem getItemTheme() {
    	return itemTheme;
    }



    public JScrollPane getjScrollPaneConsole() {
    	return jScrollPaneConsole;
    }



    public JScrollPane getjScrollPaneLog() {
    	return jScrollPaneLog;
    }



    public JPopupMenu.Separator getjSeparator1() {
    	return jSeparator1;
    }



    public JTabbedPane getJtablePanel() {
    	return jtablePanel;
    }



    public JMenu getMenuAide() {
    	return menuAide;
    }



    public JMenu getMenuApropo() {
    	return menuApropo;
    }



    public JMenuBar getMenuBar() {
    	return menuBar;
    }



    public JMenu getMenuDessin() {
    	return menuDessin;
    }



    public JMenu getMenuFichier() {
    	return menuFichier;
    }



    public JMenu getMenuForme() {
    	return menuForme;
    }



    public JMenu getMenuPreference() {
    	return menuPreference;
    }



    public JPanel getPanelConsole() {
    	return panelConsole;
    }



    public JPanel getPanelLog() {
    	return panelLog;
    }



    public JPanel getPanelOutil() {
    	return panelOutil;
    }



    public JPanel getPanelPropriete() {
    	return panelPropriete;
    }



    public JPanel getPanelgauchePro() {
    	return panelgauchePro;
    }



    public JTextArea getTextareLog() {
    	return textareLog;
    }



    public JTextArea getTextareaConsole() {
    	return textareaConsole;
    }



    public JToolBar getToolbar() {
    	return toolbar;
    }
    public JButton getBtnZomPlus() {
    	return btnZomPlus;
    }

    public JButton getBtnZomMoin() {
    	return btnZomMoin;
    }



	public JPopupMenu getPopupMenu() {
		return popupMenu;
	}



	public void setPopupMenu(JPopupMenu popupMenu) {
		this.popupMenu = popupMenu;
	}



	public OperationJMenuItem getOperationJMenuItem() {
		return operationJMenuItem;
	}



	public void setOperationJMenuItem(OperationJMenuItem operationJMenuItem) {
		this.operationJMenuItem = operationJMenuItem;
	}
}

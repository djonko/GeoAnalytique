package geoanalytique;

import java.awt.event.*;

import javax.swing.*;

public class Menu{

	public JMenuBar setMenu(){
		return this.creeMenu();
	}
	
	
	private JMenuBar creeMenu(){
		JMenuBar menubar =new JMenuBar();
		
		
		//les menus
		JMenu menu=new JMenu("Fichier");
		JMenu menu4=new JMenu("Forme");
		JMenu menu2=new JMenu("Edition");
		JMenu menu3=new JMenu("Aide");
		
		JMenuItem quitter=new JMenuItem("Quitter");
		
		quitter.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
			System.exit(0);
			}
			});
		
		//Item
		menu.add(new JMenuItem("dimension"));
		menu.addSeparator();
		menu.add(quitter);
		
		//relier menubar et menu
		menubar.add(menu);
		menubar.add(menu4);
		menubar.add(menu2);
		menubar.add(menu3);
		
		return menubar;
	}
	
}

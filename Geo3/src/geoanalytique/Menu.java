package geoanalytique;

import javax.swing.*;

public class Menu{

	public JMenuBar setMenu(){
		return this.creeMenu();
	}
	
	
	private JMenuBar creeMenu(){
		JMenuBar menubar =new JMenuBar();
		
		
		//les menus
		JMenu menu=new JMenu("Fichier");
		JMenu menu2=new JMenu("Edition");
		JMenu menu3=new JMenu("Aide");
		
		
		//Item
		menu.add(new JMenuItem("dimension"));
		
		//relier menubar et menu
		menubar.add(menu);
		menubar.add(menu2);
		menubar.add(menu3);
		
		return menubar;
	}
	
}
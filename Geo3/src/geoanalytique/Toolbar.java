package geoanalytique;

import java.awt.*;

import javax.swing.*;

public class Toolbar extends JToolBar {

	private JToolBar toolBar = new JToolBar();
	//Les boutons de la barre d'outils
	private JButton
	play = new JButton(new ImageIcon("image/play.jpg")),
	cancel = new JButton(new ImageIcon("image/stop.jpg")),
	square = new JButton(new ImageIcon("image/carré.jpg")),
	tri = new JButton(new ImageIcon("image/triangle.jpg")),
	circle = new JButton(new ImageIcon("image/rond.jpg")),
	star = new JButton(new ImageIcon("image/étoile.jpg"));
	private Color fondBouton = Color.white;
	
	public void initToolBar(){
		this.cancel.setEnabled(false);
		//this.cancel.addActionListener(stopAnimation);
		this.cancel.setBackground(fondBouton);
		//this.play.addActionListener(startAnimation);
		this.play.setBackground(fondBouton);
		this.toolBar.add(play);
		this.toolBar.add(cancel);
		this.toolBar.addSeparator();
		//Ajout des Listeners
		//this.circle.addActionListener(fListener);
		this.circle.setBackground(fondBouton);
		this.toolBar.add(circle);
		//this.square.addActionListener(fListener);
		this.square.setBackground(fondBouton);
		this.toolBar.add(square);
		this.tri.setBackground(fondBouton);
		//this.tri.addActionListener(fListener);
		this.toolBar.add(tri);
		this.star.setBackground(fondBouton);
		//this.star.addActionListener(fListener);
		this.toolBar.add(star);
		}
	public Toolbar(){
		this.initToolBar();
	}
		
}


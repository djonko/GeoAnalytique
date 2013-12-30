package geoanalytique.graphique;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Graphique permettant d'afficher un texte dans une zone de dessin
 * 
 * @see Graphics#drawString(java.lang.String, int, int) 
 */
public class GTexte extends Graphique {
    
	private int x;
	private int y;
	private String txt;
	
    public GTexte(int x, int y, String txt, Color color) {
        // TODO: a completer
    	this.x=x;
    	this.y=y;
    	this.txt=txt;
    	this.color=color;
    	
    }
    
    public GTexte(int x, int y, String txt) {
        // TODO: a completer
    	this.x=x;
    	this.y=y;
    	this.txt=txt;
    	this.color=Color.BLUE;
    }
     
    
    /**
     * * @see Graphics#drawString(java.lang.String, int, int) 
     */
	@Override
	public void paint(Graphics g) {
		// TODO: a completer
		Color save=g.getColor();
		g.setColor(this.color);
		g.drawString(this.txt,this.x,this.y);
		g.setColor(save);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getTxt() {
		return txt;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}
}

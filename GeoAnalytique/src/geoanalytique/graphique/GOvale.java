package geoanalytique.graphique;
 
import java.awt.Color;
import java.awt.Graphics;

/**
 * Objet graphique permettant de dessiner un ovale quelconque a la Java
 * (ellipse ou cercle).
 * 
 * 
 * @see java.awt.Graphics#drawOval(int, int, int, int) 
 */
public class GOvale extends Graphique {
	/**
	 * 
	 */
	private int x;
	private int y;
	private int w;
	private int h;
	
	public GOvale(int x,int y,int w,int h, Color color) {
            // TODO: a completer
		this.x=x;
		this.y=y;
		this.w=w;
		this.h=h;
		this.color=color;
		
	}

	/**
	 * @see geoanalytique.graphique.Graphique#paint(java.awt.Graphics)
         * @see java.awt.Graphics#drawOval(int, int, int, int) 
	 */
	@Override
	public void paint(Graphics g) {
            // TODO: a completer
		Color save = g.getColor();
		g.setColor(color);
		g.drawOval(x,y,w,h);
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

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

}

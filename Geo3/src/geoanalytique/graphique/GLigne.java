package geoanalytique.graphique;

import java.awt.Color;
import java.awt.Graphics;
 
/**
 * Objet permettant de tracer des lignes sur le canevas.
 * 
 */
public class GLigne extends Graphique {
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    public GLigne(int x1, int y1, int x2, int y2) {
        // TODO: a completer
    	super.color=Color.BLUE;
    	this.x1=x1;this.x2=x2;this.y1=y1;this.y2=y2;
    	
    }
    
    public GLigne(int x1, int y1, int x2, int y2, Color color) {
        // TODO: a completer
    	super.setCouleur(color);
    	this.x1=x1;this.x2=x2;this.y1=y1;this.y2=y2;
    }
    
    @Override
    public boolean equals(Object o) {
        // TODO: a completer
    	boolean t=false;
    	if(o!=null && o instanceof GLigne ){
    		 GLigne l=(GLigne)o;
    		 if(l.getX1()==this.x1 && l.getX2()==this.x2 && l.getY1()==this.y1 && l.getY2()==this.y2){
    			 t= true;
    		 }
    	}
    		
        return t;
    }
    
    

	

	@Override
    public void setCouleur(Color c) {
    	// TODO: a completer
    	super.setCouleur(c);
    }

	@Override
	public void paint(Graphics g) {
		// TODO: a completer
		Color save=g.getColor();
		g.setColor(this.color);
		g.drawLine(this.x1,this.y1,this.x2,this.y2);
		g.setColor(save);
		
	}
	
	public String toString() {
		// TODO: a completer
            return null;
	}
	
	public int  getX1(){
		return x1;
	}
	public int getX2() {
		return x2;
	}
	private int getY2() {
		return this.y2;
	}

	private int getY1() {
		return this.y2;
	}
}

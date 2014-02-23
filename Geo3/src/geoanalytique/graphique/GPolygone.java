package geoanalytique.graphique;

import java.awt.Color;
import java.awt.Graphics;

public class GPolygone extends Graphique{

	private int tabX[];
	private int tabY[];
	private int nb;
	private String[] tabStr={"A","B","C","D","E","F"};;
	
	public GPolygone(int x[],int y[],int nb){
		super.color=Color.cyan;
		tabX=x;
		tabY=y;
		this.setNb(nb);
	}
	
	public GPolygone(int x[],int y[],int nb,Color c){
		super.color=c;
		tabX=x;
		tabY=y;
		this.setNb(nb);

	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		//g.drawPolygon(this.tabX,this.tabY,this.nb);
		for(int i=0;i<tabX.length;i++){
			if(i!=tabX.length-1){
				g.setColor(this.getCouleur());
				g.drawLine(tabX[i],tabY[i],tabX[i+1],tabY[i+1]);
				g.setColor(Color.red);
				g.drawString(this.tabStr[i],tabX[i], tabY[i]);
				g.setColor(this.getCouleur());
			}else{
				g.setColor(this.getCouleur());
				g.drawLine(tabX[0],tabY[0],tabX[i],tabY[i]);
				
				g.setColor(Color.red);
				g.drawString(this.tabStr[i],tabX[i], tabY[i]);
			}
		}
		
	}

	public int[] getTabX() {
		return tabX;
	}

	public void setTabX(int tabX[]) {
		this.tabX = tabX;
	}

	public int[] getTabY() {
		return tabY;
	}

	public void setTabY(int tabY[]) {
		this.tabY = tabY;
	}

	public int getNb() {
		return nb;
	}

	public void setNb(int nb) {
		this.nb = nb;
	}

}

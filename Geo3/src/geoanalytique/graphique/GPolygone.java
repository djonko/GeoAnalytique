package geoanalytique.graphique;

import java.awt.Color;
import java.awt.Graphics;

public class GPolygone extends Graphique{

	private int tabX[];
	private int tabY[];
	private int nb;
	
	public GPolygone(int x[],int y[],int nb){
		super.color=Color.green;
		tabX=x;
		tabY=y;
		this.nb=nb;
	}
	
	public GPolygone(int x[],int y[],int nb,Color c){
		super.color=c;
		tabX=x;
		tabY=y;
		this.nb=nb;
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		//g.drawPolygon(this.tabX,this.tabY,this.nb);
		for(int i=0;i<tabX.length;i++){
			if(i!=tabX.length-1){
				g.drawLine(tabX[i],tabY[i],tabX[i+1],tabY[i+1]);
			}else{
				g.drawLine(tabX[0],tabY[0],tabX[i],tabY[i]);
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

}

package geoanalytique.util;

import java.util.ArrayList;
import java.util.List;

import geoanalytique.controleur.GeoAnalytiqueControleur;
import geoanalytique.gui.containerPropriete;
import geoanalytique.model.Point;

public class CreeGeoObject {
	private GeoAnalytiqueControleur controleur;
	public Object[][] data;
	public String[] tilte;
	private String figure;
	
	
	
	public CreeGeoObject(GeoAnalytiqueControleur controleur){
		this.controleur=controleur;
	}
	
	public ArrayList<Point> creeFigure(containerPropriete panelPropriete){
		ArrayList<Point> arg=new ArrayList<Point>();
		Point p;
		double[] coordonnee=new double[2];
		int taille=panelPropriete.jtableChamp.getModel().getRowCount();
		String valeur,name="null";
		if(taille > 1){
			for(int i=0;i<taille;i++){
				valeur=(String) panelPropriete.jtableChamp.getModel().getValueAt(i,1);
				if(i==0)
					name=valeur;
				else{
					coordonnee=this.spite(valeur);
					p=new Point(name,coordonnee[0],coordonnee[1],this.controleur);
					this.controleur.addObjet(p);
					arg.add(p);
				}
			}
		}
		
		
		
		return arg;
	}
	
	//renvoie un tableau de double dimension 2 c a d x et y dun point  
	private double[] spite(String ch){
		double[] t=new double[2];
		t[0]=0.0;t[1]=0.0;
		if(ch!=null){
			String[] split = ch.split("/");
			for(int i=0;i<split.length;i++){
				t[i]=Double.parseDouble(split[i]);
			}
		}
		return t;
	}
	//prends en parametre 1 string et renvoie une liste de 2 element:1data 2entete, pour remplire le jtable de reation de figure
	

	public void donneeJtable(String figure){
		
		if(figure=="triangle"){
			data =new Object [][] {
	                {"nom","triangle1"},
	                {"Point1 x/y","2/2"},
	                {"point2 x/y","2/6"},
	                {"point3 x/y","6/6"}
	            };
	        tilte=new String [] {
	                "triangle", "Valeurs"
	            };
		}else if(figure=="cercle"){
			data =new Object [][] {
	                {"nom","cercle1"},
	                {"Centre x/y","2/2"},
	                {"rayon x/y","2/4"}
	            };
	        tilte=new String [] {
	                "cercle", "Valeurs"
	            };
		}else if(figure=="ellipse"){
			data =new Object [][] {
	                {"nom","elipse1"},
	                {"Centre x/y","1/1"},
	                {"AP x/y","1/6"},
	                {"PR x/y","3/1"}
	            };
	        tilte=new String [] {
	                "ellipse", "Valeurs"
	            };
		}else if(figure=="point"){
			data =new Object [][] {
	                {"nom","point1"},
	                {"coord x/y","0/0"}
	            };
	        tilte=new String [] {
	                "point", "Valeurs"
	            };
			
		}else if(figure=="segment"){
			data =new Object [][] {
	                {"nom","segment1"},
	                {"extremite1 x/y","1/1"},
	                {"extremite2 x/y","1/8"}
	            };
	        tilte=new String [] {
	                "segment", "Valeurs"
	            };
		}else if(figure=="carre"){
			data =new Object [][] {
	                {"nom","carre1"},
	                {"Point1 x/y","2/2"},
	                {"point2 x/y","2/6"},
	                {"point3 x/y","6/6"},
	                {"point4 x/y","6/2"}
	            };
	        tilte=new String [] {
	                "carre", "Valeurs"
	            };
		}else if(figure=="rectangle"){
			data =new Object [][] {
	                {"nom","rectangle1"},
	                {"Point1 x/y","2/2"},
	                {"point2 x/y","2/8"},
	                {"point3 x/y","6/8"},
	                {"point4 x/y","6/2"}
	            };
	        tilte=new String [] {
	                "rectangle", "Valeurs"
	            };
		}
		else{
			data=null;
			tilte=null;
		}
		
		
	}

	public String getFigure() {
		return figure;
	}

	public void setFigure(String figure) {
		this.figure = figure;
	}
}

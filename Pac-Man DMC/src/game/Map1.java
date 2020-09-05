package game;

import processing.core.PApplet;
import processing.core.PImage;


public class Map1 extends PApplet{
		public Wall wall;
		int [][] matrix;
		int col,row;
		int posX,posY;
		int matX, matY;
		int x,y;
		PApplet app;
		PImage tile;
		
		public Map1(int [][]matrix,int col, int row,int x, int y, PApplet app) {
			this.matrix = matrix;
			this.app=app;
			this.x=x;
			this.y=y;
			tile= app.loadImage("./image/tile.png");
		}
		
		public void paintArray() {
			col = 10;
			row = 10;
			x=15;
			y=15;
		    matrix  = new int [][]{
		    	{1,1,1,1,1,1,1,1,1,1},
				{1,0,0,2,2,2,0,0,0,1},
				{1,0,0,0,0,0,0,0,0,1},
				{1,0,0,0,0,0,0,0,0,1},
				{1,0,0,0,0,0,0,0,0,1},
				{1,0,0,0,0,0,0,0,0,1},
				{1,0,0,0,0,0,0,0,0,1},
				{1,0,0,0,0,0,0,0,0,1},
				{1,0,0,0,0,0,0,0,0,1},
				{1,1,1,1,1,1,1,1,1,1}
			};
		
		    for (int i = 0; i<10; i++) {
		      for (int j = 0; j<10; j++) { 
		        if (matrix[j][i] == 1) { 
		        	app.image(tile,x,y);
		        }
		      }
		    }
		  }
		}


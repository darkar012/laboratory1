package game;

import processing.core.PApplet;
import processing.core.PImage;


public class Level1 extends Screen{

		int [][] matrix;
		int col,row;
		int posX,posY;
		int matX, matY;
		int x,y;
		PImage tile;
				
		public Level1(PApplet app) {
			super (app);
			tile= app.loadImage("./image/tile.png");
			display=app.loadImage("./image/level1.png");
			
		}
		protected void drawScreen() {
			app.image(display, 0, 0);
		}
		public void paintArray() {
			col = 10;
			row = 10;
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
		        	app.image(tile,15,15);
		        }
		      }
		    }
		  }
		}


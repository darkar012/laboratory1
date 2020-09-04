package game;

import processing.core.PApplet;
import processing.core.PImage;

public class Map1 extends PApplet{
		public Wall wall;
		
		public void paintArray() {
		String [] map = new String []
		{ "111111111111111111111111111",
		  "100000000000010000000000001",
		  "100111101111010111101111001",
		  "100111101111010111101111001",
		  "100000000000000000000000001",
		  "100111101011111110101111001",
		  "100000001000010000100000001",
		  "111111101111010111101111111",
		  "      101000000000101      ",
		  "111111101011111110101111111"};
	
		    for (int i = 0; i<27; i++) {
		      for (int j = 0; j<10; j++) { 
		        if (map[j].charAt(i) == '1') { 
		        	wall.drawObject();
		        }
		      }
		    }
		  }
		}


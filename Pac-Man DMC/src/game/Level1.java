package game;

import processing.core.PApplet;
import processing.core.PImage;
 // level screen
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

}



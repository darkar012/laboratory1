package game;

import processing.core.PApplet;
import processing.core.PImage;

public class Wall {

	PApplet app;
	PImage tile;
	private int x;
	private int y;

	public Wall (int x, int y,PApplet app) {
		this.x = x;
		this.y = y;
		this.app = app;
		tile = app.loadImage("./image/tile.png");
	}

	protected void drawObject() {
		app.image(tile,x,y);
	}
	
}

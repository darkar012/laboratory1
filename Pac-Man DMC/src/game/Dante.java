package game;

import processing.core.PApplet;
import processing.core.PImage;

public class Dante extends PApplet {
	PApplet app;
	PImage dante;
	int posx = 15;
	int posy = 15;


	public Dante(int posx, int posy, PApplet app) {
		this.posx = posx;
		this.posy = posy;
		this.app=app;
		dante= app.loadImage("./image/dante.png");
	}

	protected void paint() {
		app.image(dante,this.posx,this.posy+110);	
	}

}

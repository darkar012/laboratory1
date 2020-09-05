package game;

import processing.core.PApplet;
import processing.core.PImage;

public abstract class Screen {
	PApplet app;
	PImage display;

	public Screen(PApplet app) {
		this.app=app;



	}


	protected void DrawScreen () {

		app.image(display, 0, 0);
	}
}
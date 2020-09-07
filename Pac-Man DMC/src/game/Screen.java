package game;

import processing.core.PApplet;
import processing.core.PImage;
//father class for the screens
public abstract class Screen {
	PApplet app;
	PImage display;

	public Screen(PApplet app) {
		this.app=app;
	}

	// method used to paint in all the daughter classes
	protected void DrawScreen () {

		app.image(display, 0, 0);
	}
}
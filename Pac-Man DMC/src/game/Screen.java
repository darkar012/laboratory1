package game;

import processing.core.PApplet;
import processing.core.PImage;

public class Screen {
	PApplet app;
	PImage display;

	public Screen(PApplet app) {
		this.app=app;



	}





	public void render () {

		app.image(display, 0, 0);
	}
}
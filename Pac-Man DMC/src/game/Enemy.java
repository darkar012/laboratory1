package game;

import processing.core.PApplet;
import processing.core.PImage;

public abstract class Enemy {
		PApplet app;
		PImage badGuy;
		
	public Enemy (PApplet app) {

			this.app=app;
		}

		protected void paintEnemy() {
			app.image(badGuy,0,0);
		}

	}


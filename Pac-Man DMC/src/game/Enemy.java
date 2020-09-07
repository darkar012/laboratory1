package game;

import processing.core.PApplet;
import processing.core.PImage;
// father class for enemy
public abstract class Enemy {
		PApplet app;
		PImage badGuy;
		
	public Enemy (PApplet app) {

			this.app=app;
		}
		// method used to paint in all the daughter classes
		protected void paintEnemy() {
			app.image(badGuy,0,0);
		}

	}


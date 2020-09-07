package game;
import processing.core.PApplet;
import processing.core.PImage;
 
public class DeathScissors extends Enemy{
	
	public DeathScissors(PApplet app) {
		super (app);
		badGuy = app.loadImage("/image/deathScissors.png");
	}
	
	protected void paintEnemy() {
		app.image(badGuy,15+143,15+260);
	}

}


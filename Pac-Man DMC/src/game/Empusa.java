package game;
import processing.core.PApplet;
import processing.core.PImage;
 //second enemy
public class Empusa extends Enemy{
	
	public Empusa (PApplet app) {
		super (app);
		badGuy = app.loadImage("/image/empusa.png");
	}
	
	protected void paintEnemy() {
		app.image(badGuy,15+188,15+260);
	}

}
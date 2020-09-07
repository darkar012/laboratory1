package game;
import processing.core.PApplet;
import processing.core.PImage;
 //fourth enemy
public class ScaredDreamer extends Enemy{
	
	public ScaredDreamer(PApplet app) {
		super (app);
		badGuy = app.loadImage("/image/scaredreamer.png");
	}
	
	protected void paintEnemy() {
		app.image(badGuy,15+173,15+260);
	}

}

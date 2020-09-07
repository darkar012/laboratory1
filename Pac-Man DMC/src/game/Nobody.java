package game;
import processing.core.PApplet;
import processing.core.PImage;
 
public class Nobody extends Enemy{
	
	public Nobody(PApplet app) {
		super (app);
		badGuy = app.loadImage("/image/nobody.png");
	}
	
	protected void paintEnemy() {
		app.image(badGuy,15+158,15+260);
	}

}

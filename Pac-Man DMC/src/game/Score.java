package game;
import processing.core.*;
//scores screen
public class Score extends Screen {
	
	public Score (PApplet app) {
		super (app);

		  display = app.loadImage("/image/highscore.png");
	} 
	
	public void drawScreen () {
		app.image(display, 0, 0);
		
	}
}

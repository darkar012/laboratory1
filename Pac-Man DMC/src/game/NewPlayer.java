package game;
import processing.core.*;
// new player screen
public class NewPlayer extends Screen {

	String name;


	public NewPlayer(PApplet app) {
		super (app);

		name = "Type New Name";

		display = app.loadImage("/Image/newPlayer.png");
	} 

	protected void drawScreen () {
		app.image(display, 0, 0);
		
		app.text(name,83,283);
	}
	public void setName (String newName) {
		name = newName;

	}
}
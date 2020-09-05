package game;
import processing.core.*;



public class Menu extends Screen{
	
	public Menu(PApplet app) {
		super (app);
		display = app.loadImage("/image/menu.png");
	}

		protected void drawScreen () {

			app.image(display, 0, 0);
		}
	}

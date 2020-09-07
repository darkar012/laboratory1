package game;

import processing.core.*;
//win screen
public class Win extends Screen {

	public Win(PApplet app) {
		super(app);
		display = app.loadImage("/image/win.png");
	}
	
	protected void drawScreen () {

		app.image(display, 0, 0);
	}

}

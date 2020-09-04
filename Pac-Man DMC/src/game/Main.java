package game;

	import processing.core.PApplet;
	import processing.core.PImage;

	public class Main extends PApplet{
		PImage bg;
		public Dante player;
		public boolean movLeft;
		public boolean movRight;
		public boolean movUp;
		public boolean movDown;
		int y;			
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			PApplet.main ("game.Main");
		}

		public void settings() {
			size(375, 667);
		}
		public void setup() {
			bg = loadImage("map.png");
			player = new Dante(92,92,5, this);
		}
		public void draw() {
			background(bg);
			player.paint();
			if (movRight==true){

				player.moveRight();
			}

			if (movLeft==true){

				player.moveLeft();
			}
			if (movUp==true){

				player.moveUp();
			}

			if (movDown==true){

				player.moveDown();
			}
		}
		public void keyPressed() {

			if(keyCode == RIGHT) {
				movRight = true;
			}
			if(keyCode == LEFT) {
				movLeft = true;
			}
			if(keyCode == DOWN) {
				movDown = true;
			}
			if(keyCode == UP) {
				movUp = true;
			}

		}
		public void keyReleased() {

			if(keyCode == RIGHT) {
				movRight = false;
			}
			if(keyCode == LEFT) {
				movLeft = false;
			}
			if(keyCode == DOWN) {
				movDown = false;
			}
			if(keyCode == UP) {
				movUp = false;
			}
	}
	}


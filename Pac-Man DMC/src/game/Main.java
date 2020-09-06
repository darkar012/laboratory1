package game;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class Main extends PApplet{
	//PImage bg;
	/*public Map1 maze;
		public Dante player;
		public boolean movLeft;
		public boolean movRight;
		public boolean movUp;
		public boolean movDown;
		int y;*/
	Dante dante;
	//screens
	Menu menu;
	NewPlayer newPlayer;
	Score score;
	Level1 level;
	ArrayList<String> typeName;
	int state;
	int posX=83;
	int posY=292;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main ("game.Main");
	}

	public void settings() {
		size(375, 667);
		menu=new Menu(this);
		newPlayer= new NewPlayer(this);
		score=new Score(this);
		level=new Level1(this);
		typeName= new ArrayList<String>();
		dante= new Dante (posX, posY, this);
		state=1;
	}
	public void setup() {
		/*bg = loadImage("map.png");
			player = new Dante(92,92,5, this);
			maze = new Map1(null, 10, 10 ,0, 200, this);*/
	}
	public void draw() {
		/*background(255);
			maze.paintArray();
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

				player.moveDown();*/
		switch (state) {
		case 1:
			menu.drawScreen();
			break;
		case 2:
			newPlayer.drawScreen();
			break;
		case 3:
			score.drawScreen();
			break;
		case 4:
			//dante.
			level.drawScreen();
			level.paintArray();
			dante.paint();
			break;
		}
	}

	public void mouseClicked () {
		PApplet.println(mouseX);
		PApplet.println(mouseY);

		switch (state) {
		case 1:
			if (mouseX > posX && mouseX < posX + 213
					&& mouseY > posY && mouseY < posY+51 )
				state = 2;

			if (mouseX > posX && mouseX < posX + 213
					&& mouseY > 357 && mouseY < 357 +51) 
				state = 3;

			if (mouseX > posX && mouseX < posX + 213
					&& mouseY > 487 && mouseY < 487 + 51) 
				exit (); 
			break;

		case 2:
			if (mouseX > 83 && mouseX < 83 + 184
					&& mouseY > 271 && mouseY < 271 + 38)

				newPlayer.setName(String.join("", typeName));
			
			if (mouseX > posX && mouseX < posX + 213
					&& mouseY > 357 && mouseY < 357 +51) 
				state = 4;
		case 3:
			if (mouseX > 63 && mouseX < 63 + 249
					&& mouseY > 494 && mouseY < 494 + 56)

				state=1;

		}
	}
	public void keyPressed() {
		switch(state) {

		case 2:

			if((key >= 'A' && key <= 'Z') || (key >= 'a' && key <= 'z')) {
				newPlayer.setName(String.join("", typeName));
				typeName.add(key+"");
			}
		}

		/*if(keyCode == RIGHT) {
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
			}*/
	}
}




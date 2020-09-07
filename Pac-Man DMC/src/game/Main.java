package game;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet{
	//class
	Dante dante;
	DeathScissors ds;
	Nobody nobody;
	ScaredDreamer sd;
	Empusa empusa;
	//screens
	Menu menu;
	NewPlayer newPlayer;
	Score score;
	Level1 level;
	Win win;
	//variables
	ArrayList<String> typeName;
	boolean point=false;
	boolean time=false;
	int min;
	int sec;
	int state;
	int pointScore = 0;
	int [][] matrix= {
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,1,1,1,1,0,1,1,1,1,0,1,0,1,1,1,1,0,1,1,1,1,0,1},
			{1,0,1,1,1,1,0,1,1,1,1,0,1,0,1,1,1,1,0,1,1,1,1,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,1,1,1,1,0,1,0,1,1,1,1,1,1,1,0,1,0,1,1,1,1,0,1},
			{1,0,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,1},
			{1,1,1,1,1,1,0,1,1,1,1,0,1,0,1,1,1,1,0,1,1,1,1,1,1},
			{2,2,2,2,2,1,0,1,0,0,0,0,0,0,0,0,0,1,0,1,2,2,2,2,2},
			{2,2,2,2,2,1,0,1,0,3,3,4,4,4,3,3,0,1,0,1,2,2,2,2,2},
			{1,1,1,1,1,1,0,1,0,3,2,2,2,2,2,3,0,1,0,1,1,1,1,1,1},
			{0,0,0,0,0,0,0,0,0,3,2,2,2,2,2,3,0,0,0,0,0,0,0,0,0},
			{1,1,1,1,1,1,0,1,0,3,2,2,2,2,2,3,0,1,0,1,1,1,1,1,1},
			{2,2,2,2,2,1,0,1,0,3,3,3,3,3,3,3,0,1,0,1,2,2,2,2,2},
			{2,2,2,2,2,1,0,1,0,0,0,0,0,0,0,0,0,1,0,1,2,2,2,2,2},
			{1,1,1,1,1,1,0,1,0,1,1,1,1,1,1,1,0,1,0,1,1,1,1,1,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,1,1,1,1,0,1,1,1,1,0,1,0,1,1,1,1,0,1,1,1,1,0,1},
			{1,0,1,1,1,1,0,1,1,1,1,0,1,0,1,1,1,1,0,1,1,1,1,0,1},
			{1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,1},
			{1,1,1,0,1,1,0,1,1,1,1,1,1,1,1,1,1,1,0,1,1,0,1,1,1},
			{1,1,1,0,1,1,0,1,1,1,1,1,1,1,1,1,1,1,0,1,1,0,1,1,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,1,1,1,1,0,1,1,1,1,0,1,0,1,1,1,1,0,1,1,1,1,0,1},
			{1,0,1,1,1,1,0,1,1,1,1,0,1,0,1,1,1,1,0,1,1,1,1,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
	};
	int col,row;
	int posX = 15;
	int posY = 15;
	int matX, matY;
	int x,y;
	//images
	PImage tile;
	PImage orb;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main ("game.Main");
	}

	public void settings() {
		size(375, 667);
		//class and screens initialization
		menu=new Menu(this);
		newPlayer= new NewPlayer(this);
		score=new Score(this);
		level=new Level1(this);
		win= new Win(this);
		typeName= new ArrayList<String>();
		dante= new Dante (posX, posY, this);
		empusa = new Empusa (this);
		ds = new DeathScissors (this);
		nobody = new Nobody (this);
		sd = new ScaredDreamer (this);
		//first screen
		state=1;
	}
	public void setup() {
		//variable initialization
		min=0;
		sec=0;
		col = 25;
		row = 27;
		matY=1;
		matX=1;
		//load of images
		tile= loadImage("./image/tile.png");
		orb= loadImage("./image/orb.png");
	}
	public void draw() {
		//use of switch to change between screens
		switch (state) {
		//menu
		case 1:
			menu.drawScreen();
			break;
		// name player
		case 2:
			newPlayer.drawScreen();
			break;
		// scores screen
		case 3:
			score.drawScreen();
			break;
		//gaming screen
		case 4:
			
			level.drawScreen();
			//for to paint my walls
			for (int i = 0; i<25; i++) {
				for (int j = 0; j<27; j++) { 
					if (matrix[j][i] == 1) { 
						image(tile,i*15,j*15+110);}
				}
			}
			//for to paint my points
			for (int i = 0; i<25; i++) {
				for (int j = 0; j<27; j++) { 
					if (matrix[j][i] == 0) { 
						image(orb,i*15,j*15+110);}
				}
			}
			// characters paint methods
			dante.paint();
			ds.paintEnemy();
			nobody.paintEnemy();
			sd.paintEnemy();
			empusa.paintEnemy();
			text(pointScore,246, 83);
			// time set
			time=true;
			if (time ==true) {
				if (frameCount % 60 == 0) {
					sec += 1;
				}
				if (sec == 60) {
					sec = 0;
					min += 1;
				}
			}
			text(min + " : " + sec, 250, 545);
			// if you obtained the max of points, you win, the time stop
			if (pointScore == 132000) {
				state=5;
				time=false;
			}
			break;
		//win screen
		case 5:
			win.drawScreen ();
			text(pointScore, 170,300);
			text(min + " : " + sec, 170, 320);
			break;
		}
	}

	public void mouseClicked () {
		PApplet.println(mouseX);
		PApplet.println(mouseY);

		switch (state) {
		// menu mouse set buttons
		case 1:
			// new game button
			if (mouseX > 83 && mouseX < 83 + 213
					&& mouseY > 291 && mouseY < 291+51 ) {
				state = 2;}
			// scores button
			if (mouseX > posX && mouseX < posX + 213
					&& mouseY > 357 && mouseY < 357 +51) { 
				state = 3;}
			// exit button
			if (mouseX > posX && mouseX < posX + 213
					&& mouseY > 487 && mouseY < 487 + 51) {
				exit (); }
			break;
			// name player set buttons
		case 2:
			// set of array to write name
			if (mouseX > 83 && mouseX < 83 + 184
					&& mouseY > 271 && mouseY < 271 + 38) {

				newPlayer.setName(String.join("", typeName));
			}
			// start button
			if (mouseX > posX && mouseX < posX + 213
					&& mouseY > 357 && mouseY < 357 +51) { 
				state = 4;
			}
			break;
			// score set button
		case 3:
			// menu button
			if (mouseX > 63 && mouseX < 63 + 249
					&& mouseY > 494 && mouseY < 494 + 56) {

				state=1;
			}
			break;
			// gaming button
		case 4:
			//restart button
			if (mouseX > 205 && mouseX < 205 + 147
					&& mouseY > 591 && mouseY < 591 + 56) {
				state=2;
				//restart of variables if you restart game
				pointScore = 0;
				min=0;
				sec = 0;
			}
			break;
			//Win button
		case 5:
			//restart button
			if (mouseX > 61 && mouseX < 61 + 249
					&& mouseY > 358 && mouseY < 358 + 56) {
				state=4;
				//restart of variables if you restart game
				pointScore = 0;
				min=0;
				sec = 0;
			}
			//menu button
			if (mouseX > 61 && mouseX < 61 + 249
					&& mouseY > 431 && mouseY < 431 + 56) {
				state=1;}
		}
	}
	public void keyPressed() {
		// keyboard set
		switch(state) {
		//name player keys set
		case 2:
			//write name option
			if((key >= 'A' && key <= 'Z') || (key >= 'a' && key <= 'z')) {
				newPlayer.setName(String.join("", typeName));
				typeName.add(key+"");
			}
		// gaming keys set
		case 4:
			//movements keys set
			switch (keyCode) {
			case RIGHT:
				//if the next position of the matrix exist a "1", the character stops, that is used for the 4 arrows
				if(matrix[matY][matX+1]!=1 ) {
					dante.posx += 15;
					matX++;
				}
				//this is for add points to the score, the same method is use in each direction
				if(matrix[matY][matX]==0) {
					point=true;
					if (point ==true) {
						pointScore+=500;
					}					
					matrix[matY][matX] = 8;}

				if (matrix[matY][matX]==8) {
					point =false;
				}				
				break;
			case LEFT:
				if(matrix[matY][matX-1]!=1) {
					dante.posx -= 15;
					matX--;
				}
				if(matrix[matY][matX]==0) {
					point=true;
					if (point ==true) {
						pointScore+=500;
					}					
					matrix[matY][matX] = 8;}

				if (matrix[matY][matX]==8) {
					point =false;
				}
				break;
			case UP:
				if(matrix[matY-1][matX]!=1) {
					dante.posy -= 15;
					matY--;
				}if(matrix[matY][matX]==0) {
					point=true;
					if (point ==true) {
						pointScore+=500;
					}					
					matrix[matY][matX] = 8;}

				if (matrix[matY][matX]==8) {
					point =false;
				}
				break;
			case DOWN:
				if(matrix[matY+1][matX]!=1) {
					dante.posy += 15;
					matY++;
				}if(matrix[matY][matX]==0) {
					point=true;
					if (point ==true) {
						pointScore+=500;
					}					
					matrix[matY][matX] = 8;}

				if (matrix[matY][matX]==8) {
					point =false;
				}
				break;
			default:
				break;
			}
		}
	}

}





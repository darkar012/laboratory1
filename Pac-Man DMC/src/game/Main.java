package game;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet{

	Dante dante;
	//screens
	Menu menu;
	NewPlayer newPlayer;
	Score score;
	Level1 level;
	ArrayList<String> typeName;
	boolean point=false;
	int state;
	int puntaje = 0;
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
	PImage tile;
	PImage orb;
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
		col = 25;
		row = 27;
		matY=1;
		matX=1;
		tile= loadImage("./image/tile.png");
		orb= loadImage("./image/orb.png");
	}
	public void draw() {

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
			level.drawScreen();
			for (int i = 0; i<25; i++) {
				for (int j = 0; j<27; j++) { 
					if (matrix[j][i] == 1) { 
						image(tile,i*15,j*15+110);}
				}
			}
			for (int i = 0; i<25; i++) {
				for (int j = 0; j<27; j++) { 
					if (matrix[j][i] == 0) { 
						image(orb,i*15,j*15+110);}
				}
			}
			dante.paint();
			text(puntaje,346, 83);
			break;
		}
	}

	public void mouseClicked () {
		PApplet.println(mouseX);
		PApplet.println(mouseY);

		switch (state) {
		case 1:
			if (mouseX > 83 && mouseX < 83 + 213
					&& mouseY > 291 && mouseY < 291+51 )
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
		case 4:

			switch (keyCode) {
			case RIGHT:
				if(matrix[matY][matX+1]!=1 ) {
					dante.posx += 15;
					matX++;
				}if(matrix[matY][matX]==0) {
					point=true;
					if (point ==true) {
						puntaje+=500;
					}					
					matrix[matY][matX] = 8;
					
					if (matrix[matY][matX]==8)
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
						puntaje+=500;
					}					
					matrix[matY][matX] = 8;
					
					if (matrix[matY][matX]==8)
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
						puntaje+=500;
					}					
					matrix[matY][matX] = 8;
					
					if (matrix[matY][matX]==8)
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
						puntaje+=500;
					}					
					matrix[matY][matX] = 8;
					
					if (matrix[matY][matX]==8)
						point =false;
				}
				break;
			default:
				break;
			}
		}
	}

}





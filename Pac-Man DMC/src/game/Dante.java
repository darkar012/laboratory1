package game;

import processing.core.PApplet;
import processing.core.PImage;

public class Dante extends PApplet {
	PApplet app;
	PImage dante;
	int posx;
	int posy;
	int x;
	int y;

	public Dante(int x, int y, int posx, int posy, PApplet app) {
		this.posx = posx;
		this.posy = posy;
		this.app=app;
		this.x=x;
		this.y=y;
		dante= app.loadImage("./image/dante.png");
	}

	protected void paint() {
		app.image(dante,x,y+110);
		//app.fill(255,0,0);
		//app.rect(x, y, 50, 50);		
	}

	public int getPosx() {
		return posx;
	}

	public void setPosx(int posx) {
		this.posx = posx;
	}

	public int getPosy() {
		return posy;
	}

	public void setPosy(int posy) {
		this.posy = posy;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	/*protected void moveLeft() {
		x -=speed;
		if(x <= 0){
			x +=speed;
		}
	}
	protected void moveRight() {

		x +=speed;
		if(x >= 375){
			x -=speed;					
		}

	}
	public void moveUp() {
        y -= speed;
        if(y <= 0){
            y += speed;
        }
    }

    public void moveDown() {
        y += speed;
        if(y >= 667){
            y -= speed;
        }

}*/
	
}

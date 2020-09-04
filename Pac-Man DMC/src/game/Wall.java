package game;

import processing.core.PApplet;
import processing.core.PImage;

public class Wall extends MapObject{

	PApplet app;
	PImage tile;

	public Wall (int x, int y,PApplet app) {
		super (x,y);
		this.app = app;
		tile = app.loadImage("./image/tile.png");
	}

	protected void drawObject() {
		app.image(tile,getX(),getY());
	}
	public boolean blocksUp(){
	    return( this.getX()==getX() && this.getY()==getY()-18) ;
	  }
	public boolean blocksDown(){
	    return( this.getX()==getX() && this.getY()==getY()-18) ;
	  }
	public boolean blocksLeft(){
	    return( this.getX()==getX() && this.getY()==getY()-18) ;
	  }
	public boolean blocksRight(){
	    return( this.getX()==getX() && this.getY()==getY()-18) ;
	  }
}

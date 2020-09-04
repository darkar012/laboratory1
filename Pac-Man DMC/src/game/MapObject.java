package game;

import processing.core.PApplet;

public abstract class MapObject extends PApplet{
	private int x;
	private int y;

	public MapObject(int x, int y){
		this.x =x;
		this.y = y;
	}

	protected abstract void drawObject();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

}

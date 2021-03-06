package snake;

import java.awt.Color;

public class Rect {
	private int x, y, width, height;
	private Color c;

	public Rect(int x, int y, int width, int height, Color c) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.c = c;
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

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public Color getC() {
		return c;
	}

	public void setC(Color c) {
		this.c = c;
	}
}

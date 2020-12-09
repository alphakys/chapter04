package com.javaex.ex01;

public class Triangle {
	
	private int width;
	private int height;
	
	public Triangle() {}
	
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
		
		
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}
	
	
	
	public String draw() {
		return "삼각형= 가로" + width + ", 세로=" + height;
	}
	
	
	
	
	
	
	
	
	
	
	
}

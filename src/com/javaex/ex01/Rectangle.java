package com.javaex.ex01;

import java.util.ArrayList;

public class Rectangle {
	
	private int width;
	private int height;
	

	
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		
	}	
		
		
	public Rectangle() {
		
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
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}


	public void draw() {
		
		System.out.println("사각형(가로="+width+", 세로="+height+")");
	}
	

	
	
}

package com.javaex.ex01;

public class RectList {
	
	private Rectangle[] rArr;
	private int crtPos;
	
	
	public RectList() {
		
	rArr = new Rectangle[Integer.MAX_VALUE];
	crtPos=0;
		
		
	}
	
	
	
	public void add(Rectangle r) {
		
		rArr[crtPos]=r;
		crtPos++;
		
	}
	
	
	public int size() {
		
		return crtPos;
	}
	
	
	public void addIndex(int n, Rectangle r) {
		
		rArr[n] = r;
	}
	
	
	public Rectangle get(int n) {
		
		return rArr[n];
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

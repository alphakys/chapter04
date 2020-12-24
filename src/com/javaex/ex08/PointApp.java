package com.javaex.ex08;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {
		Map<String, Point> pMap = new HashMap<String, Point>();
		
		
		Point p01 = new Point(1,1);
		Point p02 = new Point(2,2);
		Point p03 = new Point(3,3);
		Point p04 = new Point(4,4);
		Point p05 = new Point(5,5);
		
		
		pMap.put("z", p01);
		pMap.put("x", p02);
		
		pMap.put("c", p04);
		pMap.put("a", p03);
		
	
		
		
		
		System.out.println(pMap);
		
		Set<String> keys = pMap.keySet();
		for(String key : keys) {
			System.out.println(key);
		}
		
		System.out.println(pMap.size());
		
		
	}

}

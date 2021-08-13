package com.demo.collection;

import java.util.HashMap;
import java.util.Map;

public class MapEx {

	public static void main(String[] args) {
		
	
	HashMap<Dmart, Integer> map = new HashMap<>();
	Dmart dmart = new Dmart(101, "boost","madhapur");
	Dmart dmart1 = new Dmart(102, "grocessories","gachibowli");
	map.put(dmart,1);
	map.put(dmart1,2);
	
	System.out.println(" map values : "+map);
	
	for(Map.Entry entry : map.entrySet()){
		System.out.println(entry.getKey()+" --"+entry.getValue());
	}
	
	}
}

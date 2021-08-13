package com.demo.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lmap = new LinkedHashMap<>();
		lmap.put("coconutice", 101);
		lmap.put("seethaphal", 102);
		for(Map.Entry entry : lmap.entrySet()){
			System.out.println(entry.getValue()+" : "+entry.getKey());
		}
	
		
	}
}

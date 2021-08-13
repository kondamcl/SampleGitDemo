package com.demo.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		String requiredVal;
		HashMap<Integer,String> cityMap = new HashMap<>();
		cityMap.put(101,"hyd");
		cityMap.put(102, "bng");
		cityMap.put(103, "chn"); // {103,"kolkata"} afeb@23423
		cityMap.put(103, "kolkata");
		
		for( Map.Entry entry : cityMap.entrySet()){
			System.out.println(entry.getKey()+" : "+ entry.getValue());
			if(cityMap.containsKey(102)){
				System.out.println(cityMap.get(102));
			}
			
			System.out.println(entry.getKey()+" : "+ entry.getValue());
		}
		
		
	}
}

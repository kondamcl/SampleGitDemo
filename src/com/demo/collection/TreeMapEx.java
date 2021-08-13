package com.demo.collection;

import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap<Integer, String> ageMap = fetchAgeDetails();
		 if(ageMap!=null && !ageMap.isEmpty()){
			 System.out.println(ageMap);
		 }
		System.out.println(" after if ");
	}

	private static TreeMap<Integer, String> fetchAgeDetails() {

		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(101, "hi");
		tm.put(4, "fout");
		tm.put(10, "hi");
		tm.put(40, "fout");
		return tm;
	}
}

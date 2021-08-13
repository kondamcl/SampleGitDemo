package com.demo.collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemoEx {

	public static void main(String[] args) {
		Set<String> citySet = new HashSet<String>();
		citySet.add("kol");
		citySet.add("hyd");
		citySet.add("bng");
		citySet.add("chn");
		citySet.add(null);
		System.out.println(citySet);
	}
}

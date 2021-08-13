package com.demo.collection;

import java.util.LinkedList;

public class LinkedListEx {

	static Integer x =10;
	public static void main(String[] args) {
		
		//LinkedList: AL vs LL
		
		int y=x;
		System.out.println(" integer val :"+y);
		LinkedList<Integer> lk = new LinkedList<>();
		lk.add(101);
		lk.add(20);
		lk.add(101);
		lk.add(76);
		lk.add(null);
		System.out.println(" linked list values: "+lk);
		System.out.println(lk.get(3));
	}
}

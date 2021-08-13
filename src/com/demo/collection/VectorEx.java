package com.demo.collection;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		//sychronized 
		Vector<Double> vector = new Vector<>();
		vector.addElement(10.2343);
		vector.addElement(76.344);
		System.out.println(vector.get(0));
		for(Double vdetails : vector){
			System.out.println(vdetails);
			
		}
	}
}

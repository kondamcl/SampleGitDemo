package com.demo.collection;

import java.util.ArrayList;

public class ArrayListEx {
	static String topGrosSaleLoc;
	public static void main(String[] args) {
		
		Dmart dmart = new Dmart(101, "boost","madhapur");
		Dmart dmart1 = new Dmart(102, "grocessories","gachibowli");
		Dmart dmart2 = new Dmart(101, "horlicks","sr nagar");
		ArrayList<Dmart> dmartList = new ArrayList<>();
		
		dmartList.add(dmart);
		dmartList.add(dmart1);
		dmartList.add(dmart);
		dmartList.add(null);
		
		for(Dmart dmt : dmartList){ 
			if(dmt.getProductName().equalsIgnoreCase("grocessories")){
				topGrosSaleLoc=dmt.getStoreLocation();
			}
			if(dmt.getProductId()== 101){
				System.out.println("product name for id 101 :"+dmt.getProductName());
			}
		}
		System.out.println(topGrosSaleLoc);
		
		
	}
}

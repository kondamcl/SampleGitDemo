package com.demo.collection;

public class Dmart {

	private int productId;
	private String productName;
	private String storeLocation;
	
	Dmart(int productId,String productName, String storeLocation){
		this.productId=productId;
		this.productName=productName;
		this.storeLocation=storeLocation;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getStoreLocation() {
		return storeLocation;
	}

	public void setStoreLocation(String storeLocation) {
		this.storeLocation = storeLocation;
	}
	 
	public String toString(){
		return "Dmart:[pid :"+productId+" ,pname: "+productName+" ,loation: "+storeLocation+"]";
	}
}

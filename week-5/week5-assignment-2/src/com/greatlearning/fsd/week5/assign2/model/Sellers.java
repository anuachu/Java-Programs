package com.greatlearning.fsd.week5.assign2.model;

public class Sellers {
	  private int id;
	    private String name;
	    private Address address;
	    private Inventory inventory;

	public Sellers(int id,String name,Address address){
	    this.id = id;
	    this.name = name;
	    this.address = address;
	    
	}
	public void SellerDisplay(){
	    System.out.println("Sellers id is :"+" "+this.id);
	    System.out.println("Sellers name is:"+" "+this.name);
	    System.out.println("Sellers address is:"+" "+this.address);
	    
	    }
	}





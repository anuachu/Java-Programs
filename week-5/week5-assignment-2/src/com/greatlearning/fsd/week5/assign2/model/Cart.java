package com.greatlearning.fsd.week5.assign2.model;
import java.util.*;


public class Cart {
	
	 private int numItem;
	    private int maxofItem = 5;
	  //private String itemName[] = new String[5];
	    private List<String> itemName = new ArrayList<String>();
	   // private int itemQuantity[] = new int[5];
	    private List<Integer> itemQuantity = new ArrayList<Integer>(); 
	    //private int itemPrice[] = new int[5];
	    private List<Integer> itemPrice = new ArrayList<Integer>();
	    private int itemIndex = 0;
	    private int totalAmount;

	public void generateBill(){
		Iterator itemIndex = itemPrice.iterator();
		for(int index= 1; index < itemPrice.size();index++)
	   {
	     this.totalAmount = this.totalAmount + this.itemQuantity.get(index) * this.itemPrice.get(index);
	    }
	System.out.println("Total bill genrated:"+ " " +this.totalAmount);
	}

	public void addtoCart(String itemName,int itemQuantity,int itemPrice)
	{
		
	if(this.numItem <= this.maxofItem){
	 this.itemName.add(itemIndex,itemName);
	 this.itemQuantity.add(itemIndex,itemQuantity);
	 this.itemPrice.add(itemIndex,itemPrice);
	 this.numItem++;
	 this.itemIndex++;
	}
	else if(this.numItem > this.maxofItem){
	    System.out.println("Cart is full");
	    
	}

	}

	    public void removefromCart(String itemName,int itemQuantity){
	    	

	        for (int index = 0; index < this.itemName.size(); index++ )
	        if(this.itemName.get(index) == itemName){
	          System.out.println("Item found");
	          this.itemQuantity.add(this.itemQuantity.get(index) - itemQuantity); 
	        }
	        else{
	            System.out.println("Item not found");
	        }

	        }

	    
	    
	   public void cartDisplay(){
	       for(int index = 0; index < this.itemName.size();index++){
	         System.out.println("Item Name:"+this.itemName.get(index));
	         System.out.println("Item Quantity:"+this.itemQuantity.get(index));
	         System.out.println("Item Price:"+this.itemPrice.get(index));
	 }
	    


	       
	   } 
	}




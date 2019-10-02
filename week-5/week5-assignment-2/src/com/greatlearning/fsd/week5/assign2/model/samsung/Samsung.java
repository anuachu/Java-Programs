package com.greatlearning.fsd.week5.assign2.model.samsung;

import com.greatlearning.fsd.week5.assign2.model.*;

import com.greatlearning.fsd.week5.assign2.model.Mobile;


	public class Samsung extends Mobile{
	     int cost = 20000;
	    
	     public Samsung(int id,String name,String description,int price){
	        super(id, name, description, price);
	    }

	    public void samsungMob(int cost){
	        this.cost = cost;
	    }

	    public void samsungStatus(){
	        System.out.println("Cost of Samsung is:"+"  "+this.cost);
	    }

	}
	  



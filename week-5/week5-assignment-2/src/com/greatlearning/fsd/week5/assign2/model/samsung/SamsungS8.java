package com.greatlearning.fsd.week5.assign2.model.samsung;

import com.greatlearning.fsd.week5.assign2.model.*;
import com.greatlearning.fsd.week5.assign2.model.Mobile;

 public class SamsungS8 extends Mobile{
    int cost = 42000;
   
    public SamsungS8(int id,String name,String description,int price){
       super(id, name, description, price);
   }

   public void samsungS8Mob(int cost){
       this.cost = cost;
   }
   public void samsungS8status(){
       System.out.println("Cost of SamsungS8 is:"+ "  "+this.cost);
   }
}


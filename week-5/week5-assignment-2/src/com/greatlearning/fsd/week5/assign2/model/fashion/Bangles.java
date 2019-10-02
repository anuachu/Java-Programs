package com.greatlearning.fsd.week5.assign2.model.fashion;

import com.greatlearning.fsd.week5.assign2.model.Fashion;
import com.greatlearning.fsd.week5.assign2.model.*;

 public class Bangles extends Fashion{
    int cost = 500;
   
    public Bangles(int id,String name,String description,int price){
       super(id, name, description, price);
   }

   public void bangles1(int cost){
       this.cost = cost;
   }
   public void banglesStatus(){
       System.out.println("Cost of Bangles is:"+ "  "+this.cost);
   }
}
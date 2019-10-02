package com.greatlearning.fsd.week5.assign2.model.fashion;

import com.greatlearning.fsd.week5.assign2.model.Fashion;
import com.greatlearning.fsd.week5.assign2.model.*;

public class LakmelipStick extends Fashion{
    int cost = 400 ;
   
    public LakmelipStick(int id,String name,String description,int price){
       super(id, name, description, price);
   }

   public void lipStick(int cost){
       this.cost = cost;
   }
   public void lipStickStatus(){
       System.out.println("Cost of Lakme lipstick is:"+ "  "+this.cost);
   }
}

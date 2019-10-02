
import java.util.*;
import java.lang.*;
import java.io.*;

enum dishType {
    VEG,NONVEG;
}

public class Dish{
    private int id;
    private String dishName;
    public  int price;
    public  int calories;

    public Dish(int id,String dishName,int price,int calories){
        this.id = id;
        this.dishName = dishName;
        this.price = price;
        this.calories = calories; 
    }

    public int dishPrice(){
        return this.price;
    }

    public void dishStatus(){
        System.out.println("Dish id is:"+" "+this.id);
        System.out.println("Dish Name is:"+" "+this.dishName);
         System.out.println("Dish price is:"+" "+this.price);
        System.out.println("Dish calories is:"+" "+this.calories);
    }
   @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dish other = (Dish) obj;
        if ((this.dishName == null) ? (other.dishName != null) : !this.dishName.equals(other.dishName)) {
            return false;
        }
        return true;
    }
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + (this.dishName != null ? this.dishName.hashCode() : 0);
        return hash;
    }
    public String toString() {
        return "Dish{" + " id " + id + ", Name" + dishName + ", calories" + calories + ", price" + price + '}';
    }

}

    



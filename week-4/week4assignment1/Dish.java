package Backendassignments\Corejava\week4\week4assignment1
import java.util.*;
import java.lang.*;
import java.io.*;

enum dishType {
    VEG,NONVEG;
}

public class Dish{
    private int id;
    private String dishName;
    public String dishType;
    public  int calories;
    public  int price;

    public Dish(int id,String dishName,String dishType,int calories,int price){
        this.id = id;
        this.dishName = dishName;
        this.dishType = dishType;
        this.calories = calories;
        this.price = price;

    }

    public void dishStatus(){
        System.out.println("Dish id is:"+" "+this.id);
        System.out.println("Dish Name is:"+" "+this.dishName);
        System.out.println("Dish Type is:"+" "+this.dishType);
        System.out.println("Dish calories is:"+" "+this.calories);
        System.out.println("Dish price is:"+" "+this.price);
        
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
    
    


class Sorting implements Comparator<Dish>{
    public int compare(Dish e,Dish f){
        return e.calories - f.calories;
    }
}



class SortingPrice implements Comparator<Dish>{
    public int compare(Dish e,Dish f){
        return e.price - f.price;
    }
}
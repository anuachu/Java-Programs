package Backendassignments\Corejava\week4\week4assignment1
import java.util.*;
import java.util.Scanner;

public class Client{
    public static void main(String args[]){
       
        Dish dish = new Dish(0001, "Fried rice","veg", 113, 200);
        Dish dish1 = new Dish(0002, "Noodles","veg", 113, 200);
        Dish dish2 = new Dish(0003, "Pav bhaji","veg", 200, 100);
        Dish dish3 = new Dish(0004, "Bhel puri","Veg", 367, 50);
        Dish dish4 = new Dish(0005, "Pani puri","Veg", 55, 50);
        Dish dish5 = new Dish(0006, " Chicken Biryani"," Non Veg", 400, 500);
        Dish dish6 = new Dish(0007, "Masala puri","Veg", 264, 50);
        Dish dish7 = new Dish(8, "Tawa pulav","Veg", 200, 100);
        Dish dish8 = new Dish(9, "Masala pav","Veg", 300, 100);
        Dish dish9 = new Dish(010, "Masala dosa","Veg", 500, 75);
        
        ArrayList<Dish> listDishes = new ArrayList<Dish>();
        
        listDishes.add(dish);
        listDishes.add(dish1);
        listDishes.add(dish2);
        listDishes.add(dish3);
        listDishes.add(dish4);
        listDishes.add(dish5);
        listDishes.add(dish6);
        listDishes.add(dish7);
        listDishes.add(dish8);
        listDishes.add(dish9);

        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose the below option");
        System.out.println("============== Welcome =====================================");
        System.out.println(" 1 => To sort the dishes in the increasing order of calories");
        System.out.println(" 2 => To sort the dishes in the decreasing order of calories");
        System.out.println(" 3 => To sort the dishes in the increasing order of calories");
        System.out.println(" 4 => To sort the dishes in the decreasing order of calories");
        System.out.println("=============================================================");
        int option = sc.nextInt();
        sc.close();


    
        listDishes.forEach((Dish)->Dish.dishStatus());

        if(option == 2){
        System.out.println("Sorting by  decreasing Calories");
        Collections.sort(listDishes,new Sorting());
        listDishes.forEach((Dish)->Dish.dishStatus());
        }
       
       if(option == 1){
        System.out.println("Sorting by  increasing Calories");
        Comparator c = Collections.reverseOrder(new Sorting());
        Collections.sort(listDishes, c);
        listDishes.forEach((Dish)->Dish.dishStatus());
       }
       if(option == 4){
        System.out.println("Sorting by decreasing Price");
        Collections.sort(listDishes,new SortingPrice());
        listDishes.forEach((Dish)->Dish.dishStatus());
       }
       if(option == 3){
        System.out.println("Sorting by  increasing Calories");
        Comparator d = Collections.reverseOrder(new SortingPrice());
        Collections.sort(listDishes, d);
        listDishes.forEach((Dish)->Dish.dishStatus());
       }
       }
    }
import java.util.*;

public class Restuarant{
     
    public static void main(String args[]){
        Dish dish = new Dish(1, "Dosa", 50, 300);
        Dish dish1 = new Dish(2, "Idly-vada",40 , 200);
        Dish dish2 = new Dish(3, "Pulav",80, 330);
        Dish dish3 = new Dish(4, "Roti-curry",100, 250);
        Dish dish4 = new Dish(5, "Neer-Dosa",50, 100);
        
       
        
        Scanner sc = new Scanner(System.in);
        System.out.println("=========Please select the Dish Id and hit enter=========");
        System.out.println("Dish Id:5, name: Neer-Dosa, Price: 50.00  Calories: 100");
        System.out.println("Dish Id:2, name: Idli-Vada, Price: 40.00  Calories: 200");
        System.out.println("Dish Id:4, name: Roti-Curry, Price: 100.00  Calories: 250");
        System.out.println(" Dish Id:1, name: Dosa, Price: 50.00  Calories: 300");
        System.out.println(" Dish Id:3, name: Pulav, Price: 80.00  Calories: 330");
        System.out.println("=============================================================");
        int option = sc.nextInt();
        sc.nextLine();
        int dishPrice = 0;
        

        switch(option){
           case 1:
                dish.dishStatus();
                dishPrice = dish.dishPrice();
                break;
           case 2:
                dish1.dishStatus();
                dishPrice = dish1.dishPrice();
                break;
            case 3:
                dish2.dishStatus();
                dishPrice = dish2.dishPrice();
                 break;
            case 4:
                dish3.dishStatus();
                dishPrice = dish3.dishPrice();
                break;
            case 5:
                 dish4.dishStatus();
                 dishPrice = dish4.dishPrice();
                 break;

            default:
                 System.out.println("Invalid input");
                 return;
        }

        System.out.println("================Please enter your name================");
        String userName = sc.nextLine();
        System.out.println("User name is:"+userName);
        
        System.out.println("============Please pay the amount:"+dishPrice);
        int userPrice = sc.nextInt();
        if(dishPrice < userPrice)
         {
             System.out.println("===========Please collect remaining amount==============="+(userPrice - dishPrice));
            
         }
         
         else if(dishPrice > userPrice){
             System.out.println("================Insuffient amount===================");
         }

         sc.nextLine();
         System.out.println("===========Thanks for your order==========");
        
    
        sc.close();

        
        
    }
}
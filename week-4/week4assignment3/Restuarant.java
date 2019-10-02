import java.util.*;

public class Restuarant{
     
    public static void main(String args[]){

        HashSet<Order> anushaHashset = new HashSet<Order>();
        Order order = new Order(1, "Dosa", "Vinay");
        Order order1 = new Order(2, "Idli", "Mahesh");
        Order order2 = new Order(3, "Upma","Vikram");
        Order order3 = new Order(4, "Neer-Dosa","Puja");
        Order order4 = new Order(5, "vada-Pav","Amar");
        Order order5 = new Order(6, "Roti-curry","Anil");
         
        anushaHashset.add(order);
        anushaHashset.add(order1);
        anushaHashset.add(order2);
        anushaHashset.add(order3);
        anushaHashset.add(order4);
        anushaHashset.add(order5);
       
        Scanner sc = new Scanner(System.in);
        int option  = sc.nextInt();
        if(option == 5 ){
            
        System.out.println("=========Orders=========");
        Iterator<Order> i = anushaHashset.iterator();
        while(i.hasNext())
        {
                System.out.println(i.next());
        }
        
        }

        else {
            System.out.println("Invalid input");
        }
        
        sc.close();
        

        
    }
}
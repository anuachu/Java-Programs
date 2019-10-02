        import java.util.Scanner;
		public class PizzaStore{
		         
				  
				public static void main(String args[]){
				          
						  Scanner in =new Scanner(System.in);
						  
						  System.out.println("Enter the pizza type you need -- ThinCrust (or) CheeseBurst (or) ClassicPan");
				          String crust=in.nextLine();
						  
						  System.out.println("Enter the toppings you need -- corn (or) chicken (or) panner (or) pineapple (or) pepperoni");
						  System.out.println("type null if toppings not required");
						  String toppings=in.nextLine();
						  
						  System.out.println("Enter the sides you need -- coke (or) fries (or) Wedges (or) Nachos ");
						  System.out.println("type null if sides not required");
						  String sides=in.nextLine();
						  
						  System.out.println("Enter the coupen code you have --  50OFF (or) 20OFF ");
						  System.out.println("type null if you don't have a coupen");
						  String coupen=in.nextLine();
						  
						  int a = costOfCrust(crust);
						  int n = costOfToppings(toppings);
						  int i = costOfSides(sides);
						  
						  int before_discount = a+n+i;
						  double dis = discount(before_discount,coupen);
						  
						  if(a==-1)
						     System.out.println("Requested crust "+crust+" is not avaliable");
						  else if(n==-1)
						     System.out.println("Requested toppings "+toppings+" is not avaliable");
						  else if(i==-1)
						     System.out.println("Requested toppings "+toppings+" is not avaliable");
                                                  else if(dis==-1)	
						     System.out.println("Requested discount coupen "+coupen+" is not avaliable");
                                                  else						  
						     System.out.println("The cost of Pizza is "+(before_discount-dis));
                           						  
				}
				 
				 public static int costOfCrust(String crust){
				 
				         if(crust.equals("ThinCrust"))
				         return 100;
				         if(crust.equals("CheeseBurst"))
				         return 150;
				         if(crust.equals("ClassicPan"))
				         return 170;
						 return -1;
						 
					 
				 }
				 public static int costOfToppings(String toppings){
				 
				        
						 if(toppings.equals("corn"))
				         return 80;
				         else if(toppings.equals("chicken"))
				         return 150;
				         else if(toppings.equals("panner"))
				         return 100;
				         else if(toppings.equals("pineapple"))
						 return 50;
						 else if(toppings.equals("pepperoni"))
						 return 70;
						 else if(toppings.equals("null"))
						 return 0;
				         return -1;

				 }
				 
				 public static int costOfSides(String sides){
				 
				     
					     if(sides.equals("coke"))
				         return 50;
				         else if (sides.equals("fries"))
						 return 120;
				         else if (sides.equals("Wedges"))
				         return 100;
				         else if (sides.equals("Nachos"))
						 return 70;
						 else if (sides.equals("null"))
						 return 0;
				         return -1;
				 }
				 
				 public static double discount(double before_discount,String coupen){
				      if(coupen.equals("50OFF")){
					  return 0.5*before_discount;
					  }
					  else if(coupen.equals("20OFF")){
					  return 0.2*before_discount;
					  }
					  else if(coupen.equals("null")){
					  return 0;
					  }
					  else
					  return -1;
				 }
				 
		}


         
public class PizzaShop
{

   public static void main (String args[]) {
String pizza;
String crust;
String Topping;
int numberofTopping = 0;
String Sides;
String extra;
double discount;
int cost;


/* pizza crust*/
System.out.println("What type of crust:");
crust =keyboard.nextline().charAt(0);
if (pizza == thin)
crust = "Thincrust";
else if (pizza == cheese)
crust = "Chesse Burst";
else if(pizza == Classic)
crust = "Classic pan";

/*pizza toppings*/
System.out.println("would you like to have Corn");
if (pizza == 'C'){
pizza = pizza + 1;
}
else 

 System.out.println("would you like to have chicken");

      if (numberofTopping == 'N'){
    numberofTopping = numberofTopping + 1;
Topping = Topping + "and Chicken";
}
else 
System.out.println("would you like to have Panner");

if (numberofTopping == 'P'){
    numberofTopping = numberofTopping + 1;
Topping = Topping + " and Panner";
}
else 
System.out.println("would you like to have Pineapple");
if (numberofTopping == 'I'){
numberofTopping = numberofTopping + 1;
Topping = Topping + "and Pineapple";
}
else 
System.out.println("would you like to have Pepperoni");
if (numberofTopping == 'E'){
numberofTopping = numberofTopping + 1;
Topping = Topping + " and Pepperoni";


/* pizza Sides*/
System.out.println("whats extra Sides would like to have:");
if (extra == 'O')
Sides = "Coke";
else if (extra == 'R')
Sides = "Fries";
else if (extra == 'W')
Sides = "Wedges";
else if (extra == "N")
Sides = "Nachos";

/*pizza cost*/
System.out.println("what type of pizza would you like: (medium,small,large)");
if (size == medium)
{
    cost = 10.99;
}
else if (size == small)
{
    cost = 12.99;
}
else if (size == large)
{
    cost = 16.99;
}
else if (medium != 10 && small != 12 && large !=16){
    System.out.println("The number you have entered is illegal,your pizza size will be set to small");
cost = 12;
}
/*periodic discount*/
System.out.println("20%off on topping of chicken pizza");

/*cost*/
System.out.println(cost);
System.out.println(numberofToppings);
System.out.println(crust);
System.out.println(Sides);
total = (cost) +(numberofTopping * 1.25) + (crust) + (Sides);
discount = 20 / 100 * total;
lasttotal = total; 
}


}
    }

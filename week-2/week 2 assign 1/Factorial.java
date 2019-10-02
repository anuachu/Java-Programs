public class Factorial{  
    static int factorial(int n){    
     if (n == 0)    
       return 1;    
     else    
       return(n * factorial(n-1));    
    }    
    public static void main(String args[]){  
     int i,num=1;  
     int n=4;   
     num= factorial(n);   
     System.out.println("Factorial of "+n+" is: "+num);    
    }  
   }  
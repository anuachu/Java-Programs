

public class Reverse{ 
     static void reverse(int num[],int n, int i) 
     { 
         int number; 
            
         while (n < i) 
         { 
             number = num[n];  
             num[n] = num[i]; 
             num[i] = number; 
             n++; 
             i--; 
         }  
     }      
        
     
     static void printarray(int num[], int size) 
     { 
         for (int i = 0; i < size; i++) 
              System.out.println(num[i] + " "); 
            
          
     }  
   
     public static void main(String args[]) { 
           
         int a[] = {3,4,6,7,9}; 
         printarray(a,5); 
         reverse(a, 0,4); 
         System.out.print("Reversed array is \n"); 
         printarray(a, 5);  
          
     } 
 } 
   

 
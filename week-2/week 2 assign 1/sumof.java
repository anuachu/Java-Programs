 public class sumof { 
    static int num[] = { 3,4,2,7,9}; 
  public static int sumof(int a[], int n) 
    { 
        if (n <= 0) 
            return 0; 
        return (sumof(a, n - 1) + a[n - 1]); 
    } 
  
    
    public static void main(String[] args) 
    { 
        System.out.println(sumof(num, num.length)); 
    } 
} 
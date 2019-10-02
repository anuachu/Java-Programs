import java.util.*;
import java.lang.*;
import java.io.*;




public class Order {
  private int orderId = 1;
  private String dishName ;
   private String customerName;

  
  

  public  Order(int orderId,String dishName,String customerName) {
    this.orderId  = orderId;
    this.dishName = dishName;
	  this.customerName = customerName;
  }
	  public void orderStatus(){
      System.out.println("The OrderId"+this.orderId);
      System.out.println("The dishName is"+this.dishName);
		  System.out.println("The Customer Name is"+this.customerName);
	  
  }
  @Override
  public boolean equals(Object obj) {
      if (obj == null) {
          return false;
      }
      if (getClass() != obj.getClass()) {
          return false;
      }
      final Order other = (Order) obj;
      if ((this.dishName == null) ? (other.dishName != null) : !this.dishName.equals(other.dishName))  {
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
  @Override
  public String toString() {
      return "Order{" + " OrderId " + orderId + ", Name" + dishName + ", customerName" + customerName +'}';
  }
  

}
package com.greatlearning.fsd.week5.assign2.Client;

import com.greatlearning.fsd.week5.assign2.model.*;
import com.greatlearning.fsd.week5.assign2.model.Mobile;
import com.greatlearning.fsd.week5.assign2.model.samsung.*;
import com.greatlearning.fsd.week5.assign2.model.fashion.*;
import java.util.*;


	public class Client {
		
		public static void main(String args[])
	    {
	       Address sellerAddress  =  new  Address(12, "8th cross", "Bangalore", "Karnataka", 560056);
	       Address sellerAddress1 = new Address(16, "9th cross", "Chennai", "tamilNadu", 560003);
	       Address sellerAddress2 = new Address(18, "10th cross", "jayanagar", "Karnataka", 560008);
	       Address sellerAddress3 = new Address(80, "9th cross", "Bangalore", "Karnataka", 560007);
	       

	       	List<Address> sellerList = new ArrayList<Address>();

	       	sellerList.add(sellerAddress);
	       	sellerList.add(sellerAddress1);
	       	sellerList.add(sellerAddress2);
	       	sellerList.add(sellerAddress3);
	       	
	     	sellerList.forEach(e -> System.out.println(e.toString()));
	     	
	      Item item = new Item(012, "s8", "64gb",63000);
	      Item item1 = new Item(013, "s9", "128gb",54000);
	      Item item2 = new Item(014, "s10", "64gb",63000);
	      Item item3 = new Item(015, "lipstick", "Pink-Color",150);
	      
	      	List<Item> itemList = new ArrayList<Item>();
	      
	      	itemList.add(item);
	      	itemList.add(item1);
	      	itemList.add(item2);
	      	itemList.add(item3);
	      
	      itemList.forEach(e -> System.out.println(e.toString()));

	      	Address userAddress = new Address (38, "Vyalikaval", "Bangalore", "Karnataka", 560003);
	      	Address userAddress1 = new Address(12, "Banregata", "Bangalore", "Karnataka", 560064);
	      	Address userAddress2 = new Address(42, "Banshakri", "Bangalore", "Karnataka", 560078);
	      	Address userAddress3 = new Address(89, "Hsr-Layout", "Bangalore", "Karnataka", 560089);
	      	Address userAddress4 = new Address(46, "Mathikere", "Bangalore", "Karnataka", 560096);
	      	
	      	List<Address> addressList = new ArrayList<Address>();
	      	
	      	addressList.add(userAddress);
	      	addressList.add(userAddress1);
	      	addressList.add(userAddress2);
	      	addressList.add(userAddress3);
	      	addressList.add(userAddress4);
	      	
	        addressList.forEach(e -> System.out.println(e.toString()));
	       
	       User user = new User(9, "Anusha",userAddress , "9449010222");
	       User user1 = new User(2, "Ashwini",userAddress1 , "947989878");
	       User user2 = new User(3, "Latha",userAddress2 , "978787892");
	       User user3 = new User(4, "geetha",userAddress3 , "988890892");
	       User user4 = new User(7, "venkatesh",userAddress4 , "999008222");
	       User user5 = new User(01, "Mohan",userAddress , "989010222");
	       
	       	List<User> userList = new  ArrayList<User>();
	       	
	       	userList.add(user);
	       	userList.add(user1);
	       	userList.add(user2);
	       	userList.add(user3);
	       	userList.add(user4);
	       	userList.add(user5);

	        userList.forEach(e -> System.out.println(e.toString()));
	       
	        Cart cart = new Cart();
	       cart.addtoCart("usb", 2, 300);
	       cart.addtoCart("mobile", 1, 30000);
	       cart.addtoCart("cosmetic", 3, 400);
	       cart.addtoCart("carpet", 1, 300);
	       cart.addtoCart("Dove", 1, 100);
	       cart.removefromCart("usb", 1);
	       cart.generateBill();
	       cart.cartDisplay();



	       Inventory inventory = new Inventory();
	       inventory.addtoInventory("victoria secret",3, 600);
	       inventory.removefromInventory("victoria secret", 1);
	       inventory.InventoryDisplay();
	       
	       Payment payment = new Payment(1000, "Anusha","ashwini");
	       payment.pay();

	       Mobile mobile = new Mobile(002, "Samsung", "s7",20000);
	       mobile.MobileStatus();

	       Samsung samsung = new Samsung(1234, "samsungs3", "gorilla glass", 42000);
	       samsung.samsungMob(42000);
	       samsung.samsungStatus();

	       SamsungS8 samsung1 = new SamsungS8(7890, "samsungS8", "gorilla glass", 52000);
	       samsung1.samsungS8Mob(52000);
	       samsung1.samsungS8status();

	       Fashion fashion = new Fashion(900, "bangles", "colors",500);
	       fashion.fashionStatus();

	       Bangles bangles = new Bangles(005, "bangles", "color", 500);
	       bangles.bangles1(500);
	       bangles.banglesStatus();

	       LakmelipStick stick = new LakmelipStick(800, "lipstick", "Lakme", 800);
	       stick.lipStick(800);
	       stick.lipStickStatus();


	    }
	}











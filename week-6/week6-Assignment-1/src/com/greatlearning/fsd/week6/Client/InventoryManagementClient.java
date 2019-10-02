package com.greatlearning.fsd.week6.Client;

import com.greatlearning.fsd.week6.model.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class InventoryManagementClient {
	public static void main(String[] args) {
		BlockingQueue<Product> inventory = new LinkedBlockingQueue<Product>();
		
		Distributor distributor = new Distributor(1, "Anusha",inventory);
		Retailer retailer = new Retailer(1, "Ashwini",inventory);
		
		distributor.start();
		retailer.start();
		

	}

}

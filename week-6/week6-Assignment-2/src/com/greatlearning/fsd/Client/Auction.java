package com.greatlearning.fsd.Client;


	import java.util.Set;
	import java.util.concurrent.CountDownLatch;
	import java.util.HashSet;
	import java.util.Iterator;
	import java.util.Optional;
    import com.greatlearning.fsd.model.*;
	
	public class Auction {
		
		public static void main(String args[]) {
			
			Item car = new Item("Swift-Dezire", 5_00_000, "good condition car");
			Item tv = new Item("Sony-Bravia", 10_000, "in excellent condition");
			Item bike = new Item("Bajaj- Pulsar", 30_000, "run for 20000 Kms");
			Item laptop = new Item("Macbook-Pro", 50000, "one year old laptop. Sparingly used");
			
			Set<Item> items = new HashSet<Item>();
			
			items.add(car);
			items.add(tv);
			items.add(bike);
			items.add(laptop);
			
			Bidder vinay = new Bidder("Vinay");
			Bidder krishna = new Bidder("Krishna");
			Bidder mohan = new Bidder("Mohan");
			Bidder rohan = new Bidder("Rohan");
			
			Set<Bidder> bidders = new HashSet<Bidder>();
			bidders.add(vinay);
			bidders.add(krishna);
			bidders.add(mohan);
			bidders.add(rohan);

			
			Iterator<Item> it = items.iterator();
			while(it.hasNext()) {
				Item item = it.next();
				CountDownLatch latch = new CountDownLatch(4);
				bidders.forEach(e -> 
				{
					
					e.setCountDownLatch(latch) ; 
					e.setItemName(item);
					new Thread(e).start();
				});
				try {
					latch.await(); 
					System.out.println( item.getName() +" is the winner  ");
					Optional<Bidder> bidder = bidders.stream()
													         .max((a, b) -> (int)a.getBidPrice() - (int)b.getBidPrice());
					System.out.println("Bidder: " + bidder.get() + "Item: " + item + "Bid Price: " + (double) bidder.get().getBidPrice());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	
		}
	


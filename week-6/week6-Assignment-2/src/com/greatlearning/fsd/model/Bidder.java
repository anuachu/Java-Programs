package com.greatlearning.fsd.model;

	import java.util.Objects;
	import java.util.Scanner;
	import java.util.concurrent.CountDownLatch;

	import com.greatlearning.fsd.exception.*;

	public class Bidder implements Runnable , Comparable<Bidder> {
		private Scanner scan = new Scanner(System.in);
		
		private int id;
		private String name;

		private Item itemName;
		private double bidPrice;
        private CountDownLatch latch;
		
		public Bidder(String name) {
			this.name = name;
		}

		@Override
		public int compareTo(Bidder other) {
			return name.compareTo(other.getName());
		}

		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public void setItemName(Item itemName) {
			this.itemName = itemName;
		}
		
		private void setBid() {
			this.bidPrice = 0;
		}
		public double getBidPrice() {
			return bidPrice;
		}


		public void setCountDownLatch(CountDownLatch latch) {
			this.latch = latch;
		}

		
		@Override
		public void run() {
			
				try {
					setBid();
					bidding();
				} catch(BidderException e)
				{
					e.printStackTrace();
				}
			}
		
		private void bidding() throws BidderException {
			System.out.println("===============" + name + ": Please enter your bid price, Item: " + itemName.getName() + ", Base price - "+ itemName.getBasePrice() +" ==========");
			double price = scan.nextDouble();
			latch.countDown();
				
			if(price < itemName.getBasePrice())
				throw new BidderException(bidPrice);
			
			bidPrice = price;
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(id, name);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Bidder other = (Bidder) obj;
			return id == other.id && Objects.equals(name, other.name);
		}

		@Override
		public String toString() {
			return "Bidder [id=" + id + ", name=" + name + "]\n";
		}
	}




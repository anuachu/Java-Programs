package com.greatlearning.fsd.week6.model;

import java.util.concurrent.BlockingQueue;

public class Distributor extends Thread{
		private long id;
		private String name;
		private final BlockingQueue<Product> inventory;
		private final int MAX_CAPACITY = 10;
		
		public Distributor(long id, String name, BlockingQueue<Product> inventory) {
			super();
			this.id = id;
			this.name = name;
			this.inventory = inventory;
		}

		@Override
		public String toString() {
			return "Distributor [id=" + id + ", name=" + name + ", inventory=" + inventory + ", MAX_CAPACITY="
					+ MAX_CAPACITY + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + MAX_CAPACITY;
			result = prime * result + (int) (id ^ (id >>> 32));
			result = prime * result + ((inventory == null) ? 0 : inventory.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Distributor other = (Distributor) obj;
			if (MAX_CAPACITY != other.MAX_CAPACITY)
				return false;
			if (id != other.id)
				return false;
			if (inventory == null) {
				if (other.inventory != null)
					return false;
			} else if (!inventory.equals(other.inventory))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}

		@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}
		
	   @Override
	   protected void finalize() throws Throwable{
		   super.finalize();
	   }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDistributorName() {
		return name;
	}

	public void setDistributorName(String name) {
		this.name = name;
	}
	   
	   
	public BlockingQueue<Product> getInventory(){
		return inventory;
		}

	
	public void run() {
		
		try {
			while(true) {
				Product item =inventory.take();
				 System.out.print(getName() + " consumer ");
	                item.displayItem();
	                Thread.sleep(5000);
			}
		}
		catch (InterruptedException e) {
            e.printStackTrace();
		}
		
	}
	
	
	}



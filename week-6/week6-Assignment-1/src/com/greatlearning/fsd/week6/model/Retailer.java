package com.greatlearning.fsd.week6.model;

import java.lang.InterruptedException;
import java.util.concurrent.BlockingQueue;

public class Retailer extends Thread {
	private long id;
	private String retailerName;
	private BlockingQueue<Product> inventory;
	
	public Retailer(long id, String retailerName, BlockingQueue<Product> inventory) {
		super();
		this.id = id;
		this.retailerName = retailerName;
		this.inventory = inventory;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "Retailer [id=" + id + ", retailerName=" + retailerName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((retailerName == null) ? 0 : retailerName.hashCode());
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
		Retailer other = (Retailer) obj;
		if (id != other.id)
			return false;
		if (retailerName == null) {
			if (other.retailerName != null)
				return false;
		} else if (!retailerName.equals(other.retailerName))
			return false;
		return true;
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRetailerName() {
		return retailerName;
	}

	public void setRetailerName(String retailerName) {
		this.retailerName = retailerName;
	}

	public BlockingQueue<Product> getInventory(){
		return inventory;
	}
	public void setInventory(BlockingQueue<Product> inventory) {
		this.inventory = inventory;
	}

	@Override
	public void run() {
		for(int i = 0; i <11; i++) {
			System.out.println(getName()+"Retailer");
			try {
				inventory.put(new Product(i, "product",20000+100*i ));		}
			catch(InterruptedException e1) {
				e1.printStackTrace();
			}
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}




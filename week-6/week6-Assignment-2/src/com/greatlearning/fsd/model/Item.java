package com.greatlearning.fsd.model;


import java.util.Objects;

	public class Item implements Comparable<Item> {
		

		private int id;
		private String name;
		private double basePrice;
		private String desc;
		
		public  Item(String name, double basePrice, String desc) {
			this.name = name;
			this.basePrice = basePrice;
			this.desc = desc;
		}

		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}
		
		public double getBasePrice() {
			return basePrice;
		}
		public void setBasePrice(double basePrice) {
			this.basePrice = basePrice;
		}

		public String getDesc() {
			return desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}

		@Override
		public int compareTo(Item other) {
			return this.name.compareTo(other.getName());
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			long temp;
			temp = Double.doubleToLongBits(basePrice);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + ((desc == null) ? 0 : desc.hashCode());
			result = prime * result + id;
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
			Item other = (Item) obj;
			if (Double.doubleToLongBits(basePrice) != Double.doubleToLongBits(other.basePrice))
				return false;
			if (desc == null) {
				if (other.desc != null)
					return false;
			} else if (!desc.equals(other.desc))
				return false;
			if (id != other.id)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Item [id=" + id + ", name=" + name + ", basePrice=" + basePrice + ", desc=" + desc + "]";
		}

		
	}




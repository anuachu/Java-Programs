package com.greatlearning.fsd.week5.assign2.model;

public class Item {

    private int id;
    private String name;
    private String description;
    private int price;

    public Item(int id,String name,String description,int price){
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }
public void displayItem(){
    System.out.println("Item id is:"+" "+id);
    System.out.println("Item name is"+" "+name);
    System.out.println("Item description is"+" "+description);
    System.out.println("Item price is:"+" "+price);

}
@Override
public String toString() {
	return "Item [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((description == null) ? 0 : description.hashCode());
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + price;
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
	if (description == null) {
		if (other.description != null)
			return false;
	} else if (!description.equals(other.description))
		return false;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (price != other.price)
		return false;
	return true;
}

    }



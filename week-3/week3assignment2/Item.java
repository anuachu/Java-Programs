public class Item{
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
    }

    

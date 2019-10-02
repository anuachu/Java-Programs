public class User{
    private int id;
    private String name;
    private Address address;
    private String contactDetails;

    public User(int id,String name,Address address,String contactDetails){
        this.id = id;
        this.name = name;
        this.address = address;
        this.contactDetails = contactDetails;
    }

    public void userDisplay(){
      System.out.println("User Details is:"+" "+this.id);
      System.out.println("User name is:"+" "+this.name);
      System.out.println("User address is:"+" "+this.address);
      System.out.println("User contact details is:"+" "+this.contactDetails);

    }
    
}

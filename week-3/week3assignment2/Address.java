public class Address{
    private int flatno;
    private String street;
    private String city;
    private String state;
    private int pinCode;

    public Address(int flatno,String street,String city,String state,int pinCode){
        this.flatno = flatno;
        this.street = street;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;

    }
    public void addressStatus(){
        System.out.println("Flatno is:"+" "+this.flatno);
        System.out.println("Street:"+" "+this.street);
        System.out.println("City"+" "+this.city);
        System.out.println("State"+" "+this.state);
        System.out.println("pinCode"+" "+this.pinCode);
    }
    
}
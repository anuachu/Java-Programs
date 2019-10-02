public class Payment{
    private int amount;
    private String to;
    private String from;

    public Payment(int amount,String to,String from){
        this.amount = amount;
        this.to = to;
        this.from = from;
    }
    public void pay(){
       System.out.println("Payment on process"+" " + this.amount+" "+ "payment to"  +" "+  this.to + " " + "payment from"  +" "+  this.from);
       
    }
    }


    
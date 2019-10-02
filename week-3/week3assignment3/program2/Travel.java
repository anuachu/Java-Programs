public class Travel extends DriveGate implements Drive{
    private String from;
    private String to;

    public Travel(String from, String to, int type){
        super(from, to, type);
        this.from = from;
        this.to   = to;
    }

    public void drive(){
        System.out.println("Travelling from "+ this.from + " to "+ this.to);
    }

    public void travelCost(){
        int money =super.getCost();
        
    }
}
 interface Drive{
    public abstract void drive();
}

abstract class DriveGate{
    
    private int money;
    private String from;
    private String to;
    private int type; 

 DriveGate(String from, String to, int type){
        this.from = from;
        this.to   = to;
        this.type = type;
        if( this.type == 1){
            this.money = 1000;
            System.out.println("Cost of travelling in Wagnour is: "+ money);
        }
        else if(this.type == 2){
            this.money = 5000;
            System.out.println("Cost of travelling in BMW is: "+money);
        }
    }

    public abstract void travelCost();
    public int getCost(){
        return this.money;

    }

}

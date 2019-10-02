package com.greatlearning.fsd.week5.assign2.model;

public class Address {
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
	@Override
	public String toString() {
		return "Address [flatno=" + flatno + ", street=" + street + ", city=" + city + ", state=" + state + ", pinCode="
				+ pinCode + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + flatno;
		result = prime * result + pinCode;
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
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
		Address other = (Address) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (flatno != other.flatno)
			return false;
		if (pinCode != other.pinCode)
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		return true;
	}
	
	
    
}





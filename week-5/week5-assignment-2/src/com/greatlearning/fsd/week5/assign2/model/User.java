package com.greatlearning.fsd.week5.assign2.model;

public class User {
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

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + ", contactDetails=" + contactDetails
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((contactDetails == null) ? 0 : contactDetails.hashCode());
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
		User other = (User) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (contactDetails == null) {
			if (other.contactDetails != null)
				return false;
		} else if (!contactDetails.equals(other.contactDetails))
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
    
    
}




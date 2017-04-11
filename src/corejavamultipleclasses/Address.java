package corejavamultipleclasses;

public class Address {
	
	String address1;
    String address2;
    String city;
        
    public Address(String address1, String address2, String city){
    	this.address1 = address1;
    	this.address2 = address2;
    	this.city = city;
    	    	
    }

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getState() {
		return city;
	}

	public void setState(String state) {
		this.city = state;
	}

    public String toString()
    {
    	String addr = this.address1 + " " + this.address2 + " " + this.city;
    	
    	return addr;
    }
    
}

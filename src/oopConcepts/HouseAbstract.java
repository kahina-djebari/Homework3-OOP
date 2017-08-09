package oopConcepts;

public abstract class HouseAbstract {
	
	//Overriding
	public int numBathroom(int bathroom){
	System.out.println("This house has " + bathroom + " bathrooms");
	return bathroom;
	}
	
	//final //disable overriding
	public final String location(String address){
		System.out.println("This house is located in the " + address);
	    return address;
	}
	
	abstract public int numFloors(int floors);
}

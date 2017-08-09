package oopConcepts;

public class HouseConcrete extends HouseAbstract implements HouseInterface {
	
	//encapsulation
	private String owner;
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	//Overloading
	public String color(String color1){
	System.out.println("This house is " + color1);
	return color1;
	}
	public String color(String color1 , String color2){
	System.out.println("This house is " + color1 + " with " + color2 + " windows");
	return color2;
	}
	
	//Overriding
	public int numBathroom(int bathroom){
		System.out.println("This house has " + bathroom + " bathrooms" + ", one half and three full");
		return bathroom;
		}

	@Override
	public void yard() {
		System.out.println("This house has front and back yard");
	}
	@Override
	public void basement() {
		System.out.println("Tow ways to access the basement");
	}
	@Override
	public int numFloors(int floors) {
		System.out.println("This house has " + floors + " floors");
		return floors;
	}	
}

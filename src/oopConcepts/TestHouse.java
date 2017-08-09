package oopConcepts;

public class TestHouse {

	public static void main(String[] args) {
		
		HouseConcrete myHouse = new HouseConcrete();
		
		myHouse.setOwner("Kahina");
		System.out.println(myHouse.getOwner());
		myHouse.color("white");
		myHouse.color("white", "black");
		myHouse.numBathroom(4);
				
		HouseAbstract myHouse1 = new HouseConcrete();
		myHouse1.location("USA");
		myHouse1.numBathroom(3);
		myHouse1.numFloors(2);
		
		HouseInterface myHouse2 = new HouseConcrete();
		myHouse2.yard();
		myHouse2.basement();
		

	}

}

package labweek2;

public class Driver {

	public static void main(String[] args) 
	{
		//Create Room Object
		Room roomObj = new Room();
		roomObj.setName("Lab C");
		roomObj.setCapacity(23);
		//Create a object using the primary key
		Room roomObj1 = new Room("Lab D",27);
		
		roomObj.display();
		roomObj1.display();
		//Create SmokeDetector Object
		SmokeDetector smokeObj = new SmokeDetector();
		
		smokeObj.setThreshold(50);
		
		//Monitor both room objects
		smokeObj.addRoomToBeMonitored(roomObj);
		smokeObj.addRoomToBeMonitored(roomObj1);
		smokeObj.checkAlarm(75);
		smokeObj.checkAlarm(35);
		
	}

}

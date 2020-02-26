package labweek2;

public class SmokeDetector 
{
	private int size;
	private Room[] room = new Room[size];
	private float threshold;
	private int roomCount = 0;
	
	//Default Constructor
	public SmokeDetector()
	{
		super();
		threshold = 0;
		size = 5;
	}
	//Primary Constructor
	public SmokeDetector(float threshold)
	{
		this.threshold = threshold;
	}
	//Getters and Setters
	public int getRoomCount() 
	{
		return roomCount;
	}
	public Room[] getRoom() {
		return this.room;
	}
	public void setRoom(Room[] room) {
		this.room = room;
	}
	public int getSize() {
		return this.size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public boolean addRoomToBeMonitored(Room room) 
	{
		if(getRoomCount() < size) 
		{
			this.room[roomCount] = room;
			roomCount++;
			return true;
		}
		System.out.println("Can not store any more rooms.");
		return false;
	}
	public float getThreshold() {
		return threshold;
	}
	public void setThreshold(float threshold) {
		this.threshold = threshold;
	}
	public boolean checkAlarm(float SmokeLevel) 
	{
		if(SmokeLevel > getThreshold()) 
		{
			for(int i = 0; i < getRoomCount(); i++) 
			{
				room[i].display();
			}
			return true;//Raise Alarm
		}
		else
		{
			return false;
		}
	}
	
}

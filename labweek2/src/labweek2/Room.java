package labweek2;

public class Room 
{
	private String name;
	private int capacity;
	//Default Constructor
	public Room() 
	{
		this.name = " ";
		this.capacity = 0;
	}
	//Primary Constructor
	public Room(String name, int capacity) 
	{
		this.name = name;
		this.capacity = capacity;
	}
	//Copy Constructor
	public Room(Room obj) 
	{
		setName(obj.name);
		setCapacity(obj.capacity);
	}
	//Getter and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	@Override
	public String toString() {
		return "Room [name=" + name + ", capacity=" + capacity + "]";
	}
	public void display() 
	{
		System.out.println(toString());
	}
}

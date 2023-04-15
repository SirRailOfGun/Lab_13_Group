package Lesson13;
/**
 * Class extension from room that returns based on a classroom setting
 * @author Robert
 *
 */
public class Classroom extends Room{
	public int numOfChairs;
	/**
	 * Default constructor that uses the superclass area
	 * @param area
	 */
	Classroom(int area) {
		super(area);
		
	}
	/**
	 * Constructor that takes numOfChairs and superclass area as parameters
	 * @param area
	 * @param chairs
	 */
	Classroom(int area, int chairs){
		super(area);
		this.numOfChairs = chairs;
	}
	/**
	 * Getter and setter for the number of chairs in the room
	 * @return
	 */
	public int getNumOfChairs() {return this.numOfChairs;}
	public void setNumOfChairs(int numberChairs) {this.numOfChairs = numberChairs;}
	/**
	 * Gets the capacity based on the number of chairs
	 */
	public int getCapacity() {
		int capacity = this.numOfChairs;
		return capacity;
	}
	/**
	 * Returns a string using the area, capacity, and number of chairs
	 */
	public String toString() {
		return "Area in Square Feet: " + this.area + "\nCapacity: " + this.getCapacity()
		+ "\nNumber of Chairs: " + this.numOfChairs;
	}

}

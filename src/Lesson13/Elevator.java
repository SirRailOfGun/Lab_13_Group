package Lesson13;
/**
 * Class extension from room that returns based on an elevator setting
 * @author Robert
 *
 */
public class Elevator extends Room{
	public int currentFloor;
	/**
	 * Default constructor that uses superclass area
	 * @param area
	 */
	Elevator(int area) {
		super(area);

	}
	/**
	 * A getter for the current floor of the elevator
	 * @return
	 */
	public int getFloor() {return this.currentFloor;}
	/**
	 * Mutators that change the current floor
	 * @param floors
	 */
	public void up(int floors) {this.currentFloor += floors;}
	public void down(int floors) {this.currentFloor -= floors;}
	/**
	 * Returns a string using the area, capacity, and current floor
	 */
	public String toString() {
		return "Area in Square Feet: " + this.area + "\nCapacity: " + this.getCapacity()
		+ "\nCurrent Floor: " + this.currentFloor;
	}
}

package Lesson13;

/**
 * Class that gets area and capacity of basic room
 * 
 * @author Robert
 *
 */
public class Room {
	public int area;
	/**
	 * Default constructor that takes area as a parameter
	 * 
	 * @param area
	 */
	Room(int area){
		this.area = area;
	}
	/**
	 * Getter and setter for area
	 * @return
	 */
	public int getSquareFeet() { return this.area;}
	public void setSquareFeet(int newArea) { this.area = newArea;}
	/**
	 * Accessor that finds the capacity based on the area
	 * @return
	 */
	public int getCapacity() { 
		int capacity = this.area / 9;
		return capacity;
		}
	/**
	 * Returns a string using area and capacity
	 */
	public String toString() {
		return "Area in Square Feet: " + this.area +
				"\nCapacity: " + this.getCapacity();
	}
}

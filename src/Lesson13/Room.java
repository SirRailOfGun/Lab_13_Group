package Lesson13;

public class Room {
	public int area;
	
	Room(int area){
		this.area = area;
	}
	
	public int getSquareFeet() { return this.area;}
	public void setSquareFeet(int newArea) { this.area = newArea;}
	
	public int getCapacity() { 
		int capacity = this.area / 9;
		return capacity;
		}
	
	public String toString() {
		return "Area in Square Feet: " + this.area +
				"\nCapacity: " + this.getCapacity();
	}
}

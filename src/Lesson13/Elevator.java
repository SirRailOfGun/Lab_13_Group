package Lesson13;

public class Elevator extends Room{
	public int currentFloor;
	Elevator(int area) {
		super(area);

	}
	
	public int getFloor() {return this.currentFloor;}
	public void up(int floors) {this.currentFloor += floors;}
	public void down(int floors) {this.currentFloor -= floors;}
	
	public String toString() {
		return "Area in Square Feet: " + this.area + "\nCapacity: " + this.getCapacity()
		+ "\nCurrent Floor: " + this.currentFloor;
	}
}

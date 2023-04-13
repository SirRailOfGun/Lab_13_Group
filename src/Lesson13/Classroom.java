package Lesson13;

public class Classroom extends Room{
	public int numOfChairs;
	
	Classroom(int area) {
		super(area);
		
	}
	
	Classroom(int area, int chairs){
		super(area);
		this.numOfChairs = chairs;
	}
	
	public int getNumOfChairs() {return this.numOfChairs;}
	public void setNumOfChairs(int numberChairs) {this.numOfChairs = numberChairs;}
	
	public int getCapacity() {
		int capacity = this.numOfChairs;
		return capacity;
	}
	
	public String toString() {
		return "Area in Square Feet: " + this.area + "\nCapacity: " + this.getCapacity()
		+ "\nNumber of Chairs: " + this.numOfChairs;
	}

}

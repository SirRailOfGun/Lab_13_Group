package Lesson13;

import java.util.Scanner;

import Lab_12.StringSet;

public class Control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testRooms();
		testStrings();
	}
	
	static void testRooms()
	{
		Room room = new Room(0);
		Classroom classroom = new Classroom(0);
		Elevator elevator = new Elevator(0);
		System.out.println(room);
		System.out.println(room.getCapacity());
		System.out.println(room.getSquareFeet());
		room.setSquareFeet(90);
		System.out.println(room);
		System.out.println(room.getCapacity());
		System.out.println(room.getSquareFeet());

		System.out.println(classroom);
		System.out.println(classroom.getCapacity());
		System.out.println(classroom.getSquareFeet());
		System.out.println(classroom.getNumOfChairs());
		classroom.setSquareFeet(90);
		classroom.setNumOfChairs(75);
		System.out.println(classroom);
		System.out.println(classroom.getCapacity());
		System.out.println(classroom.getSquareFeet());
		System.out.println(classroom.getNumOfChairs());

		System.out.println(elevator);
		System.out.println(elevator.getCapacity());
		System.out.println(elevator.getSquareFeet());
		System.out.println(elevator.getFloor());
		elevator.setSquareFeet(9);
		elevator.up(7);
		System.out.println(elevator);
		System.out.println(elevator.getCapacity());
		System.out.println(elevator.getSquareFeet());
		System.out.println(elevator.getFloor());
		elevator.down(5);
		System.out.println(elevator);
		System.out.println(elevator.getCapacity());
		System.out.println(elevator.getSquareFeet());
		System.out.println(elevator.getFloor());
	}

	static void testStrings()
	{
		StringSet myClass = new StringSet();
		Scanner scan = new Scanner(System.in);
		System.out.print("How many strings will you enter? ");
		int numStr = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < numStr; i++)
		{
			myClass.add(scan.nextLine());
		}
		System.out.print("\n\n\nsize = ");
		System.out.print(myClass.size());
		System.out.print("\nnumber of characters = ");
		System.out.print(myClass.numChars());
	}
}

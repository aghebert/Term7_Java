import java.util.*;

public class RoomOccupancy {

	public int NumberInRoom;
	public static int TotalNumber;

	public RoomOccupancy() {
		NumberInRoom = 0;
		TotalNumber = 0;

	}

	public void addOneToRoom() {
		NumberInRoom += 1;
		TotalNumber += 1;
	}

	public void removeOneFromRoom() {
		if (NumberInRoom > 0) {
			NumberInRoom -= 1;
			TotalNumber -= 1;
		}
	}

	public int getNumber() {
return NumberInRoom;
	}

	public static int getTotal() {
return TotalNumber;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoomOccupancy room1 = new RoomOccupancy();
		RoomOccupancy room2 = new RoomOccupancy();

		room1.addOneToRoom();
		room1.addOneToRoom();
		room2.addOneToRoom();
		room2.addOneToRoom();
		room2.addOneToRoom();

		System.out.println("Added people to rooms 1 and 2");

		System.out.println("People in room 1: " + room1.getNumber());
		System.out.println("People in room 2: " + room2.getNumber());

		room1.removeOneFromRoom();
		room1.removeOneFromRoom();
		room1.removeOneFromRoom();
		room2.removeOneFromRoom();
		room2.removeOneFromRoom();

		System.out.println("Removed people from rooms 1 and 2");

		System.out.println("People in room 1: " + room1.getNumber());
		System.out.println("People in room 2: " + room2.getNumber());
		
		System.out.print("Total people: " + RoomOccupancy.getTotal());
	}

}

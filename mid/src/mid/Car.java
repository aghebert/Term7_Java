package mid;

public class Car {
	private String brand = "Toyota";
	private String color = "Red";
	private int doorNum = 4;
	public static int objectCounter=0;
	public static final int MPG = 30;
	
	public Car(String getBrand, String getColor, int getDoorNum) {
		brand = getBrand;
		color = getColor;
		doorNum = getDoorNum;
		objectCounter++;
	}
	


	public static int calculateRange(int totalGallons) {
		int totalMiles = MPG * totalGallons;
		return totalMiles;
	}
	
	public static void printCar(String brand, String color, int doorNum) {
		System.out.println("Car brand: " + brand);
		System.out.println("Car color: " + color);
		System.out.println("Number of car doors: " + doorNum);
		
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

}

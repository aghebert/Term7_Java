import java.util.*;

public class Lab1Part1 {
    
    public static void main(String[] args)
    {
    //needs import java.util*;
    Scanner keyboard = new Scanner(System.in);
  double x1, x2, y1, y2, distance;
     
    //output and input
    
  System.out.println("First X coordinate: ");
  x1 = keyboard.nextDouble();
  System.out.println("First y coordinate: ");
  y1 = keyboard.nextDouble();
  System.out.println("Second X coordinate: ");
  x2 = keyboard.nextDouble();
    System.out.println("Second y coordinate: ");
    y2 = keyboard.nextDouble();
    
distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1,  2));

//Output
System.out.println("The distance is: " + distance);
    System.lineSeparator();

    
    System.out.println("Press return key to exit");
    String junk = keyboard.nextLine();

}
}


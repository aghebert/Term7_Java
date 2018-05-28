import java.util.Scanner;

public class A2P1 {
    
    public static void main(String[] args)
    {
    //needs import java.util*;
    Scanner keyboard = new Scanner(System.in);
    double distance, milesPG, pricePG, cost;
     
    //output and input
    
    System.out.println("Enter the driving distance:");
    distance = keyboard.nextDouble();
    
    System.out.println("Enter miles per gallon:");
    milesPG = keyboard.nextDouble();
    
    System.out.println("Enter price per gallon:");
    pricePG = keyboard.nextDouble();
    
    cost = (distance / milesPG) *pricePG;
  
    
    System.out.println("The cost of driving is $" + cost);
    
    //Pause
    
    System.out.println("Press return key to exit");
    String junk = keyboard.nextLine();

}
}

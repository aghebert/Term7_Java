import java.util.*;

public class Calc {
    
    public static void main(String[] args)
    {
    //needs import java.util*;
    Scanner keyboard = new Scanner(System.in);
    int intN1, intN2;
    String strName;
     
    //output and input
    System.out.println("Please enter your name:");
    strName = keyboard.nextLine();
    
    System.out.println("Please enter the first #:");
    intN1 = keyboard.nextInt();
    
    System.out.println("Please enter the second #:");
    intN2 = keyboard.nextInt();
    
    int intResult = intN1 + intN2;
    
    System.out.println("The sum is: " + intResult);
    
    //Pause
    
    System.out.println("Press return key to exit");
    String junk = keyboard.nextLine();

}
}

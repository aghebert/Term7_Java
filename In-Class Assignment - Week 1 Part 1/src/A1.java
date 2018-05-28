import java.util.Scanner;

public class A1 {
    
    public static void main(String[] args)
    {
    //needs import java.util*;
    Scanner keyboard = new Scanner(System.in);
    double num1, num2;
    String strName;
     
    //output and input
    
    System.out.println("Please enter the first #:");
    num1 = keyboard.nextDouble();
    
    System.out.println("Please enter the second #:");
    num2 = keyboard.nextDouble();
    
    double dblResult = num1 * num2;
  
    
    System.out.println("The double result is " + dblResult);
    System.out.println("The integer result is: " + (int) dblResult);
    
    //Pause
    
    System.out.println("Press return key to exit");
    String junk = keyboard.nextLine();

}
}

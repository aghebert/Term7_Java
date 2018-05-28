import java.util.Scanner;

public class Lab1Part2 {
    
    public static void main(String[] args)
    {
    //needs import java.util*;
    Scanner keyboard = new Scanner(System.in);
    String inputString, tempStringFirst, tempStringEnd, tempStringCapFirst, tempStringCapEnd, completeString;
    int stringIndex;
     
    //output and input
    
    System.out.println("Enter a line of text. No punctuation please.");
    inputString = keyboard.nextLine();
    
    stringIndex = inputString.indexOf(" ");
 
 
  tempStringFirst = inputString.substring(0, stringIndex);
  tempStringEnd = inputString.substring(stringIndex + 1 );
  
    
   
    //Grabs the first letter of the rest of the string, then capitalizes it
tempStringCapFirst = inputString.substring(stringIndex + 1, stringIndex + 2);
tempStringCapFirst = tempStringCapFirst.toUpperCase();

//grabs everything after the first letter of the second word in the string
tempStringCapEnd = inputString.substring(stringIndex + 2);

//Concatnate everything
completeString = tempStringCapFirst + tempStringCapEnd + " " + tempStringFirst;

//Output
System.out.println("I have rephrased that line to read: ");
    System.lineSeparator();
    System.out.println(completeString);
    //Pause
    
    System.out.println("Press return key to exit");
    String junk = keyboard.nextLine();

}
}


import java.util.Scanner;

public class A2P2 {
    
    public static void main(String[] args)
    {
    //needs import java.util*;
    Scanner keyboard = new Scanner(System.in);
    String string1, string2, string3;
    StringBuffer buff = new StringBuffer("");
     
    //output and input
    
    System.out.println("Enter three words:");
    string1 = keyboard.nextLine();
    buff.append(string1);
    string2 = keyboard.nextLine();
    buff.append(string2);
    string3 = keyboard.nextLine();
    buff.append(string3);

    System.out.println("Concatenated String = " + string1 + string2 + string3);
    System.out.println("StringBuffer = " + buff);
    
    //Pause
    
    System.out.println("Press return key to exit");
    String junk = keyboard.nextLine();

}
}

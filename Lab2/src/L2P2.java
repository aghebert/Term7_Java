//import java.io.BufferedReader;
//import java.io.InputStreamReader;

import java.util.Scanner;


public class L2P2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, counter, numTemp, numBig;
        num = 1;
        counter = 1;
        numTemp = 1;


        System.out.print("Enter an integer (0 ends the input): ");

        while (num != 0) {

            //grab input and assign it to numTemp
            num = input.nextInt();
            System.out.print("numTemp is " + numTemp + " \n");
            System.out.print("num is " + num + " \n");
            //if the input (numTemp) is greater than the stored value (num), assign the new value to it.
            if (num > numTemp) {
                numTemp = num;
                counter = 1;
                System.out.print("Counter +1 \n");
            } else if (num == numTemp) {
                counter += 1;
            }
            System.out.print("Loop end \n\n");
        }
        System.out.println("The largest number is " + numTemp);
        System.out.println("The number " + numTemp + " appears " + counter + " times.");

    }


}

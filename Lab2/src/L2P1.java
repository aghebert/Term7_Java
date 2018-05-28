import java.text.DecimalFormat;
import java.util.Scanner;

public class L2P1 {

    public static void main(String[] args) {

        DecimalFormat decimalFormat = new DecimalFormat("###.##");
        Scanner input = new Scanner(System.in);
        double weight, height, bmg, calories, numCandyBars;
        int age;
        String sex, activityLevel;

        sex = "";
        bmg = 0;
        calories = 0;
        age = 0;

        System.out.println("How old are you?");
        age = (input.nextInt());

        input.nextLine();

        System.out.println("How tall in inches are you?");
        height = (input.nextDouble());

        input.nextLine();

        System.out.println("How much do you weigh in pounds?");
        weight = (input.nextDouble());

        input.nextLine();

        System.out.println("Please input either \"M\" or \"F\".");
        sex = (input.nextLine().toUpperCase());

        //input.nextLine();
        //System.out.println(sex);

        while (!sex.equals("M") && !sex.equals("F")) {

            System.out.println("Please input either \"M\" or \"F\" ONLY. x");
            sex = (input.nextLine().toUpperCase());

        }

        if (sex.equals("M")) {
            bmg = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);

        } else if (sex.equals("F")) {
            bmg = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
        }

        System.out.println("Are you: \n A. Sedentary \n B. Somewhat Active (exercise occasionally) \n C. Active (exercise 3-4 days per week) \n D. Highly Active (exercise everyday) \n Enter A, B, C, or D.");
        activityLevel = (input.nextLine().toUpperCase());

        switch (activityLevel) {
            case "A":
                bmg = (bmg * .2) + bmg;
                break;
            case "B":
                bmg = (bmg * .3) + bmg;
                break;
            case "C":
                bmg = (bmg * .4) + bmg;
                break;
            case "D":
                bmg = (bmg * .5) + bmg;
                break;

        }

        //numCandyBars = Math.round(bmg/230 * 100) / 100;
        numCandyBars = (bmg/230);

        if (sex.equals("M")) {
            System.out.println("A male with those measurements should eat " + decimalFormat.format(numCandyBars) + " candy bars per day to maintain the same weight.");

        } else if (sex.equals("F")) {
            System.out.println("A female with those measurements should eat " + decimalFormat.format(numCandyBars) + " candy bars per day to maintain the same weight.");

        }

System.exit(0);
    }


}

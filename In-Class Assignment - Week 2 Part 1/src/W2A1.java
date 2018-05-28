import java.util.*;

public class W2A1 {

	public static void main(String[] args) {

		String userThrow, compThrowString, outcome;
		int compThrow, userThrowInt;

		Scanner user_input = new Scanner(System.in);

		System.out.println("Let's play a game...");
		System.lineSeparator();
		System.out.println("Rocks Paper Scissors");
		System.lineSeparator();
		System.out.println("Please enter either \"rock\", \"paper\", or \"scissors\"");

		userThrow = user_input.nextLine();

		if (userThrow.equals("rock") || userThrow.equals("paper") || userThrow.equals("scissors")) {
			userThrowInt = IntThrowConvert(userThrow);
			compThrow = Random();
			compThrowString = StringThrowConvert(compThrow);
			outcome = RoShamBo(userThrowInt, compThrow);

			System.out.println("You threw " + userThrow + ". The Computer threw " + compThrowString + ". " + outcome);

			System.exit(0);
		}

		else {
			System.out.println("You did not enter a correct option. Goodbye");
			System.exit(1);
		}

	}

	public static int Random() {

		int max = 2;
		int min = 0;
		int range = max - min + 1;

		// generate random number from 1 to 10
		int rand = (int) (Math.random() * range) + min;

		return rand;
	}

	public static int IntThrowConvert(String throwString) {
		int throwNum = -1;
		
		if (throwString.equals("rock")) {
			throwNum = 0;
		} else if (throwString.equals("paper")) {
			throwNum = 1;
			
		} else if (throwString.equals("scissors")) {
			throwNum = 2;
		} else {
			
			System.out.println("How did you get here? Impossible!");
			System.exit(1);
		}
		
		return throwNum;
	}
	
	public static String StringThrowConvert(int throwNum) {
		 String throwString = "";

		if (throwNum == 0) {
			throwString = "rock";
		} else if (throwNum == 1) {
			throwString = "paper";

		} else if (throwNum == 2) {
			throwString = "scissors";
		} else {

			System.out.println("How did you get here? Impossible!");
			System.exit(1);
		}

		return throwString;
	}

	public static String RoShamBo(int userThrowRSB, int compThrowRSB) {
		String outcomeRSB = "";

		if (userThrowRSB == compThrowRSB) {
			outcomeRSB = "You both threw the same. It's a tie!";
			
		} else if (userThrowRSB == 0) {
			switch (compThrowRSB) {
			case 1:
				outcomeRSB = "Computer wins!";
				break;

			case 2:
				outcomeRSB = "You win!";
				break;

			default:
				System.out.println("You broke me. Error: 0");
				System.out.println("compThrowRSB: " + compThrowRSB);
				System.out.println("userThrowRSB: " + userThrowRSB);
				System.exit(1);
			}
		} else if (userThrowRSB == 1) {
			switch (compThrowRSB) {
			case 2:
				outcomeRSB = "Computer wins!";
				break;

			case 0:
				outcomeRSB = "You win!";
				break;
			default:
				System.out.println("You broke me. Error: 1");
				System.out.println("compThrowRSB: " + compThrowRSB);
				System.out.println("userThrowRSB: " + userThrowRSB);
				System.exit(1);
			}

		} else if (userThrowRSB == 2) {
			switch (compThrowRSB) {

			case 0:
				outcomeRSB = "Computer wins!";
				break;

			case 1:
				outcomeRSB = "You win!";
				break;
			default:
				System.out.println("You broke me. Error: 2");
				System.out.println("compThrowRSB: " + compThrowRSB);
				System.out.println("userThrowRSB: " + userThrowRSB);
				System.exit(1);
			}

		}

		return outcomeRSB;
	}

}

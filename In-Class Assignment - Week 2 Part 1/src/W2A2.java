import java.util.*;

public class W2A2 {

	public static void main(String[] args) {
		char temp;
		String license;

		license = RandChar();
		license += RandChar();
		license += RandChar();
		license += (int) (Math.random() * 9);
		license += (int) (Math.random() * 9);
		license += (int) (Math.random() * 9);
		license += (int) (Math.random() * 9);

		System.out.println("A random vehicle plate number: " + license);

	}

	public static String RandChar() {
		int ranNum;
		char ranChar;
		String string;
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		ranNum = (int) (Math.random() * 25);

		ranChar = alphabet.charAt(ranNum);
		string = Character.toString(ranChar);

		return string;

	}
}
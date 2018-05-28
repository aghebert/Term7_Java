
import java.util.*;

public class L2P3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int numero, denom;

		numero = 1;

		while (numero != 0) {
			// if numerator is 0, then when the program loops, it will quit
			System.out.print("Enter a numerator: ");
			numero = input.nextInt();

			// if numerator is not 0, ask for the denominator and run through the types of
			// fraction it could be
			if (numero != 0) {
				System.out.print("Enter a denominator: ");
				denom = input.nextInt();

				if (numero < denom) {

					System.out.print(numero + "/" + denom + " is a proper fraction \n\n");

				} else if (numero > denom && numero % denom == 0) {
					System.out.print(numero + "/" + denom + " is an improper fraction and can be reduced to "
							+ (numero / denom) + "\n\n");

				} else if (numero > denom && numero % denom != 0) {
					System.out.print(numero + "/" + denom + " is an improper fraction and it's mixed fraction is " + (numero / denom) + " + " + (numero % denom) + "/" + denom + "\n\n");
				}

			}
		}
		System.out.print("program exited");
			System.exit(0);
		

	}
}

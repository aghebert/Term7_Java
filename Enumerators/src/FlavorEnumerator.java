import java.util.*;

enum icecream {
	chocolate, vanilla, strawberry
}

public class FlavorEnumerator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		for (icecream flavor : icecream.values()) {

			switch (flavor) {
			case vanilla:
				System.out.println(flavor + ": The best flavor!");
				break;
			case strawberry:
				System.out.println(flavor + ": If I need to... Third favorite");
				break;
			case chocolate:
				System.out.println(flavor + ": It's ok. Second favorite");
				break;
			default:
				System.out.println("Give me a correct flavor!");
				break;

			}
		}
	}
}

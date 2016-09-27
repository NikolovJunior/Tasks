import java.util.Scanner;

public class ExerciseTen {
	/*
	 * Въведете число от клавиатурата и определете дали е просто. Просто число е
	 * това което се дели САМО на 1 и на себе си.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = input.nextInt();
		boolean prime = true;

		if (number == 0 || number == 1) {
			System.out.println("Is not prime.");
			prime = false;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				System.out.println("Is not prime.");
				prime = false;
				break;
			}
		}
		if (prime == true) {
			System.out.println("Is prime.");
		}

		input.close();
	}

}

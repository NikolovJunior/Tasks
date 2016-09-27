import java.util.Scanner;

public class ExerciseTwentyFour {
	/*
	 * Едно число X е палиндром, aко се чете еднакво отпред назад и отзад
	 * напред. Да се състави програма, която проверява дали въведено число е
	 * палиндром. 
	 * Входни данни: N - естествено число от интервала [10 .. 30000].
	 * Пример: 17571 
	 * Изход: числото е палиндром Използвайте цикъл do-while.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		do {
			System.out.print("Enter number: ");
			number = input.nextInt();
		} while (number < 10 || number > 30000);
		int constant = number;
		int reverse = 0;

		while (number > 0) {
			reverse = reverse * 10;
			reverse = reverse + number % 10;
			number = number / 10;
		}
		// System.out.println(constant);
		// System.out.println(reverse);
		if (constant == reverse) {
			System.out.print("The number is palindrome.");
		} else {
			System.out.println("The number is not palindrome.");
		}

		input.close();
	}

}

import java.util.Scanner;

public class ExerciseSix {
	/*
	 * Да се прочете число от екрана(конзолата) и да се изведе сбора на всички
	 * числа между 1 и въведеното число. 
	 * Въдете число: 7 
	 * Резултата е 28
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = input.nextInt();
		int sum = 0;
		for (int i = sum; i <= number; i++) {
			sum += i;
		}
		System.out.println("Result: " + sum);

		input.close();
	}

}

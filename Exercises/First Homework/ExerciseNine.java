import java.util.Scanner;

public class ExerciseNine {
	/*
	 * Да се състави програма, която чете от конзолата 2 естествени двуцифрени
	 * числа a,b. Програмата да изведе в конзолата дали последната цифра от
	 * произведението на двете числа е четна, както и самата цифра. Входни
	 * данни: a,b - естествени числа от интервала [10..99]. Пример: 15, 25
	 * Изход: 375, 5 нечетна
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		do {
			System.out.print("Enter number A between 10-99.");
			a = input.nextInt();
			System.out.print("Enter number B between 10-99.");
			b = input.nextInt();
		} while (a > 99 || a < 10 || b > 99 || b < 10);

		int c = a * b; // произведение
		System.out.println("A * B = " + c);
		int z = c % 10; // последната цифра на произведението
		System.out.println("The last digit is: " + z);
		if (c % 2 == 0) { // проверка за четност;
			System.out.println("The number is even.");
		} else {
			System.out.println("The number is odd.");
		}
		input.close();
	}

}

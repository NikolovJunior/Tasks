import java.util.Scanner;

public class ExerciseTen {

	/*
	 * Трябва да се напълни цистерна с вода. Имате 2 кофи с вместимост 2 и 3
	 * литра и ги ползвате едновременно. Да се състави програма, която по даден
	 * обем извежда как ще прелеете течността с тези кофи, т.е. по-колко пъти ще
	 * се пълни всяка от кофите. Кофите не могат да се ползват с частично
	 * количество вода. Входни данни: естествено число от интервала [10..9999].
	 * Пример: 107 Изход: 21 пъти по 2 литра, 21 пъти по 3 литра допълнително
	 * кофа от 2 литра
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		do {
			System.out.print("Enter number: ");
			number = input.nextInt();
		} while (number < 10 || number > 9999);
		
		if (number % (2 + 3) == 0) {
			System.out.println(number / 5 + " times bucket of 2 liters.");
			System.out.println(number / 5 + " times bucket of 3 liters.");
		} else {
			if (number % 5 == 2) {
				System.out.println(number / 5 + " times bucket of 2 liters");
				System.out.println(number / 5 + " times bucket of 3 liters");
				System.out.println("extra bucket of 2 liters");
			}
			if (number % 5 == 3) {
				System.out.println(number / 5 + " times bucket of 2 liters");
				System.out.println(number / 5 + " times bucket of 3 liters");
				System.out.println("extra bucket of 3 liters");
			}
			if (number % 5 == 4) {
				System.out.println(number / 5 + " times bucket of 2 liters");
				System.out.println(number / 5 + " times bucket of 3 liters");
				System.out.println("further 2 buckets of 2 liters");
			}
			if (number % 5 == 1) {
				System.out.println(((number / 5) - 1)
						+ " times bucket of 2 liters");
				System.out.println(((number / 5) - 1)
						+ " times bucket of 3 liters");
				System.out.println("further 2 buckets of 3 liters");
			}
		}

		input.close();
	}

}

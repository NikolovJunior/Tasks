import java.util.Scanner;

public class ExerciseSixteen {
	/*
	 * Въведено е трицифрено естествено число от вида abc. Трябва да се провери
	 * дали: ако a = b = c - Изход: цифрите са равни; ако a>b>c - Изход: цифрите
	 * са във възходящ ред; ако a<b<c цифрите са в низходящ ред; и изход:
	 * цифрите са ненаредени, за неописаните случаи. Да се състави програма,
	 * която извежда резултата от проверката за наредба на цифрите в числото.
	 * Пример: 345 Изход: възходящ ред.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		do {
			System.out.print("Enter three-digit number: ");
			number = input.nextInt();
		} while (number <= 100 || number >= 999);
		int units = number % 10; // присвоява единиците
		int tenths = number % 100; // присвоява последните 2 цифри
		int tenths2 = (tenths - units) / 10; // присвоява десетиците
		int hundreds = (number - tenths) / 100; // присвоява стотиците
		System.out.println("x: " + hundreds);
		System.out.println("y: " + tenths2);
		System.out.println("z: " + units);
		if (hundreds == tenths2 & tenths2 == units) {
			System.out.println(hundreds + " = " + tenths2 + " = " + units);
			System.out.println("Equal digits.");
		} else if (hundreds > tenths2 & tenths2 > units) {
			System.out.println(hundreds + " > " + tenths2 + " > " + units);
			System.out.println("Descending order.");
		} else if (hundreds < tenths2 & tenths2 < units) {
			System.out.println(hundreds + " < " + tenths2 + " < " + units);
			System.out.println("Ascending order.");
		} else {
			System.out.println("The condition is not met.");
		}

		input.close();
	}

}

import java.util.Scanner;

public class ExerciseElevenSecondWay {
	/*
	 * Въведете число N чрез конзолата и изкарайте като резултат следния
	 * триъгълник с височина N:
	 * 
	 * ****** ................. Кaто допълнително упражнение – нарисувайте същия
	 * триъгълник, но незапълнен.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter number: ");
		int number = input.nextInt();
		int x = 1;
		int y = number;
		for (int i = 0; i < number - 1; i++) {
			for (int j = 0; j < y - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < x; j++) {
				if (j == 0 || j == x - 1) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();
			x += 2;
			y--;
		}
		for (int k = 0; k < (number * 2) - 1; k++) {
			System.out.print("*");
		}

		input.close();
	}

}

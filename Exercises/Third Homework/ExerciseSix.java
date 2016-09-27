import java.util.Scanner;

public class ExerciseSix {
	/*
	 * Напишете програма, която първо чете 2 масива и после извежда съобщение
	 * дали са еднакви, и дали са с еднакъв размер.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first array's length: ");
		int lengthOne = input.nextInt();
		int[] arrayOne = new int[lengthOne];
		int countOne = 0;
		while (countOne < arrayOne.length) {
			System.out.printf("Enter number %1$d: ", (countOne + 1));
			int numbers = input.nextInt();
			arrayOne[countOne] = numbers;
			countOne++;
		}
		
		System.out.println();
		System.out.print("Enter second array's length: ");
		int lengthTwo = input.nextInt();
		int[] arrayTwo = new int[lengthTwo];
		
		int countTwo = 0;
		while (countTwo < arrayTwo.length) {
			System.out.printf("Enter number %1$d: ", (countTwo + 1));
			int numbersTwo = input.nextInt();
			arrayTwo[countTwo] = numbersTwo;
			countTwo++;
		}

		if (arrayOne.length != arrayTwo.length) {
			System.out.println("Arrays are different.They have different length.");
		} else {
			int index = 0;
			for (index = 0; index < arrayOne.length; index++) {
				if (arrayOne[index] != arrayTwo[index]) {
					System.out.println("Arrays are different.");
					break;
				}
			}
			if (index == arrayOne.length) {
				System.out.println("Arrays are equal.");
			}
		}
		if (arrayOne.length == arrayTwo.length) {
			System.out.println("They have the same length.");
		}
		
		input.close();
	}

}

import java.util.Scanner;

public class ExerciseEight {
	/*
	 * Напишете програма, която намира и извежда най-дългата редица от еднакви
	 * поредни елементи в даден масив.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter length: ");
		int length = input.nextInt();
		int[] array = new int[length];
		int count = 0;
		while (count < array.length) {
			System.out.printf("Enter number %1$d: ", (count + 1));
			int numbers = input.nextInt();
			array[count] = numbers;
			count++;
		}

		int countDuplicatedNum = 0;
		int duplicatedNumber = 0;

		for (int index = 0; index < array.length - 1; index++) {
			if (array[index] == array[index + 1]) {
				duplicatedNumber = array[index];
			}
		}
		for (int index = 0; index < array.length - 1; index++) {
			if (array[index] == duplicatedNumber) {
				countDuplicatedNum++;
			}
		}
		System.out.println("The longest duplicated series: ");
		for (int index = 0; index < countDuplicatedNum; index++) {
			System.out.print(duplicatedNumber + " ");
		}

		input.close();
	}

}

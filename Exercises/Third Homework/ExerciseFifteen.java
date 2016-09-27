import java.util.Scanner;

public class ExerciseFifteen {
	/*
	 * Да се състави програма, която въвежда в едномерен масив реални числа.
	 * Като изход: програма извежда онези 3 различни числа, чиято абсолютна
	 * стойност формира максималната обща сума. Пример: 7.13; 0.2; 4.9; 5.1;
	 * 6.34; 1.12 Изход: 5.1; 6.34; 7.13
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter length: ");
		int length = input.nextInt();
		double[] array = new double[length];
		int count = 0;
		double numbers;
		for (int index = 0; index < array.length; index++) {
			System.out.printf("Enter number %1$d: ", (count + 1));
			numbers = input.nextDouble();
			array[index] = numbers;
			count++;
		}

		double maxOne = 0;
		double maxTwo = 0;
		double maxThree = 0;

		for (int index = 0; index < array.length; index++) {
			if (array[index] > maxOne) { // най-голямото число в масива
				maxOne = array[index];
			}
		}

		for (int index = 0; index < array.length; index++) {
			if (array[index] > maxTwo && array[index] < maxOne) {
				maxTwo = array[index]; // второто най-голямо число в масива
			}
		}

		for (int index = 0; index < array.length; index++) {
			if (array[index] > maxThree && array[index] < maxTwo) {
				maxThree = array[index]; // третото най-голямо число в масива

			}
		}
		System.out.print("The greatest numbers are: ");
		System.out.print(maxThree + "; ");
		System.out.print(maxTwo + "; ");
		System.out.print(maxOne + " ");

		input.close();
	}

}

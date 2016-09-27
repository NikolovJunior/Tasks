import java.util.Scanner;

public class ExerciseEleven {
	/*
	 * Да се състави програма, която въвежда от клавиатурата 7 цели числа в
	 * едномерен масив Програмата да изведе всички числа кратни на 5, но по
	 * големи от 5. Пример: -23, -55, 17, 75, 56, 105, 134 Изход: 75,105 - 2
	 * числа
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[7];
		int count = 0;
		int numbers;
		for (int index = 0; index <= array.length - 1; index++) {
			System.out.printf("Enter number %1$d: ", count + 1);
			numbers = input.nextInt();
			array[index] = numbers;
			count++;
		}

		int countNumbers = 0;
		System.out.print("Number/s divisible by 5 and greater then 5 are: ");
		for (int index = 0; index < array.length; index++) {
			if (array[index] % 5 == 0 && array[index] > 5) { // кратни и
																// по-големи от
																// 5
				System.out.print(array[index] + " ");
				countNumbers++;
			}
		}
		System.out.println();
		System.out.println(countNumbers + " numbers.");

		input.close();
	}

}

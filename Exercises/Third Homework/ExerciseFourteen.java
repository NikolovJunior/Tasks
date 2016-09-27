import java.util.Scanner;

public class ExerciseFourteen {
	/*
	 * Имате предварително въведен едномерен масив, съдържащ реални числа. Да се
	 * състави програма, чрез която се избират само елементи от масива със
	 * стойности от интервала [-2.99..2.99] и се отпечатват в нов масив. Новият
	 * масив да се извежда на екрана. Пример:
	 * 7.1,8.5,0.2,3.7,0.99,1.4,-3.5,-110,212,341,1.2 Изход: 0.2; 0.99; 1.4; 1.2
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] array = { 7.1, 8.5, 0.2, 3.7, 0.99, 1.4, -3.5, -110, 212, 341,
				1.2 };
		int count = 0;
		int countTwo = 0;
		for (int index = 0; index < array.length; index++) {
			if (array[index] < 2.99 && array[index] > -2.99) {
				countTwo++;
			}
		}

		double[] arrayTwo = new double[countTwo];
		for (int index = 0; index < array.length; index++) {
			if (array[index] < 2.99 && array[index] > -2.99) {
				arrayTwo[count] = array[index];
				count++;
			}
		}

		for (int index = 0; index < arrayTwo.length; index++) {
			System.out.print(arrayTwo[index] + " ");

		}

		input.close();
	}

}

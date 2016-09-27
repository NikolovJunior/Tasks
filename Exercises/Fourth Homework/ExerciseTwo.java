import java.util.Scanner;

public class ExerciseTwo {
	/*
	 * Имате квадратен двумерен масив от естествени числа, чийто стойности се
	 * въвеждат от конзолата. Да се отпечатат диагоналите на масива. Пример:
	 * 1,4,6,3 5,9,7,2 4,8,1,9 2,3,4,5 Изход: 1 9 1 5 3 7 8 2
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfRows;
		int numberOfColumns;
		do {
			System.out.println("Enter equal numbers for row and columns.");
			System.out.print("Enter number of rows: ");
			numberOfRows = input.nextInt();
			System.out.print("Enter number of columns: ");
			numberOfColumns = input.nextInt();
		} while (numberOfRows != numberOfColumns);
		int[][] array = new int[numberOfRows][numberOfColumns];
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				System.out.println("Enter value for " + row + " " + col);
				array[row][col] = input.nextInt();
			}
		}
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				System.out.print(array[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.print("Main diagonal is: ");
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				if (row == col) {
					System.out.print(array[row][col] + " ");
				}
			}
		}
		System.out.println();
		int count = 0;
		int countTwo = 1;
		System.out.print("The other diagonal is: ");
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				if (count < numberOfRows) {
					System.out.print(array[0 + count][numberOfRows - countTwo] + " ");
					count++;
					countTwo++;
				}
			}
		}

		input.close();
	}

}

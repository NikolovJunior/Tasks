public class ExerciseFive {
	/*
	 * Да се състави програма, при която предварително са въведени естествени
	 * числа в двумерен масив 4*4 елемента. Програмата да извежда резултат от
	 * проверката какво е съотношението на най-голямата сума по редове спрямо
	 * най-голямата сума по колони. Пример: 1,2,3,4 5,6,7,8 9,10,11,12
	 * 13,14,15,16
	 */
	public static void main(String[] args) {
		int[][] array = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } };

		int maxSumRow = 0;
		int rowMax = 0;
		for (int row = 0; row < array.length; row++) {
			int rowSum = 0;
			for (int col = 0; col < array[row].length; col++) {
				rowSum += array[row][col]; // сбор на редове
			}
			if (rowSum > maxSumRow) {
				maxSumRow = rowSum;
				rowMax = row;
			}
		}
		System.out.println("The greatest sum of row is: " + maxSumRow);
		System.out.println("The greatest row is: " + rowMax);

		int maxSumCol = 0;
		int colMax = 0;
		for (int row = 0; row < array.length; row++) {
			int colSum = 0;
			for (int col = 0; col < array[row].length; col++) {
				colSum += array[col][row]; // сбор на колони
				if (colSum > maxSumCol) {
					maxSumCol = colSum;
					colMax = col;
				}
			}
		}
		System.out.println("The greatest sum of column is: " + maxSumCol);
		System.out.println("The greatest column is:" + colMax);

		if (maxSumRow > maxSumCol) {
			System.out
					.println("The greatest sum of rows is bigger then the greatest sum of columns.");
		} else {
			if (maxSumRow < maxSumCol) {
				System.out
						.println("The greatest sum of columns is bigger then the greatest sum of rows.");
			}
			if (maxSumRow == maxSumCol) {
				System.out
						.println("The greatest sum of rows is equal to the greatest sum of columns.");
			}
		}
	}

}

public class ClassworkExerciseSeven {
	/*
	 * Напишете програма, която за дадена матрица намира произведението на
	 * елементите под главния диагонал.
	 */
	public static void main(String[] args) {
		int[][] array = { 
				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9 }
				};
		int sum = 0;
		System.out.print("The elements below the diagonal are: ");
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				if (row > col) {
					sum += array[row][col];
				}
			}
		}
		System.out.print(sum + " ");

	}

}

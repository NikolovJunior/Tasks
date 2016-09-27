public class ClassworkExerciseSix {
	/*
	 * Ќапишете програма, ко€то за дадена матрица от символи отпечатва на екрана
	 * елементите, които се намират на главни€ диагонал.
	 */
	public static void main(String[] args) {
		int[][] array = { 
				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9 }
				};
		System.out.print("The elements from the diagonal are: ");
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				if (row == col) {
					System.out.print(array[row][col] + " ");
				}
			}
		}

	}

}

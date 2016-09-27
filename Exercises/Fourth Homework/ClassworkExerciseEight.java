public class ClassworkExerciseEight {
	/*
	 * Напишете програма, която за матрица от булеви стойности, проверява дали
	 * се съдържа елемент със стойност true над втория диагонал.
	 */
	public static void main(String[] args) {
		boolean[][] array = { 
				{ true, false, false },
				{ false, true, false },
				{ false, false, true } 
				};
		System.out.println("The elements below the diagonal are: ");
		int count = 0;
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length - row - 1; col++) {
				if (col < array.length - row - 1) {
					if (array[row][col] == true) {
						System.out.print("Contains true.");
						break;
					} else {
						count++;
					}
				}
			}
		}
		if (count == 3) {
			System.out.println("Does not contains true.");
		}

	}

}

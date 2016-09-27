public class ExerciseFour {
	/*
	 * Имате предварително въведени стойности на елементи в двумерен масив -
	 * естествени числа. Да се състави програма, чрез която се извеждат
	 * стойностите на елементите в двумерен масив след обръщането му на +90
	 * градуса. Пример: 1,2,3,4 5,6,7,8 9,10,11,12 13,14,15,16 Изход 
	 * 13,9,5,1
	 * 14,10,6,2
	 * 15,11,7,3
	 * 16,12,8,4
	 */

	public static void main(String[] args) {
		int[][] array = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } };
		int count = 0;
		int[][] newArray = new int[array[0].length][array.length];
		for (int row = array.length - 1; row >= 0; row--) {
			for (int col = 0; col < newArray.length; col++) {
				//System.out.print(array[col][row] + " ");
				newArray[count][col] = array[col][row];
			}
			//System.out.println();
			count++;
		}
		//System.out.println();
		
		for (int row = 0; row < newArray.length; row++) {
			for (int col = 0; col < newArray[row].length; col++) {
				//System.out.print(newArray[row][col] + " ");
			}
			//System.out.println();
		}
		//System.out.println();
		
		int countTwo = 0;
		int[][] newArrayTwo = new int[array[0].length][array.length];
		for (int row = newArray.length - 1; row >= 0; row--) {
			for (int col = 0; col < newArrayTwo.length; col++) {
				//System.out.print(newArray[col][row] + " ");
				newArrayTwo[countTwo][col] = newArray[col][row];
			}
			//System.out.println();
			countTwo++;
		}
		//System.out.println();
		
		for (int row = 0; row < newArrayTwo.length; row++) {
			for (int col = 0; col < newArrayTwo[row].length; col++) {
				//System.out.print(newArrayTwo[row][col] + " ");
			}
			//System.out.println();
		}
		//System.out.println();
		
		
		int countThree = 0;
		int[][] newArrayThree = new int[array[0].length][array.length];
		for (int row = newArrayTwo.length - 1; row >= 0; row--) {
			for (int col = 0; col < newArrayThree.length; col++) {
				//System.out.print(newArrayTwo[col][row] + " ");
				newArrayThree[countThree][col] = newArrayTwo[col][row];
			}
			//System.out.println();
			countThree++;
		}
		//System.out.println();
		
		for (int row = 0; row < newArrayThree.length; row++) {
			for (int col = 0; col < newArrayThree[row].length; col++) {
				System.out.print(newArrayThree[row][col] + " ");
			}
			System.out.println();
		}
		
		
	}

}


public class ExerciseThree {
	/*Имате двумерен масив от числа, чийто стойности са въведени
предварително. Да се отпечатат сумата на елементите на масива,
както и средноаритметичното на тези числа. 
	 */
	public static void main(String[] args) {
		int[][] array = { 
				{ 1, 4, 7, 2, 10 },
				{ 8, 6, 2, 1, 0 },
				{ 10, 3, 5, 4, 2 },
				{ 11, 5, 3, 1, 7 },
				{ 9, 2, 3, 8, 5 },
				{ 1, 6, 10, 4, 2 }};
		
		double sum = 0;
		int elements = 1;
		double average = 0;;
		for(int row = 0 ; row < array.length ; row++){
			for(int col = 0 ; col < array[row].length ; col++){
				sum += array[row][col]; // сбора на елементите
				elements = (array[row].length) * (array[col].length+1); // броя на елементите
				average = sum/elements; // средното на елементите
			}
		}
		//System.out.println(elements);
		System.out.println("Sum: " + sum);
		System.out.print("Average: " + average);
		
	}

}

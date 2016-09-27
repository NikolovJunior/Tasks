import java.util.Scanner;


public class ClassworkExerciseElevenB {
	/*Да се напише програма която изисква от потребителя да въведе
2 числа n и m. След това да се построи матрица с размер n x m по
следният начин (примерите са дадени за въведени n=4 и m=5):
1 5 9 13 17
2 6 10 14 18
3 7 11 15 19
4 8 12 16 20
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = input.nextInt();
		System.out.print("Enter m: ");
		int m = input.nextInt();
		int[][] array = new int[m][n];
		int print = 1;
		for(int row = 0 ; row < array.length ; row++){
			for(int col = 0 ; col < array[row].length ; col++){
				array[row][col] = print++;
				//System.out.print(array[row][col] + " ");
			}
			//System.out.println();
		}
		System.out.println();
		for(int row = 0 ; row < n ; row++){
			for(int col = 0 ; col < m ; col++){
				System.out.print(array[col][row] + " ");
			}
			System.out.println();
		}
		

		
		
		
		input.close();
	}

}

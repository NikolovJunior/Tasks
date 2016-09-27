import java.util.Scanner;


public class ClassworkExerciseElevenA {
	/*�� �� ������ �������� ����� ������� �� ����������� �� ������
2 ����� n � m. ���� ���� �� �� ������� ������� � ������ n x m ��
�������� ����� (��������� �� ������ �� �������� n=4 � m=5):
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = input.nextInt();
		System.out.println("Enter m: ");
		int m = input.nextInt();
		int[][] array = new int[n][m];
		int print = 1;
		for(int row = 0 ; row < array.length ; row++){
			for(int col = 0 ; col < array[row].length ; col++){
				array[row][col] = print++;
			}
		}
		
		for(int row = 0 ; row < array.length ; row++){
			for(int col = 0 ; col < array[row].length ; col++){
				System.out.print(array[row][col] + " ");
			}
			System.out.println();
		}
		
		input.close();
	}
	
}

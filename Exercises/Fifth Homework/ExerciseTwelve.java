import java.util.Scanner;


public class ExerciseTwelve {
	/*�� �� ������� �����, ����� ������ �� ������ ����� ����� N �
����� ����� �� ����� � ������� N, ����� ������� ������ �����
�� 1 �� N.
	 */

	static void printArray(int[]array){
		if(array != null){
			for(int index = 0; index < array.length ; index++){
				System.out.print(array[index] + " ");
			}
		}
	}
	
	static int[] obtainingValues(int length , int count){
		int numbers = 1;
		while(numbers < count){
		if(length > 0){
			int[] result = new int[length];
			for(int index = 0 ; index < length ; index++){
				result[index] = numbers++;
			}
		
			return result;
		}	
		}
		return new int[0];
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = input.nextInt();
		int[] arr = obtainingValues(n , n);
		printArray(arr);		
				
	    input.close();
	}

}

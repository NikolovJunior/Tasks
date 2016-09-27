import java.util.Scanner;


public class ExerciseEleven {
	/*Да се създаде метод, който отпечатва масив в конзолата
	 */
	
	static void printArray(int[]array){
		if(array != null){
			for(int index = 0; index < array.length ; index++){
				System.out.print(array[index] + " ");
			}
		}
	}
	
	static int[] obtainingValues(int length){
		int count = 1;
		if(length > 0){
			int[] result = new int[length];
			for(int index = 0 ; index < length ; index++){
				result[index] = count++;
			}
			return result;
		}
		return new int[0];
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter length: ");
		int x = input.nextInt();
		int[] arr = obtainingValues(x);
		printArray(arr);		
				
	    input.close();
	}

}

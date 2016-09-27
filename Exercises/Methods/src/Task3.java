import java.util.Scanner;

public class Task3 {
	static void printNumbers(int[] array){
		Scanner input = new Scanner(System.in);
		for(int index = 0 ; index < array.length ; index++){
			array[index]=input.nextInt();
		}
		for(int index = 0 ; index < array.length ; index++){
			System.out.print(array[index] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int length = input.nextInt();
		int[] numbers = new int[length];
		printNumbers(numbers);
		
		
		
	}

}

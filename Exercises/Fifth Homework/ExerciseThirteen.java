import java.util.Scanner;


public class ExerciseThirteen {
	/*Да се създаде метод, който приема два масива от числа и връща
масив, съдържащ всички елементи на подадените масиви, като в
първата част на масива са елементите на първия подаден масив,
а във втората част – тези на втория подаден масив.
	 */
	
	static void printArray(int[]array){
		if(array != null){
			for(int index = 0; index < array.length ; index++){
				System.out.print(array[index] + " ");
			}
		}
	}
	
	static int[] printGluedArrays(int[] a , int[] b , int length){
		int[] array = new int[length*2];
		int count = 0;
		if(array.length > 0){
			int[] result = new int[array.length];
			for(int index = 0 ; index < result.length/2 ; index++){
				result[index]=a[index];
				result[result.length/2 + count]=b[index];
				count++;
			}
			return result;
		}
		return new int[0];
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//System.out.print("Enter N: ");
		//int n = input.nextInt();
		//int[] arr = obtainingValues(n , n);
		int[] arr = { 2,3,7,10,15 };
		int[] arr2 = { 9,12,30,1,4 };
		int length = 5;
		printArray(arr);
		System.out.println();
		printArray(arr2);
		int[] arr3 = printGluedArrays(arr,arr2,length);
		System.out.println();
		printArray(arr3);
	    input.close();
	}

}

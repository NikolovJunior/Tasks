import java.util.Scanner;

public class ExerciseTwo {
	/*
	 * Нека по въведен масив да се конструира нов, като половината му елементи
	 * са точно като на оригиналния, а другите да са тези елементи, но в обратен
	 * ред. Последно, да се изведе новия масив на екрана.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter length: ");
		int length = input.nextInt();
		int[] array = new int [length];
		int count = 0;
		int number;
		while(count < length){
			System.out.printf("Enter number %1$d: " , (count + 1));
			number = input.nextInt();
			array[count] = number;
			count++;
		}
		int[] arrayTwo = new int[length*2];
		int countTwo=1;
		for (int index = 0; index < arrayTwo.length/2; index++) {
			arrayTwo[index] = array[index];
			arrayTwo[arrayTwo.length-countTwo]=array[index];
			countTwo++;
		}
		for(int index = 0 ; index < arrayTwo.length ; index++){
		    System.out.print(arrayTwo[index] + " ");	
		}	
		input.close();
	}

}

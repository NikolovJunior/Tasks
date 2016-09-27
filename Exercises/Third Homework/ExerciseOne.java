import java.util.Scanner;

public class ExerciseOne {
	/*
	 * ƒа се прочете масив и да се намери най-малкото число кратно на 3 от
	 * масива. 10, 3, 5, 8, 6, -3, 7 Ќай-малкото число кратно на 3 е -3
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter length: ");
		int length = input.nextInt();
		int[] array = new int[length];
		int count = 0;
		int number;
		while (count < length) {
			System.out.printf("Enter the number %1$d: ", (count + 1));
			number = input.nextInt();
			array[count] = number;
			count++;
		}
		
		int countTwo= 0;
		for (int index = 0; index < array.length; index++) {
			if(array[index] % 3 == 0){
				countTwo++;
			}
		}

	
		System.out.println(countTwo);
		int[] arrayTwo = new int[countTwo];
		for (int index = 0; index < arrayTwo.length; index++) {
			if(array[index] % 3 == 0){
				arrayTwo[index]=array[index];
			}
		}

		int minimum = arrayTwo[0];
		for (int index = 0; index < arrayTwo.length; index++) {
			if(arrayTwo[index] < minimum){
				minimum = arrayTwo[index];
			}

		}	
		System.out.print("At least number multiple at 3 is: " + minimum);

		input.close();
	}

}

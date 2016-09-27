import java.util.Scanner;


public class ClassworkExerciseTen {
	/*Напишете програма, която намира най-често срещания елемент
в масив. Пример: {4, 1, 1, 4, 2, 3,4, 4, 1, 2, 4, 9, 3} => 4 (5 times).
	 * 
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter length: ");
		int length = input.nextInt();
		int[] array = new int[length];
		int count = 0;
		int numbers;
		for(int index = 0 ; index < array.length ; index++){
			System.out.printf("Enter number %1$d: " , count+1);
			numbers = input.nextInt();
			array[index]=numbers;
			count++;
		}
		System.out.println();
		for(int index = 0 ; index < array.length ; index++){
			System.out.print(array[index] + " ");
		}
		System.out.println();
		
		int temporary = 0;
		int temporaryCount = 0;
		int duplicatedNumber = array[0];
		int duplicatedNumberCount = 0;
		for(int index = 0 ; index < array.length-1 ; index++){
			temporary = array[index];
			for(int indexTwo = 0 ; indexTwo < array.length-1 ; indexTwo++){
				if(temporary == array[indexTwo]){
					temporaryCount++;
				}
				if(temporaryCount > duplicatedNumberCount){
					duplicatedNumber = temporary;
					duplicatedNumberCount = temporaryCount;
				}
			}
			duplicatedNumberCount++;
		}
		System.out.print("Duplicated number: " + duplicatedNumber);
		int countTwo = 0;
		for(int index = 0 ; index < array.length ; index++){
			if(array[index] == duplicatedNumber){
				countTwo++;
			}
		}
		System.out.println("(" + countTwo + " times)");
		
		
		input.close();
	}

}

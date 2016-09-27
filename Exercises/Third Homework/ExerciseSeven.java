import java.util.Scanner;


public class ExerciseSeven {
	/*Напишете програма, която първо чете масив и после създава нов
масив със същия размер по следния начин: стойността на всеки
елемент от втория масив да е равна на сбора от предходния и
следващият елемент на съответния елемент от първия масив. Първият
и последният елемент на втория масив трябва да си останат равни на
първият и последният от елемент от първия масив.
Да се изведе получения масив.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter length: ");
		int length = input.nextInt();
		int[] array = new int[length];
		int count = 0;
		int numbers;
		int[] arrayTwo = new int[length];
		for(int index = 0 ; index < array.length ; index++){
			System.out.printf("Enter number %1$d: " , (count +1));
			numbers = input.nextInt();
			array[index] = numbers;
			count++;
		}
		
		int previous = 1;
		int next = 1;
		
		for(int index = 1 ; index <= array.length-2 ; index++){			
			arrayTwo[index] = array[previous-1] + array[next + 1]; // елементите между първия и последния
			previous++;
			next++;
		}
		arrayTwo[0] = array[0]; // първи елемент
		arrayTwo[length-1]=array[length-1]; // последен елемент
		for(int index = 0 ; index < arrayTwo.length ; index++){
			System.out.print(arrayTwo[index] + " ");
		}
		
		
		input.close();
	}

}

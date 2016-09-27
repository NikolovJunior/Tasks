import java.util.Scanner;

public class ExerciseNine {
	/*
	 * Напишете програма, в която потребителя въвежда масив, след което
	 * елементите на масива се обръщат в обратен ред (Целта не е масива да се
	 * отпечата в обратен ред, ами първо да се обърне, след което да се отпечата
	 * в нормален ред). Пробвайте да решите задачата първо с един допълнителен
	 * масив и после без да използвате друг масив
	 */

	public static void main(String[] args) {
		//другото ми решение е в clas ExerciseNineSecondWay
		Scanner input = new Scanner(System.in);
		System.out.print("Enter array's length: ");
		int length = input.nextInt();
		int[] array = new int[length];
		int count = 0;
		while (count < length) {
			System.out.printf("Enter number %1$d: ", (count + 1));
			int numbers = input.nextInt();
			array[count] = numbers;
			count++;
		}

		System.out.println();
		for (int index = 0; index <= array.length / 2; index++) {
			int temp = array[index];
			array[index] = array[array.length - index - 1];
			array[array.length - index - 1] = temp;
		}
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}

		input.close();
	}

}

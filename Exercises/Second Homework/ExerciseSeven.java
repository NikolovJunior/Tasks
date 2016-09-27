import java.util.Scanner;

public class ExerciseSeven {
	/*
	 * Започвайки от 3, да се изведат на екрана първите n числа които се делят
	 * на 3. Числата да са разделени със запетая. Въведете n: 5 3,6,9,12,15
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = input.nextInt();
		for (int i = 1; i < number + 1; i++) {
			System.out.print(i * 3 + " ");
		}

		input.close();
	}

}

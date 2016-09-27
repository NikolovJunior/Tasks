import java.util.Scanner;

public class ExerciseSixteen {
	/*
	 * Задача 16: Да се състави програма, чрез която се въвеждат 2 естествени
	 * числа N, M от интервала [10..5555]. Програмата, чрез цикъл for, да
	 * извежда всички числа от интервала, които са кратни на 50 в низходящ ред.
	 * Пример: 25,249 
	 * Изход: 200,150,100, 50.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		int m;
		do {
			System.out.print("Enter N: ");
			n = input.nextInt();
			System.out.println("Enter M: ");
			m = input.nextInt();
		} while (n < 10 || n > 5555 || m < 10 || m > 5555);

		System.out.print("Numbers multiples of 50 are: ");

		for (int i = m; i >= n; i--) {
			if (i % 50 == 0) {
				System.out.print(i + " ");
			}
		}

		input.close();
	}

}

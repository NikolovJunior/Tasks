import java.util.Scanner;

public class ExerciseSeventeen {
	/*
	 * Да се състави програма, която извежда квадрат, чийто страни са оформени
	 * със знака *, а вътрешността е запълнена със въведен знак. Входни данни b
	 * - дължина на страната число от интервала [3..20], c - желан знак.
	 * Програмата да използва цикъл for. Пример: 4 + 
	 * Изход:
	 *  ****
     *  *++*
     *  *++*
     *  ****
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		char sign;
		do {
			System.out.print("Enter number: ");
			number = input.nextInt();
			System.out.print("Enter sign: ");
			sign = input.next().charAt(0);
		} while (number < 3 || number > 20);

		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= number; j++) {
				if (i == 1 || i == number) {
					System.out.print("*");
				} else if (j == 1 || j == number) {
					System.out.print("*");
				} else {
					System.out.print(sign);
				}
			}
			System.out.println();
		}

		input.close();
	}

}

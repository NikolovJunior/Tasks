import java.util.Scanner;

public class ExerciseNine {
	/*
	 * Да се прочетат 2 числа от клавиатурата А и В. Да се изведат всички числа
	 * от А до В на степен 2(разделени с запетая). Ако някое число е кратно на
	 * 3, да се изведе съобщение че числото се пропуска „skip 3“.Ако сумата от
	 * всички изведени числа (без пропуснатите) стане по-голяма от 200, да се
	 * прекрати извеждането. Пример: Въдете А: 1 Въведете B 107
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number A: ");
		int numberA = input.nextInt();
		System.out.print("Enter number B: ");
		int numberB = input.nextInt();
		int sum = 0;
		for (int i = numberA; i <= numberB; i++) {
			if (sum >= 200) {
				break;
			}
			if (i % 3 == 0) {
				System.out.print("(skip 3) ");
			} else if (i % 3 != 0) {
				System.out.print(i * i + " ");
			}
			sum += i * i;
		}

		input.close();
	}
}

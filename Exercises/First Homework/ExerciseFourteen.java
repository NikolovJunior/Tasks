import java.util.Scanner;

public class ExerciseFourteen {
	/*
	 * Да се състави програма, която по въведени координати на 2 позиции от
	 * шахматната дъска извежда отговор дали са оцветени в еднакъв или различен
	 * цвят. Шахматната дъска е квадратна. Въвеждат се две двойки числа от
	 * интервала [1..8]. Пример: 2 2 3 2 Изход: Позициите са с различен цвят
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int firstPosition;
		int firstPositionTwo;
		int secondPosition;
		int secondPositionTwo;

		do {
			System.out.print("Enter first positions: ");
			firstPosition = input.nextInt();
			firstPositionTwo = input.nextInt();
			System.out.print("Enter second positions: ");
			secondPosition = input.nextInt();
			secondPositionTwo = input.nextInt();
		} while (firstPosition <= 1 || firstPosition >= 8
				|| firstPositionTwo <= 1 || firstPositionTwo >= 8
				|| secondPosition <= 1 || secondPosition >= 8
				|| secondPositionTwo <= 1 || secondPositionTwo >= 8);

		int x = firstPosition + firstPositionTwo;
		int y = secondPosition + secondPositionTwo;

		if ((x % 2 == 0) && (y % 2 == 0)) {
			System.out.println("The positions are with the same colors.");
		} else {
			System.out.println("The positions aren't with the same color");
		}

		input.close();
	}

}

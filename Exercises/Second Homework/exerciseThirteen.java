import java.util.Scanner;

public class exerciseThirteen {

	/*
	 * Да се състави програма, която извежда всички естествени трицифрени числа,
	 * които имат сбор на цифрите равен на дадено число. Дадено : sum, където
	 * 2>=sum<=27. 
	 * Пример: 26
	 * Изход: 899, 989, 998.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		do {
			System.out.print("Enter number between 2 and 27: ");
			number = input.nextInt();
		} while (number < 2 || number > 27);

		for (int i = 100; i <= 1000; i++) {
			int units = i % 10;
			int tenths = ((i - units) / 10) % 10;
			int hundreds = (i - tenths * 10 + units * 1) / 100;
			if ((units + tenths + hundreds) == number) {
				System.out.print(i + " ");
			}
		}

		input.close();
	}

}

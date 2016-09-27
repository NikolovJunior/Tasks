import java.util.Scanner;

public class ExerciseFourteen {

	/*
	 * �� �� ������� ��������, ����� �� �������� ���������� ����� N �� ���������
	 * [10..200] ������� � ������� ��� ������ �����, ����� �� ������ �� 7 � ��
	 * ��-����� �� N.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		do {
			System.out.print("Enter number between 10 and 200: ");
			number = input.nextInt();
		} while (number < 10 || number > 200);

		for (int i = number; i >= 10; i--) {
			if (i % 7 == 0) {
				System.out.print(i + " ");
			}
		}

		input.close();
	}

}

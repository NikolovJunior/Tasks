import java.util.Scanner;

public class ExerciseNineteen {
	/*
	 * �� �� ������� ��������, ���� ����� �� �������� ���������� ����� ��
	 * ��������� [10..99] �� ������� �������� �����, ��� �������� �� ��������
	 * ����������: 1) ��� ����������� ����� � ����� �� ������� 0.5*�������; 2)
	 * ��� ����������� ����� � ������� �� ������� 3*������� +1. �����������
	 * ���������� ������ �� �� ������ �������� 1. ������: 11 �����: 34 17 52 26
	 * 13 40 20 10 5 16 8 4 2 1.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		do {
			System.out.print("Enter number: ");
			number = input.nextInt();
		} while (number < 10 || number > 99);
		int sum = number;

		for (int i = number; i <= 99; i++) {
			if (sum == 1) {
				break;
			}
			if (i % 2 == 0) {
				sum = sum / 2;
				System.out.print(sum + " ");
			} else {
				if (sum % 2 != 0) {
					sum = (3 * sum) + 1;
					System.out.print(sum + " ");
				}
			}
		}

		input.close();
	}

}

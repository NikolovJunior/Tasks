import java.util.Scanner;

public class ExerciseTen {

	/*
	 * ������ �� �� ������� �������� � ����. ����� 2 ���� � ���������� 2 � 3
	 * ����� � �� �������� ������������. �� �� ������� ��������, ����� �� �����
	 * ���� ������� ��� �� �������� ��������� � ���� ����, �.�. ��-����� ���� ��
	 * �� ����� ����� �� ������. ������ �� ����� �� �� ������� � ��������
	 * ���������� ����. ������ �����: ���������� ����� �� ��������� [10..9999].
	 * ������: 107 �����: 21 ���� �� 2 �����, 21 ���� �� 3 ����� ������������
	 * ���� �� 2 �����
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		do {
			System.out.print("Enter number: ");
			number = input.nextInt();
		} while (number < 10 || number > 9999);
		
		if (number % (2 + 3) == 0) {
			System.out.println(number / 5 + " times bucket of 2 liters.");
			System.out.println(number / 5 + " times bucket of 3 liters.");
		} else {
			if (number % 5 == 2) {
				System.out.println(number / 5 + " times bucket of 2 liters");
				System.out.println(number / 5 + " times bucket of 3 liters");
				System.out.println("extra bucket of 2 liters");
			}
			if (number % 5 == 3) {
				System.out.println(number / 5 + " times bucket of 2 liters");
				System.out.println(number / 5 + " times bucket of 3 liters");
				System.out.println("extra bucket of 3 liters");
			}
			if (number % 5 == 4) {
				System.out.println(number / 5 + " times bucket of 2 liters");
				System.out.println(number / 5 + " times bucket of 3 liters");
				System.out.println("further 2 buckets of 2 liters");
			}
			if (number % 5 == 1) {
				System.out.println(((number / 5) - 1)
						+ " times bucket of 2 liters");
				System.out.println(((number / 5) - 1)
						+ " times bucket of 3 liters");
				System.out.println("further 2 buckets of 3 liters");
			}
		}

		input.close();
	}

}

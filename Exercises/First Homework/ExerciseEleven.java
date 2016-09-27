import java.util.Scanner;

/* ��������� ��������, ����� �� ������ ���������o ����� ���������
 ���� ������� �� ���� �� ����� ���� �����. ��� ���������� ����� ��
 ���� ����� 0.
 */

public class ExerciseEleven {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		do {
			System.out.print("Enter three-digit number without 0 in it: ");
			number = input.nextInt();
		} while (number < 111 || number > 999 || number == 0);
		int units = number % 10; // ��������� ���������
		int tenths = number % 100; // ��������� ���������� 2 �����
		int tenths2 = (tenths - units) / 10; // ��������� ����������
		int hundreds = (number - tenths) / 100; // ��������� ���������
		System.out.println("Hundreds: " + hundreds);
		System.out.println("Tenths: " + tenths2);
		System.out.println("Units: " + units);
		if (number % hundreds == 0 && number % tenths2 == 0
				&& number % units == 0) {
			System.out.println("The number is divisible by every digit.");
		} else if (hundreds == 0 || tenths2 == 0 || units == 0) {
			System.out.println("Error.");
		} else {
			System.out.println("The number is not divisible by: " + hundreds
					+ ", " + tenths2 + ", " + units);
		}
		input.close();
	}

}

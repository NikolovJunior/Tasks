import java.util.Scanner;

public class ExerciseSixteen {
	/*
	 * �������� � ���������� ���������� ����� �� ���� abc. ������ �� �� �������
	 * ����: ��� a = b = c - �����: ������� �� �����; ��� a>b>c - �����: �������
	 * �� ��� �������� ���; ��� a<b<c ������� �� � �������� ���; � �����:
	 * ������� �� ����������, �� ����������� ������. �� �� ������� ��������,
	 * ����� ������� ��������� �� ���������� �� ������� �� ������� � �������.
	 * ������: 345 �����: �������� ���.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		do {
			System.out.print("Enter three-digit number: ");
			number = input.nextInt();
		} while (number <= 100 || number >= 999);
		int units = number % 10; // ��������� ���������
		int tenths = number % 100; // ��������� ���������� 2 �����
		int tenths2 = (tenths - units) / 10; // ��������� ����������
		int hundreds = (number - tenths) / 100; // ��������� ���������
		System.out.println("x: " + hundreds);
		System.out.println("y: " + tenths2);
		System.out.println("z: " + units);
		if (hundreds == tenths2 & tenths2 == units) {
			System.out.println(hundreds + " = " + tenths2 + " = " + units);
			System.out.println("Equal digits.");
		} else if (hundreds > tenths2 & tenths2 > units) {
			System.out.println(hundreds + " > " + tenths2 + " > " + units);
			System.out.println("Descending order.");
		} else if (hundreds < tenths2 & tenths2 < units) {
			System.out.println(hundreds + " < " + tenths2 + " < " + units);
			System.out.println("Ascending order.");
		} else {
			System.out.println("The condition is not met.");
		}

		input.close();
	}

}

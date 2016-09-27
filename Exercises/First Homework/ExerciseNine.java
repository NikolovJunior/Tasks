import java.util.Scanner;

public class ExerciseNine {
	/*
	 * �� �� ������� ��������, ����� ���� �� ��������� 2 ���������� ����������
	 * ����� a,b. ���������� �� ������ � ��������� ���� ���������� ����� ��
	 * �������������� �� ����� ����� � �����, ����� � ������ �����. ������
	 * �����: a,b - ���������� ����� �� ��������� [10..99]. ������: 15, 25
	 * �����: 375, 5 �������
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		do {
			System.out.print("Enter number A between 10-99.");
			a = input.nextInt();
			System.out.print("Enter number B between 10-99.");
			b = input.nextInt();
		} while (a > 99 || a < 10 || b > 99 || b < 10);

		int c = a * b; // ������������
		System.out.println("A * B = " + c);
		int z = c % 10; // ���������� ����� �� ��������������
		System.out.println("The last digit is: " + z);
		if (c % 2 == 0) { // �������� �� �������;
			System.out.println("The number is even.");
		} else {
			System.out.println("The number is odd.");
		}
		input.close();
	}

}

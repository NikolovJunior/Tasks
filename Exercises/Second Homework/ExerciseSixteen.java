import java.util.Scanner;

public class ExerciseSixteen {
	/*
	 * ������ 16: �� �� ������� ��������, ���� ����� �� �������� 2 ����������
	 * ����� N, M �� ��������� [10..5555]. ����������, ���� ����� for, ��
	 * ������� ������ ����� �� ���������, ����� �� ������ �� 50 � �������� ���.
	 * ������: 25,249 
	 * �����: 200,150,100, 50.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		int m;
		do {
			System.out.print("Enter N: ");
			n = input.nextInt();
			System.out.println("Enter M: ");
			m = input.nextInt();
		} while (n < 10 || n > 5555 || m < 10 || m > 5555);

		System.out.print("Numbers multiples of 50 are: ");

		for (int i = m; i >= n; i--) {
			if (i % 50 == 0) {
				System.out.print(i + " ");
			}
		}

		input.close();
	}

}

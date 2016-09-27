import java.util.Scanner;

public class ExerciseNine {
	/*
	 * �� �� �������� 2 ����� �� ������������ � � �. �� �� ������� ������ �����
	 * �� � �� � �� ������ 2(��������� � �������). ��� ����� ����� � ������ ��
	 * 3, �� �� ������ ��������� �� ������� �� �������� �skip 3�.��� ������ ��
	 * ������ �������� ����� (��� ������������) ����� ��-������ �� 200, �� ��
	 * �������� �����������. ������: ������ �: 1 �������� B 107
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

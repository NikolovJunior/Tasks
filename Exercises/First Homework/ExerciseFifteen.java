import java.util.Scanner;

public class ExerciseFifteen {

	/*
	 * �� �� ������� ��������, ����� ������� ���������� ����� �� ���������
	 * [0..24]. ���������� �� ������ ������������� ��������� ��������� ���������
	 * ���. ��������� ��: [18..4] - ����� �����; [4..9] - ����� ����; [9..18] -
	 * ����� ��� ������: 10 �����: ����� ���
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		do {
			System.out.print("Enter number: ");
			number = input.nextInt();
		} while (number < 1 || number > 24);
		if (number == 18 || number == 19 || number == 20 || number == 21
				|| number == 22 || number == 24 || number == 1 || number == 2
				|| number == 3 || number == 4) {
			System.out.println("Good evening!");
		} else {
			if (number <= 9 & number > 4) {

				System.out.println("Good morning!");
			}
			if (number < 18 & number > 9) {
				System.out.println("Good afternoon!");
			}
		}
		input.close();
	}

}

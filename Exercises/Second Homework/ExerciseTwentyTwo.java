import java.util.Scanner;

public class ExerciseTwentyTwo {
	/*
	 * �� �� ������� ��������, ����� ������� ������� 10 ���-����� �����, �����
	 * �� ����� �� 2, 3 ��� �� 5 � ����� �� ��-������ �� �������� ����������
	 * �����. ������� �� ��������, ������ � ������ ������� �����. ������ �����:
	 * ����� �� ��������� [1..999] 
	 * ������: 1 
	 * �����: 1:2; 2:3, 3:4, 4:5, 5:6,
	 * 6:8, 7:9, 8:10, 9:12, 10:14 
	 * ����������� ����� while.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int number;
		do {
			System.out.print("Enter number: ");
			number = input.nextInt();
		} while (number < 1 || number > 999);

		int count = 1;
		while (count < 10 + 1) {
			while (number > 0) {
				if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0) {
					System.out.print(number + " ");
					break;
				} else {
					number++;
				}
			}
			count++;
			number++;
		}

		input.close();
	}

}

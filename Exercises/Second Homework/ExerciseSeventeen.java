import java.util.Scanner;

public class ExerciseSeventeen {
	/*
	 * �� �� ������� ��������, ����� ������� �������, ����� ������ �� ��������
	 * ��� ����� *, � ������������ � ��������� ��� ������� ����. ������ ����� b
	 * - ������� �� �������� ����� �� ��������� [3..20], c - ����� ����.
	 * ���������� �� �������� ����� for. ������: 4 + 
	 * �����:
	 *  ****
     *  *++*
     *  *++*
     *  ****
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		char sign;
		do {
			System.out.print("Enter number: ");
			number = input.nextInt();
			System.out.print("Enter sign: ");
			sign = input.next().charAt(0);
		} while (number < 3 || number > 20);

		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= number; j++) {
				if (i == 1 || i == number) {
					System.out.print("*");
				} else if (j == 1 || j == number) {
					System.out.print("*");
				} else {
					System.out.print(sign);
				}
			}
			System.out.println();
		}

		input.close();
	}

}

import java.util.Scanner;

public class ExerciseFive {

	/*
	 * �� �� ������� �� ����������� 2 �����. � �� �� ������� �� ������ ������
	 * ����� �� ��-������� �� ��-��������. 
	 * �������� ������� �����: 12
	 * �������� ������� �����: 15
	 *  12 13 14 15
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int numberOne = input.nextInt();
		System.out.print("Enter second number: ");
		int numberTwo = input.nextInt();
		if (numberTwo > numberOne) {
			for (int i = numberOne; i < numberTwo + 1; i++) {
				System.out.print(i + " ");
			}
		} else {
			for (int j = numberTwo; j < numberOne + 1; j++) {
				System.out.print(j + " ");
			}
		}

		input.close();
	}

}

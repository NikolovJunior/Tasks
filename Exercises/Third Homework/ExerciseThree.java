import java.util.Scanner;

public class ExerciseThree {
	/*
	 * �� �� ������ �����, ���� ����� �� �� ������� ����� � 10 �������� ��
	 * ������� �����: ������� 2 �������� �� ������ �� ���������� �����. �����
	 * ������� ������� �� ������ � ����� �� ����� �� ���������� 2 �������� �
	 * ������. ���� ���� �������� ������ .
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = input.nextInt();
		int[] array = new int[10];
		array[0] = number;
		array[1] = number;
		array[2] = array[0] + array[1];
		array[3] = array[1] + array[2];
		array[4] = array[2] + array[3];
		array[5] = array[3] + array[4];
		array[6] = array[4] + array[5];
		array[7] = array[5] + array[6];
		array[8] = array[6] + array[7];
		array[9] = array[7] + array[8];
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}

		input.close();
	}

}

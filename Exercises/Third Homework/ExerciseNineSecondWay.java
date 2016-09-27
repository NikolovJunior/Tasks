import java.util.Scanner;

public class ExerciseNineSecondWay {
	/*
	 * �������� ��������, � ����� ����������� ������� �����, ���� �����
	 * ���������� �� ������ �� ������� � ������� ��� (����� �� � ������ �� ��
	 * �������� � ������� ���, ��� ����� �� �� ������, ���� ����� �� �� ��������
	 * � �������� ���). ��������� �� ������ �������� ����� � ���� ������������
	 * ����� � ����� ��� �� ���������� ���� �����
	 */

	public static void main(String[] args) {
		//������� �� ������� � � clas ExerciseNine
		Scanner input = new Scanner(System.in);
		System.out.print("Enter array's length: ");
		int length = input.nextInt();
		int[] array = new int[length];
		int count = 0;
		while (count < length) {
			System.out.printf("Enter number %1$d: ", (count + 1));
			int numbers = input.nextInt();
			array[count] = numbers;
			count++;
		}

		int[] temporary = new int[array.length];
		for (int index = array.length - 1; index > -1; index--) {
			temporary[array.length - index - 1] = array[index];
		}
		array = temporary;
		for (int index = 0; index < array.length; index++) {
			System.out.print(temporary[index] + " ");
		}
		
		input.close();
	}

}

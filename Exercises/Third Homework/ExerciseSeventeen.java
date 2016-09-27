import java.util.Scanner;


public class ExerciseSeventeen {
	/*���� ������ �� ���������� ����� �� �������� �������������� ������,
��� �� ���������� � �� ���������� ���������:
N1 < N2 > N3 < N4 > N5 <..
��������� ��������, ����� ��������� ���� �������� � ���������
����� ������ �� ����� ���������� ������� ����������.
������: 1 3 2 4 3 7
�����: ��������� ������������ �� �������������� ������ ������
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter length: ");
		int length = input.nextInt();
		int[]array = new int[length];
		int count = 0;
		int numbers;
		for(int index = 0; index<array.length ; index++){
			System.out.printf("Enter number %1$d: " , count + 1);
			numbers = input.nextInt();
			array[index] = numbers;
			count++;
		}
		
		boolean result = true;
		for (int index = 1; index <= array.length - 2; index++) {
			int previous = array[index - 1]; //������� �������
			int next = array[index + 1]; // ��������� �������
			int current = array[index]; // �������� �������

			boolean bigger = (current > previous) && (current > next);
			boolean smaller = (current < previous) && (current < next);
			
			if (!(smaller || bigger)) {
				result = false;
				break;
			}
		}
		if (result) {
			System.out.println("Is jagged.");
		} else {
			System.out.println("Is not jagged.");
		}
		
		input.close();
	}

}

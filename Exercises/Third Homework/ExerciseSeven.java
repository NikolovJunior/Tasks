import java.util.Scanner;


public class ExerciseSeven {
	/*�������� ��������, ����� ����� ���� ����� � ����� ������� ���
����� ��� ����� ������ �� ������� �����: ���������� �� �����
������� �� ������ ����� �� � ����� �� ����� �� ���������� �
���������� ������� �� ���������� ������� �� ������ �����. �������
� ���������� ������� �� ������ ����� ������ �� �� ������� ����� ��
������� � ���������� �� ������� �� ������ �����.
�� �� ������ ��������� �����.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter length: ");
		int length = input.nextInt();
		int[] array = new int[length];
		int count = 0;
		int numbers;
		int[] arrayTwo = new int[length];
		for(int index = 0 ; index < array.length ; index++){
			System.out.printf("Enter number %1$d: " , (count +1));
			numbers = input.nextInt();
			array[index] = numbers;
			count++;
		}
		
		int previous = 1;
		int next = 1;
		
		for(int index = 1 ; index <= array.length-2 ; index++){			
			arrayTwo[index] = array[previous-1] + array[next + 1]; // ���������� ����� ������ � ���������
			previous++;
			next++;
		}
		arrayTwo[0] = array[0]; // ����� �������
		arrayTwo[length-1]=array[length-1]; // �������� �������
		for(int index = 0 ; index < arrayTwo.length ; index++){
			System.out.print(arrayTwo[index] + " ");
		}
		
		
		input.close();
	}

}

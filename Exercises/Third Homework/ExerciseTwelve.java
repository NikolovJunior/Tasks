import java.util.Scanner;
/*�� �� ������� ��������, ���� ����� �� ������������� �������� 7
����� � ��������� ����� �� �������� ������� �� �������� � �������:
- 0 � 1 ���� ����� ����������;
- 2 � 3 ���� ��������;
- 4 � 5 ���� ���������.
������: 1,2,3,4,5,6,7
�����: 2,1,4,3,6,5,7
 */

public class ExerciseTwelve {

	public static void main(String[] args) {
		Scanner  input = new Scanner(System.in);
		int[] array = new int[7];
		int count = 0;
		int numbers;
		for (int index = 0; index <= array.length - 1; index++) {
			System.out.printf("Enter number %1$d: ", count + 1);
			numbers = input.nextInt();
			array[index] = numbers;
			count++;
		}
		int x = array[0];
		array[0]=array[1];
		array[1]=x;
		System.out.print(array[0] + ",");
		System.out.print(array[1] + ",");	
		
		array[2] = array[2] + array[3];
		array[3] = array[2] - array[3]; 
		array[2] = array[2] - array[3]; 
		System.out.print(array[2] + ",");
		System.out.print(array[3] + ",");
		
		array[4] = array[4] * array[5];
		array[5] = array[4]/array[5];
		array[4] = array[4]/array[5];
		System.out.print(array[4] + ",");
		System.out.print(array[5] + ",");
		System.out.print(array[6] + ".");
		
		input.close();
	}

}

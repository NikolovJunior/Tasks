import java.util.Scanner;


public class ExerciseThirteen {
	/* �� �� ������� ��������, ���� ����� �� ������� ����� � �� ���������
���� ����� � ������� ������ �������.
����������, ���� �����, �� ��������� �������������� ������ �����
�� ���������� ���������� ����� � 2-���� ������ �������.
������: 99
�����: 1100011
    */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = input.nextInt();
		int numberTwo = number;
		int count = 0;
		while (number > 0) {
			   number = number/ 2;
			   count++;
			  }
		int[] array = new int[count]; 
		for(int index = 0 ; index < array.length ; index++){
			if(numberTwo > 0){
				array[index]=numberTwo%2;
				numberTwo=numberTwo/2;
			}
		    count++;
		}
		for(int index = array.length - 1 ; index >= 0 ; index--){
			System.out.print(array[index]);
		}

		input.close();
	}

}

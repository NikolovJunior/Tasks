import java.util.Scanner;


public class ExerciseTen {
	/*�� �� ������� ��������, ����� �� ����� ��� ����� ����,
���������, �� ����� �� �������� ���� ��� ����� ��� �� ������
�� ASCII ��������� � ���������� ������� 5 � � �������
������������� ������.
������ :
����: Hello
�����: Mjqqt

	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter text: ");
		String a = input.nextLine();
		int[] array = new int[a.length()];
		
		for(int index = 0; index < array.length ; index++){
			array[index] = a.charAt(index) + 5;
			//System.out.print(array[index] + " ");
		}
		
		char[] result = new char[a.length()];
		for(int index = 0 ; index < result.length ; index++){
			result[index] = (char)(array[index]);
			System.out.print(result[index] + "");
		}
		
		input.close();
	}

}

import java.util.Scanner;


public class ExerciseSix {
	/*�������� 3 ����� �� ������������ �1, �2 � �3. ��������� �����������
�� ����, �� �1 �� ��� ���������� �� �2, �2 �� ��� ���������� �� �3, �
�3 �� ��� ������� �������� �� �1.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a1 = input.nextInt();
		int a2 = input.nextInt();
		int a3 = input.nextInt();
		a2 = a1 + a2 + a3; //����
		a1 = a2 - a1 - a3; //a1==a2(������ ��������)
		a3 = a2 - a1 - a3; //a2==a3(������ ��������)
		a2 = a2 - a1 - a3; //a3==a1(������ ��������)
		System.out.println("a1 = " + a1);
		System.out.println("a2 = " + a2);
		System.out.println("a3 = " + a3);
		
		input.close();
	}

}

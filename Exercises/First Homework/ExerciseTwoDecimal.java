import java.util.Scanner;


public class ExerciseTwoDecimal {
	/*�������� 2 �������� ����������� ����� �� ���������. ��������
	������� ����, �������, ������������, ������� �� ������� �
	����������� ������� � ������� ���������� � ������������ ����
	��������� � ���������. �������� ������ � ����� � ������� �������.
	 * 
	 */

	public static void main(String[] args) {
		//������� �� �������� � ����� � ������� �������.
		//��������� � ����������� ����� �� ������ � class ExerciseTwo.
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter x: ");
		double x = input.nextDouble();
		System.out.print("Enter y: ");
		double y = input.nextDouble();
		
		double sum = ( x + y );
		double substraction = (x - y);
		double multiplication = (x * y);
		double division = (x % y);
		double integerDivision = (x / y);
		
		System.out.printf("Sum: "+ sum + " %n" + "Substraction: " + substraction + " %n" +
			    "Integer Division: " + integerDivision + " %n" + "Division: " +
			    division + " %n" + "Multiplication: " + multiplication + " %n");

		input.close();
	}

}

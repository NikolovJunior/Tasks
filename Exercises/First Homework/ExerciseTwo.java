import java.util.Scanner;


public class ExerciseTwo {
/*�������� 2 �������� ����������� ����� �� ���������. ��������
������� ����, �������, ������������, ������� �� ������� �
����������� ������� � ������� ���������� � ������������ ����
��������� � ���������. �������� ������ � ����� � ������� �������.
 * 
 */
	public static void main(String[] args) {
		// ������� �� �������� � ����������� �����. 
		//��������� �� �������� � ������� ������� �� ������ � class ExerciseTwoDecimal.
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter x: ");
		int x = input.nextInt();
		System.out.print("Enter y: ");
		int y = input.nextInt();
		
		int sum = ( x + y );
		int substraction = (x - y);
		int multiplication = (x * y);
		int division = (x % y);
		int integerDivision = (x / y);
		
		System.out.printf("Sum: "+ sum + " %n" + "Substraction: " + substraction + " %n" +
			    "Integer Division: " + integerDivision + " %n" + "Division: " +
			    division + " %n" + "Multiplication: " + multiplication + " %n");

		input.close();

	}

}

import java.util.Scanner;

/*�� �� ������� ��������� ��� ����������� � �� �� �������� 2 ����� ��
 ������������ A � B (���� �� �� � ������� ������� � double).
 ����� �� �� ������� 3-�� ����� C � �� �� ������� ���� �� � �/� A � B.
 �� �� ������ ��������� ��������� �� ���� ���� C � ����� A � B.
 * 
 */
public class ExerciseOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter A: ");
		double A = input.nextDouble();

		System.out.println("Enter B: ");
		double B = input.nextDouble();

		System.out.println("Enter C: ");
		double C = input.nextDouble();

		if (A < C && B > C) {
			System.out.println(C + " is between " + A + " and " + B + ".");
		} else if (A > C && B < C) {
			System.out.println(C + " is between " + B + " and " + A + ".");
		} else {
			System.out.println("C is not between A and B or B and A.");
		}
		input.close();
	}

}

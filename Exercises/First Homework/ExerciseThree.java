import java.util.Scanner;


public class ExerciseThree {
	/*�������� 2 �������� ����� �� ��������� � ��������� ���������� ��.
     *������������ ������ ���������
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter x: ");
		int x = input.nextInt();
		System.out.print("Enter y: ");
		int y = input.nextInt();
		int z = x;
		x=y;
		y=z;
		System.out.println("x: " + x);
		System.out.println("y: " + y);	
		input.close();
	}

}

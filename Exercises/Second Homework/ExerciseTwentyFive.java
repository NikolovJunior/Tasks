import java.util.Scanner;

public class ExerciseTwentyFive {
	/*
	 * �� �� ������� ��������, ����� �� ������ ����� N, �� ��������� N!, �.�.
	 * 1*2*3*4...*N. 
	 * ������: 5 
	 * �����: 120 
	 * ����������� ����� do-while.
	 */
	public static void main(String[] args) {
		// 0! = 1
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = input.nextInt();
		int factorial = 1;
		int start = 1;
		do {
			factorial = factorial * start;
			start++;
		} while (number >= start);
		if (number > 0) {
			System.out.print(factorial);
		} else {
			if (number == 0) {
				System.out.print("1");
			}
			if (number < 0) {
				System.out.println("Error.");
			}
		}

		input.close();
	}

}

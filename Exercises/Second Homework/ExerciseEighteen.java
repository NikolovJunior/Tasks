import java.util.Scanner;


public class ExerciseEighteen {
	/*������ 18:
�� �� ������� ��������, ���� ����� �� ������� ��� ����� ��
��������� [1..9].
���������� �� ������� ��������� �� ���������.
������������ �������� �� ����������� � ���������� �� 2-��
�����.
������: 2 2
�����:
1*1= 1;
1*2= 2;
2*1= 2;
2*2= 4;
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int firstNumber;
		int secondNumber;
		do{
		System.out.print("Enter first number: ");
		firstNumber = input.nextInt();
		System.out.print("Enter second number: ");
        secondNumber = input.nextInt();
		} while(firstNumber < 1 && firstNumber > 9 || secondNumber < 1 && secondNumber > 9);
		
		for(int i = 1 ; i <= firstNumber ; i++){
			for(int j = 1 ; j <= secondNumber ; j++){
				System.out.println(i + "*" + j + "=" + i*j);
			}
		}
		
		input.close();
	}

}

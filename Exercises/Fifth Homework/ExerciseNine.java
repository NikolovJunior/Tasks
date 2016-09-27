import java.util.Scanner;


public class ExerciseNine {
	/*�� �� ������� ��������, ���� ����� �� ������� ��� �������� �����,
�����, ���� ����� '-' �� ������� ������ �� ���������� ����� ���� ��
������ ������ '-' ���� ����������� �����.
����: asd-12sdf45-56asdf100
�����:
-12
45
-56
100
���� = 77
	 */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter text: ");
		String text = input.nextLine();
		String[] numbers = text.split("[^0-9-]+");
		int[] array = new int[numbers.length];
		for(String n : numbers) {
			System.out.println(n + " ");
		}
		for(int index = 1 ; index < numbers.length; index++){
			array[index]= Integer.parseInt(numbers[index]);
		}
		int sum = 0;
		for(int index = 1; index < numbers.length; index++){
			sum += array[index];
		}
		System.out.println("Sum: " + sum);
		
		input.close();
	}

}

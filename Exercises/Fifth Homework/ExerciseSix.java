import java.util.Scanner;


public class ExerciseSix {
	/*�� �� ������� ��������, ���� ����� �� ������� ��������� � �������
����.
���� �������� �� ������ �� �� ������� ����� �����, �� ����� �������
���� �� ������� � ������ �����, � ���������� � ����� �� �� �����.
������: ����� ����� ������
�����: ����� ����� ������
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter some words: ");
		String words = input.nextLine();
		String[] word = words.split(" ");
		String upperCase = " ";

		for(int index = 0 ; index < word.length ; index++){
			upperCase += word[index].substring(0,1).toUpperCase() 
					+ word[index].substring(1).toLowerCase() + " ";
			
		}
		System.out.println(upperCase);

		input.close();
	}

}

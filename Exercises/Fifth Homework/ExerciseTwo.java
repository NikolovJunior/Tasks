import java.util.Scanner;


public class ExerciseTwo {
	/*�� �� ������� ��������, ���� ����� �� ������������ �� ��������
�������������� ��� ���� � ������� 10-20 �����.
���������� �� ������� ������� �� 5 ����� � �� ������ ��������� ��
��-�������, ����� � ������ �� ����������.
������: uchilishe uchenik
�����: 9 uchenishe
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text;
		String textTwo;
		do{
			System.out.println("Enter text with 40 or less symbols: ");
			text = input.nextLine();
			System.out.println("Enter second text with 40 or less symbols: ");
			textTwo = input.nextLine();
		}while(text.length() > 20 || text.length() < 10 && textTwo.length() > 20 || textTwo.length() <10);
		
		String longerText;
		String restOfTheText;
		if(text.length() > textTwo.length()){
			longerText = textTwo.substring(0,5);
			restOfTheText = text.substring(5);
			System.out.println(text.length() + " " + longerText.concat(restOfTheText));
		}else{
			if(text.length() < textTwo.length()){
				longerText = text.substring(0,5);
				restOfTheText = textTwo.substring(5);
				System.out.println(textTwo.length() + " " + longerText.concat(restOfTheText));
			}
			if(text.length() == textTwo.length()){
				longerText = text.substring(0,5);
				restOfTheText = textTwo.substring(5);
				System.out.println(text.length() + " " + longerText.concat(restOfTheText));
			}
		}
		System.out.println();
		
		
		input.close();
	}

}

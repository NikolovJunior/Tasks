import java.util.Scanner;


public class ExerciseEigth {
	/*�� �� ������� ��������, ���� ����� �� ������� ��� �� �������
(������, ���).
���������� �� ������ �� ������ ���� ��������� ������ � ���������,
�.�. ���� ����� ������-������� � �������-������ � ���� � ���.
����: �����
�����: ��.
����: ��������
�����: ��.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter text: ");
		String text = input.nextLine();
		int count = 0;
		for(int index = 0 ; index < text.length() ; index++){
			if(text.charAt(index) == text.charAt(text.length()-1-index)){
				//System.out.print("Palindrome.");
				count++;
			}else{
				if(text.charAt(index) != text.charAt(text.length()-1-index)){
					System.out.println("The word is not a palindrome.");
					break;
				}
			}
		}
		if(count == text.length()){
			System.out.println("The word is a palindrome.");
		}
		
		input.close();
	}

}

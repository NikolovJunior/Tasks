import java.util.Scanner;


public class ExerciseSeven {
	/*
�� �� ������� ��������, ����� ���� ����� �� ���� ��������� �
��������.
���� �������� �� �� �������� ���� �� ���������� ����, ����� � ����
����� � ���-������� ����.
������: asd fg hjkl
�����: 3 ����, ���-������� � � 4 �������.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter some words: ");
		String text = input.nextLine();
		String[] words = text.split(" ");
		String longestWord = "";
		int length = 0;
		int count = 0;
		for(String word : words){
			if(word.length() > length){
				longestWord = word;
				length = word.length();
			}
			count++;
		}
		System.out.println("There are " + count + " words.");
		System.out.println("The longest word is: " + longestWord + ".");
		System.out.println("The longest word is with " + length +  " signs.");
		
		input.close();
	}

}

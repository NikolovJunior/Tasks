import java.util.Scanner;

public class ExerciseThree {
	/*
	 * �� �� ������� ��������, ���� ����� �� �������� �������������� ��� ������
	 * �� ������� ��� ���������. ���������� �� ������� ��������� �� ��������� ��
	 * ����������� �� �� �������. ������: ���������, ��������� �����: ����� ����
	 * �� � ����� �������. ������� �� �������: 8 �-� 9 �-�
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text;
		String textTwo;
		do {
			System.out.println("Enter text with 40 or less symbols: ");
			text = input.nextLine();
			System.out.println("Enter second text with 40 or less symbols: ");
			textTwo = input.nextLine();
		} while (text.contains(" ") || textTwo.contains(" "));

		String interval = "this word run out of letters";

		if (text.length() == textTwo.length()) {
			System.out.println("Both strings have the same length.");
		} else {
			System.out.println("Strings have different length.");
		}

		int difference = 0;
		int countDifference = 1;
		int countDifferenceTwo = 1;
		int position = 0;
		int positionTwo = 0;
		if (text.length() > textTwo.length()) {
			difference = text.length() - textTwo.length();
			for (int index = 0; index < text.length() - difference; index++) { //����������� �� ���������� �����
				if (text.charAt(index) != textTwo.charAt(index)) {             //������ ������� ���� � ��-�����
					System.out.println(index + " " + text.charAt(index) + "-"
							+ textTwo.charAt(index));
					countDifference++;
					position = index + 1;
				}
			}
		} else {
			if (text.length() < textTwo.length()) {
				difference = textTwo.length() - text.length();
				for (int index = 0; index < textTwo.length() - difference; index++) { //����������� �� ���������� �����
					if (text.charAt(index) != textTwo.charAt(index)) {                //������ ������� ���� � ��-�����
						System.out.println(index + " " + text.charAt(index)
								+ "-" + textTwo.charAt(index));
						countDifferenceTwo++;
						positionTwo = index + 1;
					}
				}
			}
			if (text.length() == textTwo.length()) {
				for (int index = 0; index < text.length(); index++) { //����������� �� ���������� �����
					if (text.charAt(index) != textTwo.charAt(index)) { //������ ������ �� � ������� �������
						System.out.println(index + " " + text.charAt(index)
								+ "-" + textTwo.charAt(index));
					}
				}
			}
		}

		if (text.length() < textTwo.length()) {   //����������� �� ������� ���� ���� �� ��������� �� ������� ����
			difference = textTwo.length() - text.length();
			System.out.println(positionTwo + " " + interval + "-"
					+ text.charAt(text.length() - countDifferenceTwo));
		} else {
			if (text.length() > textTwo.length()) { //����������� �� ������� ���� ���� �� ��������� �� ������� ����
				difference = text.length() - textTwo.length();
				System.out.println(position + " "
						+ textTwo.charAt(textTwo.length() - countDifference)
						+ "-" + interval);
			}
		}

		int count = 0;
		if (text.length() == textTwo.length()) {
			// System.out.println("Both strings have the same length.");
			for (int index = 0; index < text.length(); index++) {
				if (text.charAt(index) == textTwo.charAt(index)) {
					count++;
				}
			}
		}
		if (count == text.length()) {
			System.out.println("Both strings have the same elements.");
		}

		input.close();
	}

}

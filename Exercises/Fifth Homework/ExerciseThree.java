import java.util.Scanner;

public class ExerciseThree {
	/*
	 * Да се състави програма, чрез която се въвеждат последователно две редици
	 * от символи без интервали. Програмата да извежда съобщение за резултата от
	 * сравнението им по позиции. Пример: хипопотам, хипопотук Изход: Двата низа
	 * са с равна дължина. Разлика по позиции: 8 а-у 9 м-к
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
			for (int index = 0; index < text.length() - difference; index++) { //отпечатване на различните букви
				if (text.charAt(index) != textTwo.charAt(index)) {             //когато първата дума е по-дълга
					System.out.println(index + " " + text.charAt(index) + "-"
							+ textTwo.charAt(index));
					countDifference++;
					position = index + 1;
				}
			}
		} else {
			if (text.length() < textTwo.length()) {
				difference = textTwo.length() - text.length();
				for (int index = 0; index < textTwo.length() - difference; index++) { //отпечатване на различните букви
					if (text.charAt(index) != textTwo.charAt(index)) {                //когато втората дума е по-дълга
						System.out.println(index + " " + text.charAt(index)
								+ "-" + textTwo.charAt(index));
						countDifferenceTwo++;
						positionTwo = index + 1;
					}
				}
			}
			if (text.length() == textTwo.length()) {
				for (int index = 0; index < text.length(); index++) { //отпечатване на различните букви
					if (text.charAt(index) != textTwo.charAt(index)) { //когато думите са с еднаква дължина
						System.out.println(index + " " + text.charAt(index)
								+ "-" + textTwo.charAt(index));
					}
				}
			}
		}

		if (text.length() < textTwo.length()) {   //отпечатване на буквите след края на дължината на първата дума
			difference = textTwo.length() - text.length();
			System.out.println(positionTwo + " " + interval + "-"
					+ text.charAt(text.length() - countDifferenceTwo));
		} else {
			if (text.length() > textTwo.length()) { //отпечатване на буквите след края на дължината на втората дума
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

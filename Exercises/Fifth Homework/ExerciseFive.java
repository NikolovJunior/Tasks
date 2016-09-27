import java.util.Scanner;


public class ExerciseFive {
	/*Да се състави програма, чрез която се въвеждат 2 редици от знаци
(думи).
Ако в двете редици участва един и същи знак, да се изведе на екрана
първата редица хоризонтално, а втората вертикално, така че да се
пресичат в общия си знак.
Ако редиците нямат общ знак да се изведе само уведомително
съобщение.
Пример :
м
а
шапка
и
н
а
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first word: ");
		String firstWord = input.nextLine();
		System.out.print("Enter second word: ");
		String secondWord = input.nextLine();
		String interval = "";
		
		char[] firstWordLetters = new char[firstWord.length()];
		for(int index = 0 ; index < firstWordLetters.length ; index++){
			firstWordLetters[index] = firstWord.charAt(index);
		}
		
		char[] secondWordLetters = new char[secondWord.length()];
		for(int index = 0 ; index < secondWordLetters.length ; index++){
			secondWordLetters[index] = secondWord.charAt(index);
		}
		
		for (int col = 0; col < firstWordLetters.length; col++) {
			for (int row = 0; row < secondWordLetters.length; row++) {
				if (firstWordLetters[col] == secondWordLetters[row]) {
					for (int i = 0; i < col; i++) {
						System.out.println(interval + firstWordLetters[i]);
					}
					System.out.println(secondWordLetters);

					for (int i = col + 1; i < firstWordLetters.length; i++) {
						System.out.println(interval + firstWordLetters[i]);
					}
					System.out.println();
					
				}
				interval += " ";
			}

			interval = "";
		}
		
		input.close();
	}

}

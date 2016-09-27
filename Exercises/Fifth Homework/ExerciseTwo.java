import java.util.Scanner;


public class ExerciseTwo {
	/*Да се състави програма, чрез която от клавиатурата се въвеждат
последователно две думи с дължина 10-20 знака.
Програмата да размени първите им 5 знака и да изведе дължината на
по-дългата, както и новото им съдържание.
Пример: uchilishe uchenik
Изход: 9 uchenishe
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

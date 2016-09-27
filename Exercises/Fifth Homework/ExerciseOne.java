import java.util.Scanner;


public class ExerciseOne {
	/*Да се състави програма, чрез която се въвеждат два низа съдържащи
до 40 главни и малки букви.
Като резултат на екрана да се извеждат низовете само с главни и само
с малки букви.
Пример: Abcd Efgh
Изход: ABCD abcd EFGH efgh
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
		}while(text.length() > 40 || textTwo.length() > 40);
		
		System.out.print(text.toUpperCase() + " ");
		System.out.print(text.toLowerCase() + " , ");
		System.out.print(textTwo.toUpperCase() + " ");
		System.out.println(textTwo.toLowerCase());
		
		input.close();
	}
}

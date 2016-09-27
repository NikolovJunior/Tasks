import java.util.Scanner;

public class ExerciseTwentyOne {
	/*
	 * Дадено е наредено тесте карти. Наредбата по тежест на карта е:
	 * 2,3,4,5,6,7,8,9,10, Вале, Дама, Поп, Асо. Наредбата по цвят на картите е:
	 * спатия, каро, купа, пика. Да се създаде програма, чрез която се въвежда N
	 * - число от интервала [1..51] и се извеждат въведения номер карта и
	 * останалите по-големи карти от тестето. 
	 * Пример: 47. 
	 * Изход: Поп купа, Поп
	 * пика, Асо спатия, Асо каро, Асо купа, Асо пика
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int number;
		do {
			System.out.print("Enter number between 1 and 51: ");
			number = input.nextInt();
		} while (number < 1 || number > 51);

		switch (number) {
		case 1:
			System.out.print("2 club, ");
		case 2:
			System.out.print("2 diamonds, ");
		case 3:
			System.out.print("2 hearts, ");
		case 4:
			System.out.print("2 spades, ");
		case 5:
			System.out.print("3 club, ");
		case 6:
			System.out.print("3 diamonds, ");
		case 7:
			System.out.print("3 hearts, ");
		case 8:
			System.out.print("3 spades, ");
		case 9:
			System.out.print("4 club, ");
		case 10:
			System.out.print("4 diamonds, ");
		case 11:
			System.out.print("4 hearts, ");
		case 12:
			System.out.print("4 spades, ");
		case 13:
			System.out.print("5 club, ");
		case 14:
			System.out.print("5 diamonds, ");
		case 15:
			System.out.print("5 hearts, ");
		case 16:
			System.out.print("5 spades, ");
		case 17:
			System.out.print("6 club, ");
		case 18:
			System.out.print("6 diamonds, ");
		case 19:
			System.out.print("6 hearts, ");
		case 20:
			System.out.print("6 spades, ");
		case 21:
			System.out.print("7 club, ");
		case 22:
			System.out.print("7 diamonds, ");
		case 23:
			System.out.print("7 hearts, ");
		case 24:
			System.out.print("7 spades, ");
		case 25:
			System.out.print("8 club, ");
		case 26:
			System.out.print("8 diamonds, ");
		case 27:
			System.out.print("8 hearts, ");
		case 28:
			System.out.print("8 spades, ");
		case 29:
			System.out.print("9 club, ");
		case 30:
			System.out.print("9 diamonds, ");
		case 31:
			System.out.print("9 hearts, ");
		case 32:
			System.out.print("9 spades, ");
		case 33:
			System.out.print("10 club, ");
		case 34:
			System.out.print("10 diamonds, ");
		case 35:
			System.out.print("10 hearts, ");
		case 36:
			System.out.print("10 spades, ");
		case 37:
			System.out.print("Jack club, ");
		case 38:
			System.out.print("Jack diamonds, ");
		case 39:
			System.out.print("Jack hearts, ");
		case 40:
			System.out.print("Jack spades, ");
		case 41:
			System.out.print("Queen club, ");
		case 42:
			System.out.print("Queen diamonds, ");
		case 43:
			System.out.print("Queen hearts, ");
		case 44:
			System.out.print("Queen spades, ");
		case 45:
			System.out.print("King club, ");
		case 46:
			System.out.print("King diamonds, ");
		case 47:
			System.out.print("King hearts, ");
		case 48:
			System.out.print("King spades, ");
		case 49:
			System.out.print("Ace club, ");
		case 50:
			System.out.print("Ace diamonds, ");
		case 51:
			System.out.print("Ace hearts, ");
		case 52:
			System.out.print("Ace spades.");
			break;
		default:
			System.out.println("Error.");
			break;
		}
		input.close();
	}

}

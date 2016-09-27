import java.util.Scanner;


public class ExerciseSix {
	/*Да се състави програма, чрез която се въвежда изречение с отделни
думи.
Като резултат на екрана да се извежда същия текст, но всяка отделна
дума да започва с главна буква, а следващите я букви да са малки.
Пример: супер яката задача
Изход: Супер Яката Задача
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

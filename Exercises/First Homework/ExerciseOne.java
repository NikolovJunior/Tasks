import java.util.Scanner;

/*Да се изведат съобщения към потребителя и да се прочетат 2 числа от
 клавиатурата A и B (може да са с плаваща запетая – double).
 После да се прочете 3-то число C и да се провери дали то е м/у A и B.
 Да се изведе подходящо съобщение за това дали C е между A и B.
 * 
 */
public class ExerciseOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter A: ");
		double A = input.nextDouble();

		System.out.println("Enter B: ");
		double B = input.nextDouble();

		System.out.println("Enter C: ");
		double C = input.nextDouble();

		if (A < C && B > C) {
			System.out.println(C + " is between " + A + " and " + B + ".");
		} else if (A > C && B < C) {
			System.out.println(C + " is between " + B + " and " + A + ".");
		} else {
			System.out.println("C is not between A and B or B and A.");
		}
		input.close();
	}

}

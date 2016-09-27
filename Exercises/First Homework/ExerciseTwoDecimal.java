import java.util.Scanner;


public class ExerciseTwoDecimal {
	/*Въведете 2 различни целочислени числа от конзолата. Запишете
	тяхната сума, разлика, произведение, остатък от деление и
	целочислено деление в отделни променливи и разпечатайте тези
	резултати в конзолата. Опитайте същото с числа с плаваща запетая.
	 * 
	 */

	public static void main(String[] args) {
		//Решение на задачата с числа с плаваща запетая.
		//Решението с целочислени числа се намира в class ExerciseTwo.
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter x: ");
		double x = input.nextDouble();
		System.out.print("Enter y: ");
		double y = input.nextDouble();
		
		double sum = ( x + y );
		double substraction = (x - y);
		double multiplication = (x * y);
		double division = (x % y);
		double integerDivision = (x / y);
		
		System.out.printf("Sum: "+ sum + " %n" + "Substraction: " + substraction + " %n" +
			    "Integer Division: " + integerDivision + " %n" + "Division: " +
			    division + " %n" + "Multiplication: " + multiplication + " %n");

		input.close();
	}

}

import java.util.Scanner;


public class ExerciseTwo {
/*Въведете 2 различни целочислени числа от конзолата. Запишете
тяхната сума, разлика, произведение, остатък от деление и
целочислено деление в отделни променливи и разпечатайте тези
резултати в конзолата. Опитайте същото с числа с плаваща запетая.
 * 
 */
	public static void main(String[] args) {
		// Решение на задачата с целочислени числа. 
		//Решението на задачата с плаваща запетая се намира в class ExerciseTwoDecimal.
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter x: ");
		int x = input.nextInt();
		System.out.print("Enter y: ");
		int y = input.nextInt();
		
		int sum = ( x + y );
		int substraction = (x - y);
		int multiplication = (x * y);
		int division = (x % y);
		int integerDivision = (x / y);
		
		System.out.printf("Sum: "+ sum + " %n" + "Substraction: " + substraction + " %n" +
			    "Integer Division: " + integerDivision + " %n" + "Division: " +
			    division + " %n" + "Multiplication: " + multiplication + " %n");

		input.close();

	}

}

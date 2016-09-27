import java.util.Scanner;

public class ExerciseEight {

	/*
	 * Да се състави програма, която чете от конзолата 4-цифренo естествено
	 * число от интервала [1000.. 9999]. От това число се формират 2 нови
	 * 2-цифрени числа. Първото число се формира от 1-та и 4-та цифра на
	 * въведеното число. Второто число се формира от 2-рa - 3-та цифра на
	 * въведеното число. Като резултат да се изведе дали 1-то ново число e
	 * по-малко <, равно = или по-голямо от 2-то число. Пример: 3332 Изход:
	 * по-малко (32<33) Пример: 1144 Изход: равни (14=14) Пример: 9875 Изход:
	 * по-голямо (95>87)
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		do {
			System.out.print("Enter four-digit number: ");
			number = input.nextInt();
		} while (number < 1000 || number > 9999);
		
		int units = number % 10; // присвоява единиците
		int tenths = number % 100; // присвоява последните 2 цифри
		int tenthsTwo = (tenths - units) / 10; // присвоява десетиците
		int hundreds = ((number - tenths) / 100) % 10; // присвоява стотиците
		int thousandths = (number - ((hundreds * 100) + tenths)) / 1000; // присвоява хилядните																	
		System.out.println("Thousandths: " + thousandths);
		System.out.println("Hundreds: " + hundreds);
		System.out.println("Tenths: " + tenthsTwo);
		System.out.println("Units: " + units);
		int firstAndLastDigit = ((thousandths * 10) + units); // първата и последната цифра
		int secondAndThirdDigit = ((hundreds * 10) + tenthsTwo); // втората и третата цифра 
		System.out.println("First and last digit number: " + firstAndLastDigit);
		System.out.println("Second and third digit number: " + secondAndThirdDigit);
		if (firstAndLastDigit > secondAndThirdDigit) {
			System.out.println(firstAndLastDigit + ">" + secondAndThirdDigit);
		} else {
			if (firstAndLastDigit < secondAndThirdDigit) {
				System.out.println(firstAndLastDigit + "<" + secondAndThirdDigit);
			}
			if (firstAndLastDigit == secondAndThirdDigit) {
				System.out.println(firstAndLastDigit + "=" + secondAndThirdDigit);
			}
		}
		input.close();
	}

}

import java.util.Scanner;

public class ExerciseEleven {
	/*
	 * Въведете число N чрез конзолата и изкарайте като резултат следния
	 * триъгълник с височина N:
     *        *
     *       ***
     *      *****
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = input.nextInt();

		for (int i = 1 ; i <= number ; i++) {
			for (int j = 1 ; j <= number - i ; j++) {
				System.out.print(" ");
			}
			for (int k = 1 ; k <= (2*i)-1 ; k++ ){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		input.close();
	}

}

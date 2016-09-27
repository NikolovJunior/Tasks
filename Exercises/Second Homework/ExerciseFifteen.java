import java.util.Scanner;


public class ExerciseFifteen {
	/*Да се състави програма, която да изчисли сумата на
всички числа от 1 до въведено число N.
Пример: 5
Изход: 15
	 */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = input.nextInt();
		int sum = 0;
		for(int i = 1 ; i <= number ; i++){
			sum += i;
		}
		System.out.print("The sum of the numbers is: " + sum);
		
		input.close();
	}

}

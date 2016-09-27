import java.util.Scanner;


public class ExerciseSeventeen {
	/*Една редица от естествени числа ще наричаме зигзагообразна нагоре,
ако за елементите и са изпълняват условията:
N1 < N2 > N3 < N4 > N5 <..
Съставете програма, която проверява дали въведени в едномерен
масив редица от числа изпълняват горните изисквания.
Пример: 1 3 2 4 3 7
Изход: изпълнява изискванията за зигзагообразна нагоре редица
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter length: ");
		int length = input.nextInt();
		int[]array = new int[length];
		int count = 0;
		int numbers;
		for(int index = 0; index<array.length ; index++){
			System.out.printf("Enter number %1$d: " , count + 1);
			numbers = input.nextInt();
			array[index] = numbers;
			count++;
		}
		
		boolean result = true;
		for (int index = 1; index <= array.length - 2; index++) {
			int previous = array[index - 1]; //предния елемент
			int next = array[index + 1]; // следващия елемент
			int current = array[index]; // сегашния елемент

			boolean bigger = (current > previous) && (current > next);
			boolean smaller = (current < previous) && (current < next);
			
			if (!(smaller || bigger)) {
				result = false;
				break;
			}
		}
		if (result) {
			System.out.println("Is jagged.");
		} else {
			System.out.println("Is not jagged.");
		}
		
		input.close();
	}

}

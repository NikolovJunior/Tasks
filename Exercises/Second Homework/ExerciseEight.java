import java.util.Scanner;


public class ExerciseEight {	
	/*По зададено число n, да се изведе на екрана таблица по
     *следния начин:
     *Въведете n:   Въведете n:   Въведете n:   Въведете n:
     *1             2             3             4  
     *0             11            222           3333
	 *              33            444           5555
	 *                            666           7777
	 *                                          9999
     */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int number = input.nextInt();
		for (int i = 1 , j = -1 ; i <= number ; i++ , j += 2) {
			for(int k = 1; k <= number ; k++) {
				System.out.print(number + j);
			}
			System.out.println();
		}
		
		input.close();
	}

}

import java.util.Scanner;


public class ExerciseFourteen {
	/*Да се състави метод, който приема за стойност число N и връща
стойността на N! (N факториел).
	 */
	static int faktorial(int n){
		int fakt = 1;
		if(n != 0){
		for(int i = 1 ; i <= n ; i++){
			fakt *= i;  
		}
		return fakt;
		}else{
			return 1;
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter N: ");
		int n = input.nextInt();
		System.out.print(n + "! = ");
		System.out.println(faktorial(n));
		
		input.close();
	}

}

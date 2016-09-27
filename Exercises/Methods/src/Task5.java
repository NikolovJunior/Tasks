import java.util.Scanner;

public class Task5 {
	/*
	 * Да се въведат от потребителя 2 числа. И да се изведат на екрана всички
	 * числа от по-малкото до по-голямото. 
	 * Въведете първото число: 12
	 * Въведете второто число: 15
	 *  12 13 14 15
	 */
	static void isGreater(int n , int m){
		if(n > m){
			printNumbers(m,n);
		}
		if(n < m){
			printNumbers(n,m);
		}
		else{
			printNumbers(n,m);
		}
	}
	static void printNumbers(int n , int m){
		if(n >= m){
			return;
		}
		for(int i = n ; i <= m ; i++){
			System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);	
	int x = input.nextInt();
	int y = input.nextInt();
	isGreater(x,y);
	
	input.close();
	}

}

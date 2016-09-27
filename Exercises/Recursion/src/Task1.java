import java.util.Scanner;

public class Task1 {
	static long fibonacci(int n){
		if(n == 0){
			return 0;
		}
		if(n == 1){
			return 1;
		}else{
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	static long factorial(int n){
		if(n==0){
			return 1;
		}
		if(n==1){
			return 1;
		}else{
			return n*factorial(n-1);
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println(fibonacci(n));
		System.out.println(factorial(n));
	}

}

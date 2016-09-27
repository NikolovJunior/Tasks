import java.util.Scanner;

public class Task7 {
	static void printTriangleIterative(int n){
		for(int index = 1 ; index <= n ; index++ ){
			for(int index2 = 1 ; index2 <= index ; index2++){
				System.out.print(index2 + " ");
			}
			System.out.println();
		}
	}
	static void printTriangleRecursive(int n , int index){
		if(index > n){
			return;
		}
		for(int index2 = 1 ; index2 <= index ; index2++){
			System.out.print(index2 + " ");
		}
		System.out.println();
		printTriangleRecursive(n, index + 1);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		printTriangleIterative(n);
		printTriangleRecursive(n,0);
	}

}
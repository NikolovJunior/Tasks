import java.util.Scanner;

public class Task9 {
	static void printMin(int[] a, int[] b) {
		Scanner input = new Scanner(System.in);
		for (int index = 0; index < a.length; index++) {
			a[index] = input.nextInt();
		}
		for (int index = 0; index < b.length; index++) {
			b[index] = input.nextInt();
		}
		System.out.println("Parviqt masiv: ");
		for (int index = 0; index < a.length; index++) {
			System.out.print(a[index] + " ");
		}
		System.out.println("Vtoriqt masiv: ");
		for (int index = 0; index < b.length; index++) {
			System.out.print(b[index] + " ");
		}
		if (a.length == b.length) {
			int[] c = new int[a.length];
			for (int index = 0; index < a.length; index++) {
				if (a[index] > b[index]) {
					c[index] = b[index];
				}
				if (a[index] < b[index]) {
					c[index] = a[index];
				}
			}
			System.out.println();
			for(int index = 0 ; index < c.length ; index++){
				System.out.print(c[index] + " ");
			}
		}else{
			System.out.println("Daljinata im ne e ravna.");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int lengthOne = input.nextInt();
		int lengthTwo = input.nextInt();
		int[] arrayOne = new int[lengthOne];
		int[] arrayTwo = new int[lengthTwo];
		printMin(arrayOne, arrayTwo);
		
	}

}

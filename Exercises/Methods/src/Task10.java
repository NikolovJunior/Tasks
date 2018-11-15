import java.util.Scanner;
//Task 10
public class Task10 {
	static void print(int[]a,int[]b){
		Scanner input = new Scanner(System.in);
		for(int index = 0 ; index < a.length ; index++){
			a[index]=input.nextInt();
		}
		for(int index = 0 ; index < b.length ; index++){
			b[index]=input.nextInt();
		}
		for(int index = 0 ; index < a.length ; index++){
			System.out.print(a[index] + " ");
		}
		for(int index = 0 ; index < b.length ; index++){
			System.out.print(b[index] + " ");
		}
		int[] c = new int[a.length + b.length];
		int count = 1;
		int countTwo = 0;
		for(int index = 0 ; index < c.length/2 ; index++){
			c[index] = a[index];
			c[c.length - count] = b[countTwo];
			count++;
			countTwo++;
		}
		System.out.println();
		for(int index = 0 ; index < c.length ; index++){
			System.out.print(c[index] + " ");
		}
		
		
		
		
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter first length");
		int length = input.nextInt();
		System.out.println("enter second length");
		int lengthTwo = input.nextInt();
		int[] a = new int [length];
		int[] b = new int [lengthTwo];
		print(a,b);

	}

}

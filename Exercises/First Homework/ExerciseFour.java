import java.util.Scanner;

public class ExerciseFour {
	// Въведете 2 различни числа от конзолата и ги разпечатайте в нарастващ ред.
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter x: ");
		int x = input.nextInt();
		System.out.print("Enter y: ");
		int y = input.nextInt();
		if (x < y) {
			System.out.print(x + " , ");
			System.out.print(y);
		} else if (x > y) {
			System.out.print(y + " , ");
			System.out.print(x);
		} else {
			System.out.print(x + " , ");
			System.out.print(y);
		}
		input.close();
	}

}

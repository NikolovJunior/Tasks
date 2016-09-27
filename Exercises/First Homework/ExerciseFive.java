import java.util.Scanner;

public class ExerciseFive {
	// Въведете 3 различни числа от конзолата и ги разпечатайте в низходящ ред.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("x: ");
		int x = input.nextInt();
		System.out.print("y: ");
		int y = input.nextInt();
		System.out.print("z: ");
		int z = input.nextInt();

		if (x > y && y > z) {
			System.out.print(x + " ,");
			System.out.print(y + " ,");
			System.out.print(z);
		} else {
			if (y > x && x > z) {

				System.out.print(y + " ,");
				System.out.print(x + " ,");
				System.out.print(z);
			}
			if (z > y && y > x) {
				System.out.print(z + " ,");
				System.out.print(y + " ,");
				System.out.print(x);
			}
			if (x > z && z > y) {
				System.out.print(x + " ,");
				System.out.print(z + " ,");
				System.out.print(y);
			}
			if (y > z && z > x) {
				System.out.print(y + " ,");
				System.out.print(z + " ,");
				System.out.print(x);
			}
			if (z > x && x > y) {
				System.out.print(z + " ,");
				System.out.print(x + " ,");
				System.out.print(y);
			}
			if (x == y && x > z) {
				System.out.print(x + " ,");
				System.out.print(y + " ,");
				System.out.print(z);
			}
			if (x == y && x < z) {
				System.out.print(z + " ,");
				System.out.print(x + " ,");
				System.out.print(y);
			}
			if (x == z && x > y) {
				System.out.print(x + " ,");
				System.out.print(z + " ,");
				System.out.print(y);
			}
			if (x == z && x < y) {
				System.out.print(y + " ,");
				System.out.print(x + " ,");
				System.out.print(z);
			}
			if (y == z && y > x) {
				System.out.print(y + " ,");
				System.out.print(z + " ,");
				System.out.print(x);
			}
			if (y == z && y < x) {
				System.out.print(x + " ,");
				System.out.print(y + " ,");
				System.out.print(z);
			}
			if (x == y && x == z) {
				System.out.print(x + " ,");
				System.out.print(y + " ,");
				System.out.print(z);
			}
		}
		input.close();
	}

}

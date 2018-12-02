import java.util.Scanner;
//Task 2
public class Task2 {
	static int minElement(int[] a, int index) {
		if (index >= a.length) {
			return index;
		}
		int min = minElement(a, index + 1);
		if (a[index] < min) {
			return a[index];
		} else {
			return min;
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a = { 3, 4, 5, 6, 1, 2, 10,-50, 22, 33 };
		System.out.println(minElement(a, 0));
	}

}

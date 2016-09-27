public class Task8 {
	static void printNumbers() {
		int n = 100;
		int i = 1;
		for (int index = 1; index <= n; index++)
			if (index % 5 == 0) {
				System.out.print(index + " ");
			}
	}

	static void printNumbersWithRecursion(int n, int index) {
		if (index > n) {
			return ;
		}
		if (index % 5 == 0) {
			System.out.print(index + " ");
			printNumbersWithRecursion(n, index + 1);
		} else {
			printNumbersWithRecursion(n, index + 1);
		}
	}

	public static void main(String[] args) {
		printNumbers();
		System.out.println();
		printNumbersWithRecursion(100, 1);
	}

}

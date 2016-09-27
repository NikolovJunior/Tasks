import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		char result = ' ';
		int count = 1;
		int maxCount = 0;
		for (int index = 0; index < text.length(); index++) {
			for (int index2 = index + 1; index2 < text.length(); index2++) {
				if (text.charAt(index) == text.charAt(index2)) {
					count++;
					if (count > maxCount) {
						maxCount = count;
						result = text.charAt(index);
					}
				}
			}
			count = 1;
		}

		System.out.println(maxCount);
		System.out.println(result);
	}
}

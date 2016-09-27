import java.util.Scanner;

public class ExerciseFour {
	/*
	 * �� �� ������� ����� � �� �� �������� ���� � ���������. �������� ������ ��
	 * ���������: 
	 *  [3 7 7 3]
	 *  [4]
	 *  [1 55 1] 
	 *  [6 27 -1 5 7 7 5 -1 27 6]
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter length: ");
		int length = input.nextInt();
		int[] array = new int[length];
		int count = 0;
		while (count < length) {
			System.out.printf("Enter number %1$d: ", (count + 1));
			int numbers = input.nextInt();
			array[count] = numbers;
			count++;
		}

		boolean result = false;
		int countOne = 0;
		int countTwo = 1;
		int index = 0;

		while (index < length) {
			if (array[countOne] == array[array.length - countTwo]) { // ��������� �� ��������� ������
				result = true;
				if (countOne == array.length - countTwo) {
					break;
				}
				if (array.length % 2 == 0) {
					if (array[countOne] == array[array.length - countTwo]) { // ��������� �� ������� ������
						result = true;
						if (array[array.length / 2 - 1] == array[array.length / 2]) {
							break;
						}
					}
				}
			} else {
				if (array[countOne] != array[array.length - countTwo]) { // ������ �� � ���������
					result = false;
					break;
				}
			}
			countOne++;
			countTwo++;
		}

		if (result) {
			System.out.println("Array is a palindrome.");

		} else {
			System.out.println("Array is not palindrome.");
		}

		input.close();
	}

}

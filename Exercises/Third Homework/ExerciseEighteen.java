public class ExerciseEighteen {
	/*
	 * ������ �� ��� ��������� ������ � ���������� �����. �� �� �������
	 * ��������, ����� �������� ������ ����� � ������� ������� �� ����� ������ �
	 * ������� � ����� �����, ��-�������� �� ����� �����. �� �� ������
	 * ������������ � �� ����� ������ ������: 18,19,32,1,3, 4, 5, 6, 7, 8 1, 2,
	 * 3,4,5,16,17,18,27,11 �����: 18,19,32 ,4,5,16,17,18,27,11
	 */

	public static void main(String[] args) {
		int[] array = { 18, 19, 32, 1, 3, 4, 5, 6, 7, 8 };
		System.out.print("First array: ");
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}

		System.out.println();
		int[] arrayTwo = { 1, 2, 3, 4, 5, 16, 17, 18, 27, 11 };
		System.out.print("Second array: ");
		for (int index = 0; index < arrayTwo.length; index++) {
			System.out.print(arrayTwo[index] + " ");
		}

		int[] arrayThree = new int[10];
		for (int index = 0; index < array.length; index++) {
			if (array[index] > arrayTwo[index]) {
				arrayThree[index] = array[index];
			}
			if (array[index] < arrayTwo[index]) {
				arrayThree[index] = arrayTwo[index];
			}
			if (array[index] == arrayTwo[index]) {
				arrayThree[index] = array[index];
			}
		}
		System.out.println();
		System.out.print("Array with the greatest numbers: ");
		for (int index = 0; index < arrayThree.length; index++) {
			System.out.print(arrayThree[index] + " ");
		}

	}

}

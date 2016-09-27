public class ExerciseSix {
	/*
����� ������������� �������� ��������� �� ���������� �����.
������� �� �������� � ��������� ������� � ������� 6 ���� � 6
������.
�� �� ������� ��������, ���� ����� �� ������ ������ �� ������
�������� �� �������� � ����� ������: 2,4 � 6.
���������� �� ������� � ������ �� ����� ������� ���.
������:
11,12,13,14,15,16,
21,22,23,24,25,26,
31,32,33,34,35,36,
41,42,43,44,45,46,
51,52,53,54,55,56,
61,62,63,64,65,66
�����:
21,22,23,24,25,26 ���� 141
41,42,43,44,45,46 ���� 261
61,62,63,64,65,66 ���� 381
���� �� ���������� 783
	 */

	public static void main(String[] args) {
		int[][] array = { 
				{ 11, 12, 13, 14, 15, 16 },
				{ 21, 22, 23, 24, 25, 26 },
				{ 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 },
				{ 51, 52, 53, 54, 55, 56 },
				{ 61, 62, 63, 64, 65, 66 }
				};
		
		int sum = 0;
		int sumTwo = 0;
		for (int row = 0; row < array.length ; row++) {
			for (int col = 0; col < array[row].length; col++) {
				if(row % 2 != 0){
					sum += array[row][col];
					System.out.print(array[row][col] + " ");
				}
			}
			if(row % 2 != 0){
				System.out.print("The sum of row: " + sum);
			    System.out.println();
			    sumTwo += sum;
			    sum = 0;
			}
		}
		System.out.println();
		System.out.println("The sum of all elements from rows with even indexes is: " + sumTwo);
		
		
	}

}


public class ExerciseSeven {
	/*����� ������������� �������� ��������� �� ���������� �����,
�������� � ��������� ������� � ������� 6 ���� � 6 ������.
�� �� ������� �������� , ���� ����� �� ������ ������ �� ������
��������, ����� ���� �� ������� �� ��� � ������ � ����� �����.
���������� �� ������� ����������� ���� �� ����� ������� ��� ��
����������� �������, ����� � ������ ���� �� ���� ��������.
�� �� �������� ���� ���� �����.
������:
11,12,13,14,15,16,
21,22,23,24,25,26,
31,32,33,34,35,36,
41,42,43,44,45,46,
51,52,53,54,55,56,
61,62,63,64,65,66
�����:
11, ,13, ,15, , ���� �� ���������� �� ����: 39
22, ,24, ,26, ���� �� ���������� �� ����: 72
31, ,33, ,35, , ���� �� ���������� �� ����: 99
42, ,44, ,46, ���� �� ���������� �� ����: 132
51, ,53, ,55, , ���� �� ���������� �� ����: 159
62, ,64, ,66 ���� �� ���������� �� ����: 192
���� �� ����������: 693
	 * 
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
		for(int index = 0; index < array.length ; index++){
			if (index % 2 == 0) {
				System.out.print(array[index][index - index + 0] + " ");
				System.out.print(array[index][index - index + 2] + " ");
				System.out.print(array[index][index - index + 4] + " ");
				sum = sum + array[index][index - index + 0] + array[index][index - index + 4] + array[index][index - index + 4] - 2;	
			}else {
				System.out.print(array[index][index - index + 1] + " ");
				System.out.print(array[index][index - index + 3] + " ");
				System.out.print(array[index][index - index + 5] + " ");
				sum = sum + array[index][index - index + 1] + array[index][index - index + 3] + array[index][index - index + 5] ;
			}
			System.out.print("The sum of row: " + sum);
			System.out.println();
			sumTwo += sum;
			sum = 0;
		}
		System.out.println();
		System.out.println("The sum of all elements from rows with even indexes is: "
						+ sumTwo);
		
// � ��� ������		
//		int[][] array = { 
//				{ 11, 12, 13, 14, 15, 16 },
//				{ 21, 22, 23, 24, 25, 26 },
//				{ 31, 32, 33, 34, 35, 36 },
//				{ 41, 42, 43, 44, 45, 46 },
//				{ 51, 52, 53, 54, 55, 56 },
//				{ 61, 62, 63, 64, 65, 66 }
//				};
//		
//		int sum = 0;
//		int sumTwo = 0;
//		for (int row = 0; row < array.length ; row++) {
//			for (int col = 0; col < array[row].length; col++) {
//				if(row % 2 != 0 && col % 2 != 0){
//					sum += array[row][col];
//					System.out.print(array[row][col] + " ");
//				} else{
//				if(row % 2 == 0 && col % 2 == 0){
//					sum += array[row][col];
//					System.out.print(array[row][col] + " ");
//				}
//				}
//			}
//				System.out.print("The sum of row: " + sum);
//			    System.out.println();
//			    sumTwo += sum;
//			    sum = 0;
//		}
//		System.out.println();
//		System.out.println("The sum of all elements from rows with even indexes is: " + sumTwo);
		
	}

}

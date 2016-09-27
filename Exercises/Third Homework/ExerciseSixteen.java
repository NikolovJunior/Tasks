
public class ExerciseSixteen {
	/*�� �� ������� ��������, ���� ����� ������������� �������� 10
������ ����� �� ��������� �� ���������� �� ������� �����:
1. ������� �������������� �����.
2. ������ �������� ��� �������� ��-����� �� -0.231 �� ������� ���
������ �� �������� �� �������� �� ����� + ������� 41.25, � ������
�������� �������� �� ������� � �������������� ����� ����� �������
� �������� ������� �����. ��������� ����� �� ������� ������� � 1.
3. �� �� ������� ���������� �� �������� � ��������������� �����.
������: -1.12, -2.43, 3.1, 4.2, 0, 6.4, - 7.5, 8.6, 9.1, -4
�����: 42.25, 45.25, 9.3, 16.8, 0, 38.4, 90.25, 68.8, 81.9,141.25
	 * 
	 */

	public static void main(String[] args) {
		float[] array = {-1.12f, -2.43f, 3.1f, 4.2f, 0f, 6.4f, - 7.5f, 8.6f, 9.1f, -4f};
		float[] arrayTwo = new float[array.length];
		System.out.print("Initial array: ");
		for(int index = 0 ; index < array.length ; index++){
			if(array[index] < -0.231){
				arrayTwo[index]=(((index+1)*(index+1)) + 41.25f);
			} 
			else {
				arrayTwo[index]=array[index]*(index+1);
			}
			
			System.out.print(array[index] + " ");
			
		}
		System.out.println();
		System.out.print("Completed array: ");
		for(int index = 0 ; index < array.length ; index++){
			System.out.print(arrayTwo[index] + " ");
		}


	}

}

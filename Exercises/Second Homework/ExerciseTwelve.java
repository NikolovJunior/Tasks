public class ExerciseTwelve {

	/*
	 * ������ 12: �� �� ������� ��������, ����� ������� ������ ����������
	 * ���������� �����, ����� ����� ������� ����� �.�. 100,101, 606 � �.�. ��
	 * �� ��������.
	 */
	public static void main(String[] args) {
		for (int i = 102; i <= 987; i++) {
			int units = i % 10; // ��������� ���������
			int tenths = i % 100; // ��������� ���������� 2 �����
			int tenths2 = (tenths - units) / 10; // ��������� ����������
			int hundreds = (i - tenths) / 100; // ��������� ���������
			if (hundreds == units || units == tenths2 || tenths2 == hundreds) {

			} else {
				System.out.print(i + " ");
			}
		}

	}

}

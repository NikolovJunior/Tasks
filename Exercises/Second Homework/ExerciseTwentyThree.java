public class ExerciseTwentyThree {
	/*
	 * �� �� ������� ��������, ����� ���� ����� while ������� ��������� ��
	 * ���������, �� ��� ����������. �.�. ��� � �������� 4*5 �� �� ������� 5*4.
	 * ������: 1-�� ���: 1*1; 1*2; 1*3; 1*4; 1*5; 1*6; 1*7; 1*8; 1*9; 2-�� �e�:
	 * 2*2; 2*3; 2*4; 2*5; 2*6; 2*7; 2*8; 2*9; ... 9-�� ���: 9*9;
	 */

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i * j == i * (i - 1)) {
					System.out.println();
				} else {
					System.out.print(i + "*" + j + "; ");
				}
			}
		}

	}

}

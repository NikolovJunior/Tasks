import java.util.Scanner;

public class ExerciseThirteen {

	/*
	 * �� �� ������� ��������, ����� �� ������� ����� � �������/����� ��
	 * ���������� ����������� t � ������ ������. �������������� ��������� ��:
	 * ��� -20 ������ �������; ����� 0 � -20 - �������; ����� 15 � 0 - ������;
	 * ����� 25 � 15 - �����; ��� 25 � ������. ������ �����: ���� ����� ��
	 * ��������� [-100..100]. ������ �����: ���� ����� �� ��������� [-100..100].
	 * ������: 12 �����: ������
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int temperature;
		do {
			System.out.print("Enter temperature: ");
			temperature = input.nextInt();
		} while (temperature < -100 || temperature > 100);

		if (temperature <= -20) {
			System.out.println("Ice cold.");
		} else {
			if (temperature < 0 & temperature > -20) {
				System.out.println("Coldly.");
			}
			if (temperature < 15 & temperature >= 0) {
				System.out.println("Cold.");
			}
			if (temperature < 25 & temperature >= 15) {
				System.out.println("Warm.");
			}
			if (temperature >= 25) {
				System.out.println("Hot.");
			}
		}
		input.close();
	}

}

import java.util.Scanner;

public class ExerciseSeven {
	/*
	 * �������� 3 ���������� �� ������������ � ��� (���������� ���), ���� ����
	 * (����� � ������� �������), ���� ��� ����� � ����� ���. ���������
	 * ��������, ����� ����� ������� �� ������ �� ���� ����� �� ������� �����: -
	 * ��� ��� �����, ���� �� ������� - ��� ���� ����, �� �� ���� ��������� -
	 * ��� ����� � �� ���� ����� � �� ��� ��� - ��� ��� �����, �� ����� �� ����
	 * � �������� - ��� ���� ��-����� �� 10 ��, �� ����� �� ����. ����������
	 * ������� �������� ���� ��������� � ���������.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("The time is: ");
		int time = input.nextInt(); //������� �� �� ��������
		System.out.print("I have: ");
		float money = input.nextFloat();
		System.out.println("lv.");
		System.out.print("Am i healthy?");
		boolean healthy = input.nextBoolean();
		if (healthy == false && money <= 0) {
			System.out.println("I will stay at home and i will drink tea.");
		} else if (healthy == false && money > 0) {
			System.out.println("I will buy medicaments.");
		} else if (healthy == true && money < 10) {
			System.out.println("I will go to Coffee.");
		} else if (healthy == true && money >= 10) {
			System.out.println("I will go to cinema.");
		}

		input.close();
	}

}

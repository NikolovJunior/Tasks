import java.util.Scanner;

public class ExerciseFour {
	/*
	 * �� �� ������� ��������, ���� ����� �� �������� ����� ����� �� �����
	 * ������ ��������� ��� �������, �� ������� ��� ��� ��� ��-����� ���� ��
	 * ASCII �������� �� ����������� ����� �����. ������: Anna Dosewa Asenowa,
	 * Iwo Peew Peew �����: Anna Dosewa Asenowa
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two names splited with comma: ");
		String text = input.nextLine();
		String[] names = text.split(",");
	
		if (names[0].compareToIgnoreCase(names[1]) < 0) {
			System.out.println(names[0]);
		}
		
		if (names[0].compareToIgnoreCase(names[1]) == 0) {
			System.out.println("Ravni sa.");
		}
		
		if (names[0].compareToIgnoreCase(names[1]) > 0) {
			System.out.println(names[1]);
		}

		input.close();
	}

}

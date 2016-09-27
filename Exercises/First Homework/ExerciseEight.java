import java.util.Scanner;

public class ExerciseEight {

	/*
	 * �� �� ������� ��������, ����� ���� �� ��������� 4-������o ����������
	 * ����� �� ��������� [1000.. 9999]. �� ���� ����� �� �������� 2 ����
	 * 2-������� �����. ������� ����� �� ������� �� 1-�� � 4-�� ����� ��
	 * ���������� �����. ������� ����� �� ������� �� 2-�a - 3-�� ����� ��
	 * ���������� �����. ���� �������� �� �� ������ ���� 1-�� ���� ����� e
	 * ��-����� <, ����� = ��� ��-������ �� 2-�� �����. ������: 3332 �����:
	 * ��-����� (32<33) ������: 1144 �����: ����� (14=14) ������: 9875 �����:
	 * ��-������ (95>87)
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		do {
			System.out.print("Enter four-digit number: ");
			number = input.nextInt();
		} while (number < 1000 || number > 9999);
		
		int units = number % 10; // ��������� ���������
		int tenths = number % 100; // ��������� ���������� 2 �����
		int tenthsTwo = (tenths - units) / 10; // ��������� ����������
		int hundreds = ((number - tenths) / 100) % 10; // ��������� ���������
		int thousandths = (number - ((hundreds * 100) + tenths)) / 1000; // ��������� ���������																	
		System.out.println("Thousandths: " + thousandths);
		System.out.println("Hundreds: " + hundreds);
		System.out.println("Tenths: " + tenthsTwo);
		System.out.println("Units: " + units);
		int firstAndLastDigit = ((thousandths * 10) + units); // ������� � ���������� �����
		int secondAndThirdDigit = ((hundreds * 10) + tenthsTwo); // ������� � ������� ����� 
		System.out.println("First and last digit number: " + firstAndLastDigit);
		System.out.println("Second and third digit number: " + secondAndThirdDigit);
		if (firstAndLastDigit > secondAndThirdDigit) {
			System.out.println(firstAndLastDigit + ">" + secondAndThirdDigit);
		} else {
			if (firstAndLastDigit < secondAndThirdDigit) {
				System.out.println(firstAndLastDigit + "<" + secondAndThirdDigit);
			}
			if (firstAndLastDigit == secondAndThirdDigit) {
				System.out.println(firstAndLastDigit + "=" + secondAndThirdDigit);
			}
		}
		input.close();
	}

}

import java.util.Scanner;


public class ExerciseTwelve {
	
	/*��������� ������ �� ������ ������ ������ �� 4 � ����������
����������, �� ��� �������� ������ �� 400, �.�. 1900 �� � ���������,
�� 1600 � 2000 �� ���������.
��������� ��������, ����� �� ������ ���, �����, ������ ���������
���������� ����.
������ �����: ��� ����� �� ���, �����, ������.
������: 28, 2, 2000
�����: 29,2,2000 
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int day;
		int month;
		int year;
		do {
			System.out.print("Enter day: ");
			day = input.nextInt();
			System.out.print("Enter month: ");
			month = input.nextShort();
			System.out.print("Enter year: ");
			year = input.nextInt();
		} while((day < 1 || day > 31) || (month < 1 || month > 12)); //��. ��.  || (year  < 1)
		
		int lastDay = 0;
		
		if(month == 2) {
			if(((year % 4 == 0) && (year % 100 != 0)) || ((year % 400 == 0))) {
				lastDay = 29; // ������ � ��������� ������
			} else {
				lastDay = 28; // �� � ��������� ������
			}
		} else {
			if((month == 1) || (month == 3) || (month == 5) || (month == 7) 
					|| (month == 8) || (month == 10) || (month == 12)){ // ������ � 31 ���
				lastDay = 31;
			}
			if((month == 4) || (month == 6) || (month == 9) || (month == 11)){ // ������ � 30 ���
				lastDay = 30;
			}
		}
		if (day < lastDay) { // ������� ���
			day++;
		} else {
			day = 1;
			if (month < 12){ // ������� �����
				month++;
			}	
			else { // �������� ������
				month = 1;
				year++;
			}
		}
		System.out.print(day + "," + month + "," + year);
		
		input.close();
	}
	
}

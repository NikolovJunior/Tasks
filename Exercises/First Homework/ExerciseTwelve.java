import java.util.Scanner;


public class ExerciseTwelve {
	
	/*Високосни години са всички години кратни на 4 с изключения
столетията, но без столетия кратни на 400, т.е. 1900 не е високосна,
но 1600 и 2000 са високосни.
Съставете програма, която по дадени ден, месец, година отпечатва
следващата дата.
Входни данни: три числа за ден, месец, година.
Пример: 28, 2, 2000
Изход: 29,2,2000 
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
		} while((day < 1 || day > 31) || (month < 1 || month > 12)); //сл. Хр.  || (year  < 1)
		
		int lastDay = 0;
		
		if(month == 2) {
			if(((year % 4 == 0) && (year % 100 != 0)) || ((year % 400 == 0))) {
				lastDay = 29; // когато е високосна година
			} else {
				lastDay = 28; // не е високосна година
			}
		} else {
			if((month == 1) || (month == 3) || (month == 5) || (month == 7) 
					|| (month == 8) || (month == 10) || (month == 12)){ // месеци с 31 дни
				lastDay = 31;
			}
			if((month == 4) || (month == 6) || (month == 9) || (month == 11)){ // месеци с 30 дни
				lastDay = 30;
			}
		}
		if (day < lastDay) { // следващ ден
			day++;
		} else {
			day = 1;
			if (month < 12){ // следващ месец
				month++;
			}	
			else { // следваща година
				month = 1;
				year++;
			}
		}
		System.out.print(day + "," + month + "," + year);
		
		input.close();
	}
	
}

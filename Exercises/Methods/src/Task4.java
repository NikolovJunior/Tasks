import java.util.Scanner;

public class Task4 {
	static void days(String months , int y){
		if(y % 4 == 0 && (y % 100 != 0 || y % 400 == 0)){
		switch(months){
		case "January": System.out.println("31");break;
		case "February": System.out.println("29");break;
		case "March": System.out.println("31");break;
		case "April": System.out.println("30");break;
		case "May": System.out.println("31");break;
		case "June": System.out.println("30");break;
		case "July": System.out.println("31");break;
		case "August": System.out.println("31");break;
		case "September": System.out.println("30");break;
		case "October": System.out.println("31");break;
		case "November": System.out.println("30");break;
		case "December": System.out.println("31");break;
		default: System.out.println("Error.");break;
		}
		}else{
			switch(months){
			case "January": System.out.println("31");break;
			case "February": System.out.println("28");break;
			case "March": System.out.println("31");break;
			case "April": System.out.println("30");break;
			case "May": System.out.println("31");break;
			case "June": System.out.println("30");break;
			case "July": System.out.println("31");break;
			case "August": System.out.println("31");break;
			case "September": System.out.println("30");break;
			case "October": System.out.println("31");break;
			case "November": System.out.println("30");break;
			case "December": System.out.println("31");break;
			default: System.out.println("Error.");break;
		}
	}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter months.");
		String month = input.nextLine();
		System.out.println("Enter year.");
		int year = input.nextInt();
		days(month,year);
		
		
		
	}

}

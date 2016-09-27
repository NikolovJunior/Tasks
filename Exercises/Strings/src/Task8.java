import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text;
		String text2;
		int count = 0;
		do{
			text = input.nextLine();
			text2 = input.nextLine();
			count++;
		}while(text.charAt(count) == text.charAt(count+1));
		
	}

}

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		int count = 0;
		for(int index = 0 ; index < text.length(); index++){
		if(text.charAt(index) == text.charAt(text.length() - 1 - index)){
			count++;
			//System.out.println("palindrome");
		}
		else{
			System.out.println("It's not palindrome.");
			break;
		}
		}
		if(count == text.length()){
			System.out.println("Palindrome.");
		}
		
		
	}
}

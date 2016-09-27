import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		char[] result = new char[text.length()];
		for(int index = 0 ; index < text.length(); index ++){
			result[index] = (char)(text.charAt(index)+5);
		}
		for(int index = 0 ; index < text.length(); index ++){
			System.out.print(result[index]);
		}
		
		
	}

}

import java.util.Scanner;

public class Task1{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text; 
		String textTwo; 
		do{
			text = input.nextLine();
			textTwo = input.nextLine();
		}while(text.length() > 40 || textTwo.length() > 40);
		System.out.print(text.toUpperCase() + " ");
		System.out.println(text.toLowerCase());
		System.out.print(textTwo.toUpperCase()+ " ");
		System.out.println(textTwo.toLowerCase());
	}

}

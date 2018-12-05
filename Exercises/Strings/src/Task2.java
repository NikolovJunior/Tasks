import java.util.Scanner;
//Task 2
public class Task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		String[] words = text.split(" ");
		String result = "";
		for(int index = 0 ; index < words.length ; index++){
			result += words[index].substring(0,1).toUpperCase() + words[index].substring(1).toLowerCase() + " ";
		}
		System.out.println(result);
		
	}

}
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		String[] words = text.split(" ");
		int length = 0;
		String longestWord = "";
		for(String str : words){
			if(str.length() > length){
				length = str.length();
				longestWord = str;
			}
		}
		System.out.println(length);
		System.out.println(longestWord);

	}

}

import java.util.Scanner;

public class Task10 {
	static void printSpaces(int numOfSpaces){
		for(int spaces = 0 ; spaces < numOfSpaces ; spaces++){
			System.out.print(" ");
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		String[] words = text.split(" ");
		String longestWord = " ";
		int longestWordLength = 0;
		for(String str : words){
			if(str.length() > longestWordLength){
				longestWordLength = str.length();
				longestWord = str;
			}
		}
		System.out.println(longestWordLength);
		for(int index = 0 ; index < longestWordLength + 2 ; index++){
			System.out.print("*");         //gorniq horizontalen red red na ramkata
		}System.out.println();
		for(int index = 0 ; index < words.length ; index++){
			System.out.print("*"); // lqvata zvezdichka ot ramkata
			System.out.print(words[index]); //chislata
			printSpaces(longestWordLength - words[index].length()); // praznite mesta
			System.out.print("*"); // dqsnata zvezdichka ot ramkata
			System.out.println();
		}
		for(int index = 0 ; index < longestWordLength + 2 ; index++){
			System.out.print("*");
		}System.out.println();        //dolniq horizontalen red na ramkata
	}

}

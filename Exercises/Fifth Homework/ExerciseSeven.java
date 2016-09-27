import java.util.Scanner;


public class ExerciseSeven {
	/*
Да се състави програма, която чете набор от думи разделени с
интервал.
Като резултат да се извеждат броя на въведените думи, както и броя
знаци в най-дългата дума.
Пример: asd fg hjkl
Изход: 3 думи, най-дългата е с 4 символа.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter some words: ");
		String text = input.nextLine();
		String[] words = text.split(" ");
		String longestWord = "";
		int length = 0;
		int count = 0;
		for(String word : words){
			if(word.length() > length){
				longestWord = word;
				length = word.length();
			}
			count++;
		}
		System.out.println("There are " + count + " words.");
		System.out.println("The longest word is: " + longestWord + ".");
		System.out.println("The longest word is with " + length +  " signs.");
		
		input.close();
	}

}

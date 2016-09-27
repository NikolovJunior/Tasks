import java.util.Scanner;


public class ExerciseTen {
	/*Да се състави програма, която по даден низ връща друг,
символите, на който са получени като към всеки код на символ
от ASCII таблицата е добавеното числото 5 и е записан
новополучения символ.
Пример :
Вход: Hello
Изход: Mjqqt

	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter text: ");
		String a = input.nextLine();
		int[] array = new int[a.length()];
		
		for(int index = 0; index < array.length ; index++){
			array[index] = a.charAt(index) + 5;
			//System.out.print(array[index] + " ");
		}
		
		char[] result = new char[a.length()];
		for(int index = 0 ; index < result.length ; index++){
			result[index] = (char)(array[index]);
			System.out.print(result[index] + "");
		}
		
		input.close();
	}

}

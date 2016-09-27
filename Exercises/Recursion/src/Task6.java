import java.util.Scanner;

public class Task6 {
	static void reverse(int number){
		if(number < 10){
			System.out.println(number);
			return;
		}else{
			System.out.print(number%10);
			reverse(number/10);
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		reverse(number);
	}

}

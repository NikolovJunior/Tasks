import java.util.Scanner;

//Task 2
public class Task2 {
	static void compare(int n , int m){
		if(n == m){
			System.out.println(n + " == " + m);
		}else{
			System.out.println("Ne sa ravni.");
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();    
		int y = input.nextInt();
		compare(x,y);
	}

}

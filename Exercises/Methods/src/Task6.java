import java.util.Scanner;

public class Task6 {
	static boolean isTriangle(int x , int y , int z){
		if((x<(y+z)) && (y <(x+z)) && (z<(x+y))){
			return true;
		}else{
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		System.out.println(isTriangle(a,b,c));
		
	}

}

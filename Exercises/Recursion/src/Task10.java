
import java.util.Scanner;
//Task 10
public class Task10 {
	static int production(int n, int m , int index){
		if(n <= index){
			return 0;
		}
		return m + production(n,m,index+1);
	}
	static int stepen(int n, int m){
		if(m == 0){
			return 1;
		}
		if(m == 1){
			return n;
		}
		return production(stepen(n,m-1), n , 0);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		//System.out.println(production(n,m,0));
		System.out.println(stepen(n,m));
	}

}

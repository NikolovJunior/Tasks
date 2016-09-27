import java.util.Scanner;

public class Task9 {
	static void production(int n, int m , int index){
		int prod = 0;
		for(index = 0; index < m ; index++){
			prod += n;
		}
		System.out.println(prod);
	}	
	static long prod(int n , int m , int index){
		if(index > m){
			return 0;
		}
		return n + prod(n,m,index+1);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		//System.out.println(production(n,m,0));
		production(n,m,0);
	}

}

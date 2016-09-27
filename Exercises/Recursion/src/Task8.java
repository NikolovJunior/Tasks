import java.util.Scanner;

public class Task8 {
	static boolean prime(int n ,int index){
		if(n == 0){
			return false;
		}
		if(n == 1){
			return false;
		}
		if(n == 2 ){
			return true;
		}
		if(index == n-1){
			return true;
		}
		if(n % index == 0){
			return false;
		}else{
			return prime(n,index+1);
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println(prime(n,2));
	}

}

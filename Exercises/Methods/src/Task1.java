public class Task1 {
	static void printAverage(int[] a,int n){
		if(n >= a.length-1){
			return;
		}
		double sum = 0;
		for(int index = 0 ; index < a.length ; index++){
			System.out.print(a[index] + " ");
			sum+=a[index];
		}
		double average = sum/a.length;
		System.out.println();
		System.out.println(average);
	}
	static void printArrayWithRecursion(int[] a ,int n){
		if(n >= a.length){
			return ;
		}else{
			System.out.print(a[n] + " ");
		    printArrayWithRecursion(a, n + 1 );
		}
	}
	
	//main function here
	public static void main(String[] args) {
		int [] a = {2,4,8};
		printAverage(a,0);
		printArrayWithRecursion(a, 0);
	}

}

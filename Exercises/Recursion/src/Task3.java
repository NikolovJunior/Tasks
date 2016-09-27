public class Task3 {
	static boolean isIncreasingRecursive(int []a,int index){
		if(index >= a.length - 1){
			return true;
		}
		if(a[index] < a[index+1]){
			return isIncreasingRecursive(a, index+1);
		}else{
			return false;
		}
		
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,16,7,8,9,10};
		System.out.println(isIncreasingRecursive(a, 0));
	}

}

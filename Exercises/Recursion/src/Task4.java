public class Task4 {
	static boolean checkForDuplicateIterative(int[] array){
		for(int index = 0 ; index < array.length ; index++){
			for(int index2 = index+1 ; index2 < array.length ; index2++){
				if(array[index] == array[index2]){
					return true;
				}
			}
		}
		return false;
	}
	static boolean checkForDuplicateRecursive(int[]a,int index){
		if(a.length <= index){
			return false;
		}
		for(int index2 = index + 1 ; index2 < a.length ; index2++){
			if(a[index] == a[index2]){
				return true;
			}
		}
		return checkForDuplicateRecursive(a, index + 1);
	}
	public static void main(String[] args) {
		int [] a = {3,5,1,2,11,8,9,6,7,9};
		System.out.println(checkForDuplicateIterative(a));
		System.out.println(checkForDuplicateRecursive(a, 0));
	}

}

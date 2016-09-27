public class Task5 {
	static int indexOfMax(int[]a,int index){
		if(a.length-1 <= index){
			return index;
		}
		int maxIndex = indexOfMax(a,index+1);
		if(a[index] > a[maxIndex]){
			return index;
		}else {
		return maxIndex;
		}
	}
	public static void main(String[] args) {
		int [] a = {4,3,5,10,23,40,12,99,1,8};
		System.out.println(indexOfMax(a,0));
		
		
		
	}

}

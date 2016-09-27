public class Task7 {
	static void splitNumbers(String[] text) {
		String[] numbers = new String[text.length];
		String appending = " ";
		for(String s : text){
			appending += s;
		}
		int count = 0;
		System.out.println(appending);
		
		String [] result = appending.split("[^0-9]+");
		String appending2 = " ";
		for(String s2 : result){
			appending2 += s2;
			count++;
		}
		System.out.println(appending2.trim());
		System.out.println(appending2.length()-1);
		
	}

	public static void main(String[] args) {
		String[] str = { "fsdaf", "12das", "d123s", "d1d46", "dsf6" };
		splitNumbers(str);

	}

}

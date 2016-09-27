package Task2;


public class Call {

	static float priceForAMinute;
	static String caller;
	static String receiver;
	static float duration;
	
	GSM info;
	
	Call(float priceForAMinute,String caller,String receiver,float duration){
		if(priceForAMinute > 0){
			this.priceForAMinute = priceForAMinute;
		}
		if(caller != null && !caller.equals("") && caller.length() == 10){
			String[]numbers = caller.split("");
			if(numbers[1].equals("0") && numbers[2].equals("8")){
				this.caller = caller;
			}
		}
		if(receiver != null && !receiver.equals("") && receiver.length() == 10){
			String[]numbers = receiver.split("");
			if(numbers[1].equals("0") && numbers[2].equals("8")){
				this.receiver = receiver;
			}
		}
		if(duration > 0.0f){
			this.duration = duration;
		}
	}
	
}

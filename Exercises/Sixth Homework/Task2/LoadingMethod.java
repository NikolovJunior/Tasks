package Task2;


public class LoadingMethod {

	public static void main(String[] args) {
		GSM mobileOne = new GSM(null , false , null , 0.0f , null , null);
		GSM mobileTwo = new GSM(null , false , null , 0.0f , null , null);
		Call callOne = new Call(0.0f,null,null,0.0f);
		Call callTwo = new Call(0.0f,null,null,0.0f);
		
		callOne.priceForAMinute = 0.30f;
		callOne.duration = 8.0f;
		callOne.receiver = "0811111111";
		callOne.caller = "0822222222";
		
		callTwo.priceForAMinute = 0.50f;
		callTwo.duration = 10.0f;
		callTwo.receiver = "0866666666";
		callTwo.caller = "0877777777";
		
		mobileOne.model = "Sony";
		mobileOne.simMobileNumber = "0899999911";
		mobileOne.hasSimCard = true;
		mobileOne.outgoingCallsDuration = 4.0f;
		mobileOne.lastOutGoingCall = "3.0";
		mobileOne.lastIncomingCall = "2.0";
		
		mobileTwo.model = "Samsung";
		mobileTwo.simMobileNumber = "0896666933";
		mobileTwo.hasSimCard = true;
		mobileTwo.outgoingCallsDuration = 2.0f;
		mobileTwo.lastOutGoingCall = "5.0";
		mobileTwo.lastIncomingCall = "7.0";
		
		System.out.println(mobileOne.insertSimCard());
		System.out.println(mobileTwo.insertSimCard());
		System.out.println(mobileOne.removeSimCard());
		System.out.println(mobileTwo.removeSimCard());
		
		mobileOne.call(callOne.receiver,8.0f);
		mobileOne.call(callTwo.receiver,4.0f);
		
		System.out.println(mobileOne.getSumForCall());
		System.out.println(mobileTwo.getSumForCall());
		
		mobileOne.printInfoForLastIncomingCall();
		mobileOne.printInfoForLastOutGoingCall();
		mobileTwo.printInfoForLastIncomingCall();
		mobileTwo.printInfoForLastOutGoingCall();
		
	}

}

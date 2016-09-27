package Task2;

public class GSM {

	String model;
	boolean hasSimCard;
	String simMobileNumber;
	float outgoingCallsDuration;
	String lastIncomingCall;
	String lastOutGoingCall;
	// float bill;
	Call person;

	GSM(String model, boolean hasSimCard, String simMobileNumber,
			float outgoingCallsDuration, String lastIncomingCall,
			String lastOutGoingCall) {
		if (model != null && !model.equals("")) {
			this.model = model;
		}
		if (simMobileNumber != null && !simMobileNumber.equals("")
				&& simMobileNumber.length() == 10) {
			String[] numbers = simMobileNumber.split("");
			if (numbers[1].equals("0") && numbers[2].equals("8")) {
				this.simMobileNumber = simMobileNumber;
			}
		}
		this.hasSimCard = hasSimCard;
		if (outgoingCallsDuration > 0.1f) {
			this.outgoingCallsDuration = outgoingCallsDuration;
		}
		if (lastIncomingCall != null && !lastIncomingCall.equals("")) {
			this.lastIncomingCall = lastIncomingCall;
		}
		if (lastOutGoingCall != null && !lastOutGoingCall.equals("")) {
			this.lastOutGoingCall = lastOutGoingCall;
		}
	}

	boolean insertSimCard() {
		if (simMobileNumber.charAt(0) == '0'
				&& simMobileNumber.charAt(1) == '8'
				&& simMobileNumber.length() == 10) {
			this.hasSimCard = true;
			return true;
		} else {
			return false;
		}
	}

	boolean removeSimCard() {
		String[] digits = simMobileNumber.split("");
		if (simMobileNumber != null && !simMobileNumber.equals("")
				&& digits[0].equals("0") && digits[1].equals("8")
				&& digits.length == 10) {
			return true;
		} else {
			this.hasSimCard = false;
			return false;
		}
	}

	void call(String receiver, float duration) {
		if (person.caller.equals(receiver)) {
			System.out.println("You cant call to yourself!");
		}
		if (duration > 0.0f) {
			this.person.duration = duration;
			System.out.println("Duration : " + this.person.duration);
		}
		// String[] digits = receiver.split("");
		// String[] digitsTwo = person.receiver.split("");
		if (!person.caller.equals(receiver)) {
			if (receiver.charAt(0) == '0' && receiver.charAt(1) == '8'
					&& receiver.length() == 10
					&& person.caller.charAt(0) == '0'
					&& person.caller.charAt(1) == '8'
					&& person.caller.length() == 10) {
				this.lastIncomingCall = receiver;
				this.lastOutGoingCall = person.caller;
				this.outgoingCallsDuration += duration;
				System.out.println("This phone numbers have sim cards.");
			} else {
				System.out.println("This phone numbers dont have sim cards.");
			}
		} else {
			System.out.println("This numbers are equal.");
		}
	}

	float getSumForCall() {
		System.out.print("Your bill is: ");
		return this.outgoingCallsDuration * this.person.priceForAMinute;
	}
	
	void printInfoForLastIncomingCall(){
		if(lastIncomingCall != null && !lastIncomingCall.equals("")){
			System.out.println("Last incoming call: " + lastIncomingCall);
		}
	}
	void printInfoForLastOutGoingCall(){
		if(lastIncomingCall != null && !lastIncomingCall.equals("")){
			System.out.println("Last outgoing call: " + lastOutGoingCall);
		}
	}

}

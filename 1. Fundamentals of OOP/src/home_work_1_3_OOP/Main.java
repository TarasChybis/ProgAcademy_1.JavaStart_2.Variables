//Create a class 'Phone' (Phone) one of properties should be its number.
//Create a 'Network' class (mobile operator network). The Phone class should describe the following methods:
//- Registration in the mobile operator's network;
//- A method that implements an outgoing call. This method takes one parameter (describing the mobile phone number). The logic of this method is as follows: if the current phone has not been registered in the network, then terminate the method with a message about it. If the current phone has been registered and the network also has a phone to which the call is being made, then call the incoming call method on that phone. If the phone to which you are making a call is not registered in the network, then terminate the method with a message about it.
//- The method that implements the incoming call. It accepts a parameter in the form of a number from which a call was made to the current one. Display a message like a number such and such is calling you.

package home_work_1_3_OOP;

public class Main {

	public static void main(String[] args) {
		
		Network network = new Network();
		
		Phone ph1 = new Phone("1");
		Phone ph2 = new Phone("2");
		Phone ph3 = new Phone("3");
		
		ph1.registerInNetwork(network);
		ph3.registerInNetwork(network);
		
		ph1.outgoingCall("2");
		ph1.outgoingCall(ph3.getNumber());
		ph2.outgoingCall("3");
	}
}
package home_work_1_3_OOP;

public class Phone {

	private String number;
	private Network network;

	public Phone(String number) {
		this.number = number;
	}

	public Phone() {
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Network getNetwork() {
		return network;
	}

	public void setNetwork(Network network) {
		this.network = network;
	}

	public void registerInNetwork(Network nwk) {
		this.setNetwork(nwk);
		nwk.registerPhone(this);
	}

	public void outgoingCall(String outgoingNum) {
		
		if (network != null && network.searchPhone(number) != null) {
			if (network.searchPhone(outgoingNum) != null) {
				Phone outcome = network.searchPhone(outgoingNum);
				outcome.incomingCall(number);
			} else {
				System.out.println("This number is not registered in the network");
			}
		} else {
			System.out.println("Your number is not registered in the network");
		}
	}

	public void incomingCall(String num) {
		System.out.println("Incoming call: " + num);
	}

	public String toString() {
		return "Phone [number=" + number + ", network=" + network + "]";
	}
}
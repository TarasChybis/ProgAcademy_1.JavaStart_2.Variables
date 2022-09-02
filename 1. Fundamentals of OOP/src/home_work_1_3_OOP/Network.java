package home_work_1_3_OOP;

import java.util.Arrays;

public class Network {

	private Phone[] phones = new Phone[10];
	
	public Network(Phone[] phones) {
		this.phones = phones;
	}

	public Network() {
	}

	public Phone[] getPhones() {
		return phones;
	}

	public void setPhones(Phone[] phones) {
		this.phones = phones;
	}

	public void registerPhone(Phone phone) {
		if (this.searchPhone(phone.getNumber()) == null) {
			for (int i = 0; i < phones.length; i++) {
				if (this.phones[i] == null) {
					this.phones[i] = phone;
					break;
				}
			}
		}
	}

	public Phone searchPhone(String number) {
		for (int i = 0; i < phones.length; i++) {
			if (this.phones[i] != null && this.phones[i].getNumber().equals(number)) {
				return this.phones[i];
			}
		}
		return null;
	}


	public String toString() {
		return "Network [phones=" + Arrays.toString(phones) + "]";
	}	
}
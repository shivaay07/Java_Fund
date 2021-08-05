package com.shivam.phone_assignment;

public class IPhone extends Phone implements Ringable {

	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ring() {
		getVersionNumber();
//		System.out.println("I Phone" + super.getVersionNumber() + "says zing");
		return "I Phone" + getVersionNumber() + getRingTone();
	}

	@Override
	public String unlock() {
		// TODO Auto-generated method stub
		return "Unlocking via facial recognition";
	}

	@Override
	public void displayInfo() {
		System.out.println("I Phone " + getVersionNumber() + " from " + getCarrier());

	}

}

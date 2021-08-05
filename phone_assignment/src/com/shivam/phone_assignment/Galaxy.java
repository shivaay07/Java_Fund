package com.shivam.phone_assignment;

public class Galaxy extends Phone implements Ringable {

	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ring() {
		getVersionNumber();
//		System.out.println("I Phone" + super.getVersionNumber() + "says zing");
		return "Galaxy" + getVersionNumber() + getRingTone();
	}

	@Override
	public String unlock() {
		// TODO Auto-generated method stub
		return "Unlocking via finger Prints";
	}

	@Override
	public void displayInfo() {
		System.out.println("Galaxy " + getVersionNumber() + getCarrier());

	}

}

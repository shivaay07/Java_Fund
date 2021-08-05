package com.shivam.phone_assignment;

public abstract class Phone {
//	 constructor
	
	
	private String versionNumber;
	private int batteryPercentage;
	private String carrier;
	private String ringTone;

// constructor method
	
	
	public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		this.versionNumber = versionNumber;
		this.batteryPercentage = batteryPercentage;
		this.carrier = carrier;
		this.ringTone = ringTone;
	}

// abstract method. This method will be implemented by the subclasses
	
	public abstract void displayInfo();
	
	
//	Getter and Setter

	/**
	 * @return the versionNumber
	 */
	public String getVersionNumber() {
		return versionNumber;
	}

	/**
	 * @param versionNumber the versionNumber to set
	 */
	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}

	/**
	 * @return the batteryPercentage
	 */
	public int getBatteryPercentage() {
		return batteryPercentage;
	}

	/**
	 * @param batteryPercentage the batteryPercentage to set
	 */
	public void setBatteryPercentage(int batteryPercentage) {
		this.batteryPercentage = batteryPercentage;
	}

	/**
	 * @return the carrier
	 */
	public String getCarrier() {
		return carrier;
	}

	/**
	 * @param carrier the carrier to set
	 */
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	/**
	 * @return the ringTone
	 */
	public String getRingTone() {
		return ringTone;
	}

	/**
	 * @param ringTone the ringTone to set
	 */
	public void setRingTone(String ringTone) {
		this.ringTone = ringTone;
	}
	

	
	
}

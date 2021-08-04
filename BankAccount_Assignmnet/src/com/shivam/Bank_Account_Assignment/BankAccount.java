package com.shivam.Bank_Account_Assignment;
import java.util.Random;

public class BankAccount {
	
//	class members
	private double checkingBalance;
	private double savingBalance;
	private String accountType;
	private String accountNumber;
	
	//	static class members
	private static int numberOfAccounts = 0;
	private static double totalAmountOfMoney =0;
	
//	Making an instance of class Random
	
	
	/** 
	 * @return the accountType
	 */
	public String getAccountType() {
		return accountType;
	}

	/**
	 * @param accountType the accountType to set
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	
	

	
//	constructor method
	public BankAccount() {
		this.checkingBalance = checkingBalance;
		this.savingBalance = savingBalance;
		this.accountNumber = createAccountNumber();
		numberOfAccounts++;
	}
	
//	Auto-generated constructor stub
	
//	public BankAccount(double checkingBalance, double savingBalance) {
//		super();
//		this.checkingBalance = checkingBalance;
//		this.savingBalance = savingBalance;
//		numberOfAccounts++;
//	}

//	getters and setters

	/**
	 * @return the checkingBalance
	 */
	Random rand = new Random();
	
	private String createAccountNumber() {
		
		String accountStr = "";
		String accountChars ="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		
		for(int i =0; i < 11; i++) {
			accountStr += String.valueOf(accountChars.charAt(rand.nextInt(36)));
		}
		
		System.out.println(accountStr);
		return accountStr;
	}
	
	
	
	
	
	 public double getCheckingBalance() {
		return checkingBalance;
	}
	
	
	/**
	 * @param checkingBalance the checkingBalance to set
	 */
//	public void setCheckingBalance(double checkingBalance) {
//		this.checkingBalance = checkingBalance;
//		totalAmountOfMoney++;
//	}
	
	
	/**
	 * @return the savingBalance
	 */
	public double getSavingBalance() {
		return savingBalance;
	}
	
	
	/**
	 * @param savingBalance the savingBalance to set
	 */
	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
		totalAmountOfMoney++;
	}
	
//	method to deposit money either-or checking,saving
	
	public void depositMoney(String bankAccount, double amount) {
		if(bankAccount == "checking") {
			checkingBalance += amount;
			totalAmountOfMoney = checkingBalance;
//			getCheckingBalance();
//			totalAmountOfMoney = checkingBalance;
//			System.out.println("your toatal money in checking :" + totalAmountOfMoney);
		}
		else if (bankAccount == "saving") {
			savingBalance += amount;
			totalAmountOfMoney = savingBalance;
//			getSavingBalance();
//			totalAmountOfMoney = savingBalance;
//			System.out.println("your toatal money in saving :" + totalAmountOfMoney);
		}
	
//		return totalAmountOfMoney;
	}
	
// method to withdraw money either-or checking,saving
	
	
	public void withdraw(String bankAccount, double amount) {
		if (totalAmountOfMoney > 0.0) {
			if(bankAccount == "checking") {
				checkingBalance -= amount;
				totalAmountOfMoney = checkingBalance;
	//			getCheckingBalance();
	//			totalAmountOfMoney = checkingBalance;
			}
			else if (bankAccount == "saving") {
				savingBalance -= amount;
				totalAmountOfMoney = savingBalance;
	//			getSavingBalance();
	//			totalAmountOfMoney = savingBalance;
			}
//		System.out.println("your total money is :" + totalAmountOfMoney);
//		return totalAmountOfMoney;
		}
		else {
			System.out.println("Fund are Insufficient");
		}
		}
	
	public double getTotalMoney(String bankAccount) {
		if (bankAccount == "checking") {
			totalAmountOfMoney = getCheckingBalance();
		}
		else if (bankAccount == "saving") {
			totalAmountOfMoney = getSavingBalance();
		}
		
		return totalAmountOfMoney;
	}
}

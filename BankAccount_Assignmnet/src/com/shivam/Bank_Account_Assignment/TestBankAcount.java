package com.shivam.Bank_Account_Assignment;

public class TestBankAcount {

	public TestBankAcount() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount();
//		double moneyResult = account1.getTotalMoney("checking");
//		System.out.println(moneyResult);
		
//		withdraw money from checking account
		System.out.println("This is showing the checking withdrawn print");
		account1.withdraw("checking", 100);
		
		
		
//		deposit money to checking and saving account
		
		System.out.println("This is showing the checking depositing print");
		account1.depositMoney("checking", 120);
		account1.depositMoney("saving", 150);
		
		
		double checkResult = account1.getCheckingBalance();
		double savingResult = account1.getSavingBalance();
		
		System.out.println(checkResult);
		System.out.println(savingResult);
		
//		withdrawing money from checking and saving account
		
		account1.withdraw("saving", 40);
		
		
//		get total money
		System.out.println("This is showing the total money");
		
		double totalResult= account1.getTotalMoney("saving");
		System.out.println(totalResult);
		
		
		
		
	}
	

}

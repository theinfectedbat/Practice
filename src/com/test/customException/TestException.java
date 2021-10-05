package com.test.customException;

public class TestException {
	
	 public static void main(String args[]) {
	        Account acct = new Account();
	        System.out.println("Current balance : " + acct.balance());
	        System.out.println("Withdrawing $200");
	        acct.withdraw(200);
	        System.out.println("Current balance : " + acct.balance());
	        acct.withdraw(3500);
	 
	    }

}

package com.qa.account;

import java.util.HashMap;

public class Service {
	
	private HashMap<Integer,Account> accountMap;
	
	public Service() {
		accountMap=new HashMap<Integer,Account>();
	}
	public void addAccount(Account account) {
		
		if(!accountMap.containsKey(account.getAccountNumber())) {
			accountMap.put((int)account.getAccountNumber(),account);
		}
		else{
			System.out.println("Account number already exists");
		}
		
	}
	public void retrieveAccount(int accNum) {
		if(accountMap.containsKey(accNum)) {
			System.out.println(accountMap.get(accNum).printAccount());
		}
		else {
			System.out.println("Account does not exist");
		}
	}
	
	public HashMap<Integer,Account> getAccountMap() {
		return this.accountMap;
	}

}

package com.qa.account;

public class AccountManager {
	
	public static void main(String[] args) {
		Service service = new Service();
		Account Ryan = new Account("Ryan","Prince",1);
		service.addAccount(Ryan);
		service.retrieveAccount(1);
	}
	
}

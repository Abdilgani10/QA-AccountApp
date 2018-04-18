package com.qa.account;

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AccountManager {
	
	public static void main(String[] args) {
		Service service = new Service();
		Account Ryan = new Account("Ryan","Prince",1);
		Account Bryan = new Account("Bryan","Price",2);
		service.addAccount(Ryan);
		service.addAccount(Bryan);
		service.retrieveAccount(1);
		service.retrieveAccount(4);
		accountsToJSON(service);
		
	
	}
	
	private static void accountsToJSON(Service service){
		String json = "";
		
	
		/*try {
			json = new ObjectMapper().writeValueAsString(service.getAccountMap());
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		System.out.println(json);*/
		
		Iterator <HashMap.Entry<Integer, Account>>it=service.getAccountMap().entrySet().iterator();
		while(it.hasNext()) {
			HashMap.Entry <Integer, Account> account=it.next();
			try {
				json += new ObjectMapper().writeValueAsString(account.getValue());
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println(json);
		
	}
	
	
}



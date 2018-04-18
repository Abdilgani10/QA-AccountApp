package com.qa.account;

import static org.junit.Assert.*;
import com.qa.account.*;

import org.junit.Test;

	public class test {
	Service service = new Service();
	Account Ryan = new Account("Ryan","Prince",1);
	Account Bryan = new Account("Bryan","Prince",1);
	
	@Test
	public void getAccountNumbertest() {
		assertEquals(1,Ryan.getAccountNumber());
	}
	
	//test to see that the same accountnumber cannot be added twice
	@Test
	public void noDuplicatetest() {
		service.addAccount(Ryan);
		service.addAccount(Ryan);
		service.addAccount(Bryan);
		assertEquals(1,service.getAccountMap().size());
	}

}

package com.qa.account;

import static org.junit.Assert.*;
import com.qa.account.*;

import org.junit.Test;

	public class test {
	Service service = new Service();
	Account Ryan = new Account("Ryan","Prince",1);
	
	@Test
	public void getAccountNumbertest() {
		assertEquals(1,Ryan.getAccountNumber());
	}

}

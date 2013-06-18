package com.qsoft.unittest;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;

import com.qsoft.BankAccount;
import com.qsoft.BankAccountDTO;
import com.qsoft.BankAccountDao;

public class TestBankAccount {
	private BankAccount bankAccount;
	private BankAccountDao mockDAO;

	@Before
	public void setUp() {
		bankAccount = new BankAccount();
		mockDAO = mock(BankAccountDao.class);
		bankAccount.setDao(mockDAO);
	}

	@Test
	public void canOpenBankAccount() {

		BankAccountDTO account = bankAccount.openAccount("1234556");
		assertEquals(0, account.getBalance());
		assertEquals("1234556", account.getAccountNumber());
	}

	@Test
	public void openAccountSavesNewAccountToDB() {

		BankAccountDTO account = bankAccount.openAccount("1234556");
		// assert raang BankAccount.openAccount se goi mockDao.save(account)
		verify(mockDAO).save(account);
		// BankAccountDao.save("123");
	}
}

package com.qsoft;

public class BankAccount {
	private BankAccountDao bankDAO;

	public BankAccountDTO openAccount(String accountNumber) {
		BankAccountDTO bankAccountDTO = new BankAccountDTO();
		bankAccountDTO.setAccountNumber(accountNumber);
		bankDAO.save(bankAccountDTO);
		return bankAccountDTO;
	}

	public void setDao(BankAccountDao bankDAO) {
		this.bankDAO = bankDAO;
	}

}

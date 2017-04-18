package model;

import java.util.ArrayList;

import controler.CustomerManager;

public class DaoBankAcc {

	private ArrayList<BankAcc> listAcc = new ArrayList<BankAcc>();
	
	public DaoBankAcc() {
}

	public void addBankAccount(Customer customer, BankAcc bankAcc){
			bankAcc.add(bankAcc);
	}
	
	public BankAcc findBankAccound(long accoundNumber){
		ArrayList<Customer> customerList = daoBankAcc.getListCustomers();
		for(Customer customer:customerList){
			ArrayList<BankAcc> bankAccList = customer.getBankAccList();
			for(BankAcc bankAcc:bankAccList){
				if(bankAcc.getAccoundNumber()==accoundNumber)
				{
					return bankAcc;
				}
			}
		}
		return null;
	}

	private ArrayList<Customer> getListCustomers() {
		return getListCustomers();
	}

	public void transferFunds(BankAcc from, BankAcc to, int amount){
		if(from.getBalance() >= amount){
			from.withdraw(amount);
			to.deposit(amount);
		}
		else System.out.println("Za ma³o dostêpnych œrodków.");
	}
}

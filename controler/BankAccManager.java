package controler;

import java.util.ArrayList;

import model.BankAcc;
import model.Customer;
import controler.CustomerManager;

public class BankAccManager {
	
	private CustomerManager customerManager;
	
	public BankAccManager(CustomerManager customerManager) {
		this.customerManager = customerManager;	
	}

	public BankAcc addBankAccount(Customer customer, long balance, long accountNumber) {
		BankAcc bankAcc = new BankAcc(balance, accountNumber);
		return bankAcc;
	}
	
	public BankAcc findBankAccound(long accoundNumber){
		ArrayList<Customer> customerList = customerManager.getListCustomers();
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
	
	public void transferFunds(BankAcc from, BankAcc to, int amount){
		if(from.getBalance() >= amount){
			from.withdraw(amount);
			to.deposit(amount);
		}
		else System.out.println("Za ma³o dostêpnych œrodków.");
	}
}

package model;

public class BankAcc {
	
	private long balance;
	private long accoundNumber;
	
	public BankAcc(long balanceRef, long accoundNumberRef){
		
		balance = balanceRef;
		accoundNumber = accoundNumberRef;
	}
	
	public void deposit(int amount){
		balance += amount;
	}
	
	public void withdraw(int amount){
		balance -= amount;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public long getAccoundNumber() {
		return accoundNumber;
	}

	public void setAccoundNumber(long accoundNumber) {
		this.accoundNumber = accoundNumber;
	}
	
	public String toString(){
		return  balance +" EUR "+ ", "+ "Accound Number: "+accoundNumber;
	}
	
}

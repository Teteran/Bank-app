package model;

import java.util.ArrayList;


public class Customer {

	private long userId;
	private String name;
	private String surname;
	private String password;
	private ArrayList<Adress> adress = new ArrayList<Adress>();
	private ArrayList<BankAcc> bankAcc = new ArrayList<BankAcc>();
	
	
	public Customer(String nameRef, String surnameRef, String passwordRef, long userIdRef, Adress adressRef){
		
		name = nameRef;
		surname = surnameRef;
		password = passwordRef;
		userId = userIdRef;
		adress.add(adressRef);
	}
	
	
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<Adress> getAdress() {
		return adress;
	}

	public void setAdress(ArrayList<Adress> adress) {
		this.adress = adress;
	}

	public ArrayList<BankAcc> getBankAccList() {
		return bankAcc;
	}

	public void setBankAcc(ArrayList<BankAcc> bankAcc) {
		this.bankAcc = bankAcc;
	}
	
	public void addBankAcc(BankAcc bankAccRef){
		bankAcc.add(bankAccRef);
	}
	
	public void createCustomer(Customer nameRef){
		
	}
	@Override
	public String toString() {
		return "Customer [userId=" + userId + ", name=" + name + ", surname=" + surname + ", password=" + password
				+ ", adress=" + adress + ", bankAcc=" + bankAcc + "]";
	}
}

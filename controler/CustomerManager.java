package controler;

import java.util.ArrayList;

import model.Adress;
import model.Customer;

public class CustomerManager {
	
	private ArrayList<Customer> listCustomers = new ArrayList<Customer>();
	

	public Customer createCustomer(String nameRef, String surnameRef, String passwordRef, long userIdRef,
			String streetRef, String postCodeRef, String cityRef)
	{
		Adress adress = new Adress(streetRef, postCodeRef, cityRef);
		Customer customer = new Customer(nameRef, surnameRef, passwordRef, userIdRef, adress);
		listCustomers.add(customer);
		return customer;
	}
	
	public Customer findCustomerByUserId(long userId){
		for(Customer customer:listCustomers)
		if(customer.getUserId() == userId){ 
			return customer;
		}
		return null;
	}
	
	public void deleteCustomerByUserId(Customer customer, long userId){
		for(int i=0; i<=listCustomers.size() ;i++){
			if(customer.getUserId() == userId){
			listCustomers.remove(customer);}
		}
	}
	
	
	public ArrayList<Customer> getListCustomers() {
		return listCustomers;
	}

}
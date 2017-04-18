package model;

import java.util.ArrayList;
import model.Customer;

public class DaoCustomer {

	private ArrayList<Customer> listCustomers = new ArrayList<Customer>();
	
	public DaoCustomer(){}
	
	public Customer createCustomer(Customer customer)
	{
		listCustomers.add(customer);
		return customer;
	}
	
	public ArrayList<Customer> getListCustomers() {
		return listCustomers;
	}
	
	public void deleteCustomerByUserId(Customer customer, long userId){
		for(int i=0; i<=listCustomers.size() ;i++){
			if(customer.getUserId() == userId){
			listCustomers.remove(customer);}
		}
	}
	
	public Customer findCustomerByUserId(long userId){
		for(Customer customer:listCustomers)
		if(customer.getUserId() == userId){ 
			return customer;
		}
		return null;
	}
	
}
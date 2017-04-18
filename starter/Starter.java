package starter;


import java.util.Scanner;

import controler.BankAccManager;
import controler.CustomerManager;
import model.BankAcc;
import model.Customer;
import model.DaoBankAcc;
import model.DaoCustomer;

public class Starter {

	public static void main(String[] args) {
		
		new Starter(args);

	}

	public Starter(String []args){
		
		CustomerManager customerManager = new CustomerManager();
		DaoCustomer daoCustomer = new DaoCustomer();
		
		Customer customer = customerManager.createCustomer("Adam", "Jasiek", "Haslo", 94110152689L,
				"Szafrana", "65-195", "Zielona Góra");
		System.out.println(customer);
	
		/*customerManager.createCustomer("Malwina", "Kupka", "Haslaniema", 884110152689L,
				"kilelecka", "68-285", "Jelenia Góra");*/
	
	//	BankAccManager bankAccManager = new BankAccManager(customerManager);
		//DaoBankAcc daoBankAcc = new DaoBankAcc(daoBankAcc);
	//	daoBankAcc.addBankAccount(customer, 100L, 303030300L); //obiekt customer aby wiedzial komu ma przypisac nr i stan konta
	//	daoBankAcc.addBankAccount(customer, 50L, 202020202L);
		
	//	System.out.println(daoBankAcc.findBankAccound(303030300L));
	//	System.out.println(daoBankAcc.findBankAccound(202020202L));
		
		
	//	daoBankAcc.transferFunds(daoBankAcc.findBankAccound(303030300L), daoBankAcc.findBankAccound(202020202L), 100);
	//	System.out.println(daoBankAcc.findBankAccound(202020202L));
		
	//	System.out.println(daoCustomer.findCustomerByUserId(94110152689L));
		
		
		/*try (Scanner scanner = new Scanner(System.in))
			{
			long input = scanner.nextLong();
			
			System.out.println(customerManager.findCustomerByUserId(input));
			customerManager.deleteCustomerByUserId(customer,94110152689L);
			System.out.println(customerManager.findCustomerByUserId(94110152689L));
			}
		catch (Exception e)
		{
			System.out.println("Eror. Enter userId.");
		}*/
	}
}

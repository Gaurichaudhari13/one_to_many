package com.jsp.one_to_many_;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("gauri");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		Person person=new Person();
		person.setName("abc");
		person.setEmail("abc@mail.com");
		person.setCno(9851203657l);
		person.setGender("female");
		
		
		
		
		BankAccount bankAccount1=new BankAccount();
		bankAccount1.setBank_name("hdfc");
		bankAccount1.setAcc_no(9854123654l);
		bankAccount1.setIfsc_code("hdfc45168");
		
		
		BankAccount bankAccount2=new BankAccount();
		bankAccount2.setBank_name("hdfc");
		bankAccount2.setAcc_no(9854123654l);
		bankAccount2.setIfsc_code("hdfc45168");
		
		BankAccount bankAccount3=new BankAccount();
		bankAccount3.setBank_name("hdfc");
		bankAccount3.setAcc_no(9854123654l);
		bankAccount3.setIfsc_code("hdfc45168");
		
		
		
		ArrayList<BankAccount>accounts=new ArrayList<BankAccount>();
		accounts.add(bankAccount3);
		accounts.add(bankAccount2);
	    accounts.add(bankAccount1);
	    
	    //set person with multiple bank accounts
	    person.setAccounts(accounts);
		
	    
	    entityTransaction.begin();
	    entityManager.persist(person);
	    entityManager.persist(bankAccount1);
	    entityManager.persist(bankAccount2);
	    entityManager.persist(bankAccount3);
	    entityTransaction.commit();
		
		

	}

}

package com.jsp.one_to_many;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HospitalDriver {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("gauri");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		Branch branch=new Branch();
		branch.setBranch_name("abc");
		branch.setBranch_add("mumbai");
		branch.setBranch_cno(9510236547l);
		
		
		Hospital hospital1=new Hospital();
		hospital1.setHospital_name("xyz");
		hospital1.setAddress("mumbai");
		

		
		Hospital hospital2=new Hospital();
		hospital2.setHospital_name("pqr");
		hospital2.setAddress("vashi");
		

		
		Hospital hospital3=new Hospital();
		hospital3.setHospital_name("mno");
		hospital3.setAddress("panvel");
		
		ArrayList<Hospital> hospitals=new ArrayList<Hospital>();
		hospitals.add(hospital1);
		hospitals.add(hospital2);
		hospitals.add(hospital3);
		
		branch.setHospitals(hospitals);
		
	
		entityTransaction.begin();
		entityManager.persist(branch);
		entityManager.persist(hospital1);
		entityManager.persist(hospital2);
		entityManager.persist(hospital3);
		entityTransaction.commit();
		
		
		

	}

}

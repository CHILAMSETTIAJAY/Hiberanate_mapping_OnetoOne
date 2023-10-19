package com.controller;

import com.dao.Persondao;
import com.dto.Pancard;
import com.dto.Person;

public class InsertDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person();
		person.setPersonname("Smara Reddy");
		person.setPersonmobile(987456321l);
		person.setPersonaddress("Chaithanyapuri");
		
		
		Pancard pancard = new Pancard();
		pancard.setPannumber("34JDK56");
		pancard.setPanauthoraty("Govt of India");
		
		person.setPancard(pancard);
		
		Persondao persondao = new Persondao();
		persondao.insertDetails(person);
		System.out.println("Data Inserted");
		

	}

}

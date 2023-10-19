package com.controller;

import com.dao.Persondao;
import com.dto.Pancard;
import com.dto.Person;

public class UpdateDetails {

	public static void main(String[] args) {
		Person person = new Person();
		person.setPersonname("Ajay");
		person.setPersonmobile(123456789l);
		person.setPersonaddress("Chaithanyapuri");
		
		
		Pancard pancard = new Pancard();
		pancard.setPannumber("42JDK56");
		pancard.setPanauthoraty("Govt of India");
		
		person.setPancard(pancard);
		
		Persondao persondao = new Persondao();
		persondao.updateDetails(1,person);
		System.out.println("Data updated");

	}

}

package com.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String personname;
	private Long personmobile;
	private String personaddress;
	
	@OneToOne
	Pancard pancard;
	@Override
	public String toString() {
		return "Person [id=" + id + ", personname=" + personname + ", personmobile=" + personmobile + ", personaddress="
				+ personaddress + ", pancard=" + pancard + "]";
	}

	public Pancard getPancard() {
		return pancard;
	}

	public void setPancard(Pancard pancard) {
		this.pancard = pancard;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPersonname() {
		return personname;
	}
	public void setPersonname(String personname) {
		this.personname = personname;
	}
	public Long getPersonmobile() {
		return personmobile;
	}
	public void setPersonmobile(Long personmobile) {
		this.personmobile = personmobile;
	}
	public String getPersonaddress() {
		return personaddress;
	}
	public void setPersonaddress(String personaddress) {
		this.personaddress = personaddress;
	}
	

}

package com.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pancard {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int panid;
	private String pannumber;
	private String panauthoraty;
	public int getPanid() {
		return panid;
	}
	public void setPanid(int panid) {
		this.panid = panid;
	}
	public String getPannumber() {
		return pannumber;
	}
	public void setPannumber(String pannumber) {
		this.pannumber = pannumber;
	}
	public String getPanauthoraty() {
		return panauthoraty;
	}
	public void setPanauthoraty(String panauthoraty) {
		this.panauthoraty = panauthoraty;
	}
	@Override
	public String toString() {
		return "Pancard [panid=" + panid + ", pannumber=" + pannumber + ", panauthoraty=" + panauthoraty + "]";
	}
	

}

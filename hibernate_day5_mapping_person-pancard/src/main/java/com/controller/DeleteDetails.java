package com.controller;

import com.dao.Persondao;

public class DeleteDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persondao persondao = new Persondao();
		persondao.deleteDetails(2);
		System.out.println("Data Detelted");
	}

}

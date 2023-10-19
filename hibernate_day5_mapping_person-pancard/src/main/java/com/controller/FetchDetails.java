package com.controller;

import com.dao.Persondao;

public class FetchDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persondao persondao = new Persondao();
		
		persondao.fetchDetails(1);
		
		System.out.println("Data Fetched");
	}

}

package com.controller;

import com.dao.Persondao;

public class FetchAllDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persondao persondao = new Persondao();
		persondao.fetchAll();
		System.out.println("All Data Fetched");

	}

}

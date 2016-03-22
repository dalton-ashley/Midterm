package com.cisc181.core;

import java.util.Date;

public class PersonException extends Exception{
	
	private Date DOB;
	private String phone_number;
	
	public PersonException(Date DOB){
		this.DOB = DOB;
		System.out.println("Invalid DOB");
	}
	
	public PersonException(String phone_number){
		this.phone_number = phone_number;
		System.out.println("Invalid Phone Number");
	}
}

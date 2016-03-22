package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void staff_test() {
		ArrayList<Staff> staff = new ArrayList<Staff>();
		
		Staff Jack = new Staff(eTitle.MR);
		Staff Jill = new Staff(eTitle.MRS);
		Staff Joe = new Staff(eTitle.MR);
		Staff Julie = new Staff(eTitle.MS);
		Staff Jim = new Staff(eTitle.MR);
		
		Jack.setSalary(200000);
		Jill.setSalary(100000);
		Joe.setSalary(50000);
		Julie.setSalary(75000);
		Jim.setSalary(150000);
		
		staff.add(Jack);
		staff.add(Jill);
		staff.add(Joe);
		staff.add(Julie);
		staff.add(Jim);
			
		double AverageSalary = 0;
		
		for (Staff s:staff){
			AverageSalary += s.getSalary();
		}
		AverageSalary = AverageSalary/5;
		assertEquals("Average Salary Test", AverageSalary == 115000);
		}
	
	@Test(expected = PersonException.class)
	public void DOBTest() throws PersonException{
		Calendar birthDate = Calendar.getInstance();
		
		birthDate.set(1776,7,4);
		
		Date DOB = birthDate.getTime();	
		Staff Andrew = new Staff(eTitle.MR);
		Andrew.setDOB(DOB);
		Andrew.getDOB();
	}
	
	@Test(expected = PersonException.class)
	public void PhoneTest() throws PersonException{
		Staff Arnold = new Staff(eTitle.MR);
		Arnold.setPhone("(302) 1234-5678");
		Arnold.getPhone();
	}
}

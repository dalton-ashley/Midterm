package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	
	UUID SectionID;
	UUID StudentID;
	UUID EnrollmentID;
	double Grade;
	
	private Enrollment(){
	}
	
	public Enrollment(UUID sectionID, UUID studentID){
		super();
		SectionID = sectionID;
		StudentID = studentID;
		this.EnrollmentID = EnrollmentID;
	}

	public UUID getEnrollmentID() {
		return EnrollmentID;
	}

	public void setEnrollmentID(UUID enrollmentID) {
		EnrollmentID = enrollmentID;
	}

	public double getGrade() {
		return Grade;
	}

	public void setGrade(double grade) {
		Grade = grade;
	}
}

package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	@BeforeClass
	public static void setup() {
		
		ArrayList<Course> course = new ArrayList<Course>();
		
		Course Business = new Course(UUID.randomUUID(), "Business", 3, eMajor.BUSINESS);
		Course Physics = new Course(UUID.randomUUID(), "Physics", 3, eMajor.PHYSICS);
		Course Chemistry = new Course (UUID.randomUUID(), "Chemistry", 3, eMajor.CHEM);
		course.add(Business);
		course.add(Physics);
		course.add(Chemistry);
		
		ArrayList<Semester> semester = new ArrayList<Semester>();
		
		Calendar FallStart = Calendar.getInstance();
		FallStart.set(2015,8,31);
		
		Calendar FallEnd = Calendar.getInstance();
		FallEnd.set(2015,12,18);
		
		Calendar SpringStart = Calendar.getInstance();
		SpringStart.set(2016,2,8);
		
		Calendar SpringEnd = Calendar.getInstance();
		SpringEnd.set(2016,5,21);
		
		Semester Fall = new Semester(UUID.randomUUID(), FallStart.getTime(), FallEnd.getTime());
		Semester Spring = new Semester(UUID.randomUUID(), SpringStart.getTime(), SpringEnd.getTime());
		semester.add(Fall);
		semester.add(Spring);
		
		ArrayList<Section> section = new ArrayList<Section>();
		
		Section Business1 = new Section(Business.getCourseID(), Fall.getSemesterID(), UUID.randomUUID(), 100);
		Section Business2 = new Section(Business.getCourseID(), Spring.getSemesterID(), UUID.randomUUID(), 100);
		Section Physics1 = new Section(Physics.getCourseID(), Fall.getSemesterID(), UUID.randomUUID(), 200);
		Section Physics2 = new Section(Physics.getCourseID(), Spring.getSemesterID(), UUID.randomUUID(), 200);
		Section Chemistry1 = new Section(Chemistry.getCourseID(), Fall.getSemesterID(), UUID.randomUUID(), 300);
		Section Chemistry2 = new Section(Chemistry.getCourseID(), Spring.getSemesterID(), UUID.randomUUID(), 300);
		section.add(Business1);
		section.add(Business2);
		section.add(Physics1);
		section.add(Physics2);
		section.add(Chemistry1);
		section.add(Chemistry2);
		
		ArrayList<Student> student = new ArrayList<Student>();
		
		Calendar DOB1 = Calendar.getInstance();
		DOB1.set(1996,2,4);
		
		Calendar DOB2 = Calendar.getInstance();
		DOB1.set(1996,2,5);
		
		Calendar DOB3 = Calendar.getInstance();
		DOB1.set(1996,2,6);
		
		Calendar DOB4 = Calendar.getInstance();
		DOB1.set(1996,2,7);
		
		Calendar DOB5 = Calendar.getInstance();
		DOB1.set(1996,2,8);
		
		Calendar DOB6 = Calendar.getInstance();
		DOB1.set(1996,2,9);
		
		Calendar DOB7 = Calendar.getInstance();
		DOB1.set(1996,2,10);
		
		Calendar DOB8 = Calendar.getInstance();
		DOB1.set(1996,2,11);
		
		Calendar DOB9 = Calendar.getInstance();
		DOB1.set(1996,2,12);
		
		Calendar DOB10 = Calendar.getInstance();
		DOB1.set(1996,2,13);
		
		Student student1 = new Student("Dalton", "Reed", "Ashley", DOB1.getTime(), eMajor.PHYSICS,
										"123 Alpha Drive","(302) 111-1111", "dashley@udel.edu");
		Student student2 = new Student("Chris", "Reed", "Ashley", DOB2.getTime(), eMajor.NURSING,
										"123 Bravo Drive","(302) 222-2222", "cashley@udel.edu");
		Student student3 = new Student("Mike", "Reed", "Ashley", DOB3.getTime(), eMajor.BUSINESS,
										"123 Charlie Drive","(302) 333-3333", "mashley@udel.edu");
		Student student4 = new Student("Jay", "Reed", "Ashley", DOB4.getTime(), eMajor.COMPSI,
										"123 Delta Drive","(302) 444-4444", "jashley@udel.edu");
		Student student5 = new Student("Tanner", "Reed", "Ashley", DOB5.getTime(), eMajor.CHEM,
										"123 Echo Drive","(302) 555-5555", "tashley@udel.edu");
		Student student6 = new Student("Courtney", "Reed", "Ashley", DOB6.getTime(), eMajor.PHYSICS,
										"123 Foxtrot Drive","(302) 666-6666", "crashley@udel.edu");
		Student student7 = new Student("Merrill", "Reed", "Ashley", DOB7.getTime(), eMajor.NURSING,
										"123 Golf Drive","(302) 777-7777", "mrashley@udel.edu");
		Student student8 = new Student("Dolores", "Reed", "Ashley", DOB8.getTime(), eMajor.BUSINESS,
										"123 Hotel Drive","(302) 888-8888", "drashley@udel.edu");
		Student student9 = new Student("Nick", "Reed", "Ashley", DOB9.getTime(), eMajor.COMPSI,
										"123 India Drive","(302) 999-9999", "nashley@udel.edu");
		Student student10 = new Student("Eddy", "Reed", "Ashley", DOB10.getTime(), eMajor.CHEM,
										"123 Juliett Drive","(302) 123-4567", "eashley@udel.edu");
		student.add(student1);
		student.add(student2);
		student.add(student3);
		student.add(student4);
		student.add(student5);
		student.add(student6);
		student.add(student7);
		student.add(student8);
		student.add(student9);
		student.add(student10);
		
		Enrollment s1Business1 = new Enrollment(Business1.getSectionID(), student1.getStudentID());
		Enrollment s1Business2 = new Enrollment(Business2.getSectionID(), student1.getStudentID());
		Enrollment s1Physics1 = new Enrollment(Physics1.getSectionID(), student1.getStudentID());
		Enrollment s1Physics2 = new Enrollment(Physics2.getSectionID(), student1.getStudentID());
		Enrollment s1Chemistry1 = new Enrollment(Chemistry1.getSectionID(), student1.getStudentID());
		Enrollment s1Chemistry2 = new Enrollment(Chemistry2.getSectionID(), student1.getStudentID());
		s1Business1.setGrade(100);
		s1Business2.setGrade(100);
		s1Physics1.setGrade(100);
		s1Physics2.setGrade(100);
		s1Chemistry1.setGrade(100);
		s1Chemistry2.setGrade(100);
		
		Enrollment s2Business1 = new Enrollment(Business1.getSectionID(), student2.getStudentID());
		Enrollment s2Business2 = new Enrollment(Business2.getSectionID(), student2.getStudentID());
		Enrollment s2Physics1 = new Enrollment(Physics1.getSectionID(), student2.getStudentID());
		Enrollment s2Physics2 = new Enrollment(Physics2.getSectionID(), student2.getStudentID());
		Enrollment s2Chemistry1 = new Enrollment(Chemistry1.getSectionID(), student2.getStudentID());
		Enrollment s2Chemistry2 = new Enrollment(Chemistry2.getSectionID(), student2.getStudentID());
		s2Business1.setGrade(99);
		s2Business2.setGrade(99);
		s2Physics1.setGrade(99);
		s2Physics2.setGrade(99);
		s2Chemistry1.setGrade(99);
		s2Chemistry2.setGrade(99);
		
		Enrollment s3Business1 = new Enrollment(Business1.getSectionID(), student3.getStudentID());
		Enrollment s3Business2 = new Enrollment(Business2.getSectionID(), student3.getStudentID());
		Enrollment s3Physics1 = new Enrollment(Physics1.getSectionID(), student3.getStudentID());
		Enrollment s3Physics2 = new Enrollment(Physics2.getSectionID(), student3.getStudentID());
		Enrollment s3Chemistry1 = new Enrollment(Chemistry1.getSectionID(), student3.getStudentID());
		Enrollment s3Chemistry2 = new Enrollment(Chemistry2.getSectionID(), student3.getStudentID());
		s3Business1.setGrade(98);
		s3Business2.setGrade(98);
		s3Physics1.setGrade(98);
		s3Physics2.setGrade(98);
		s3Chemistry1.setGrade(98);
		s3Chemistry2.setGrade(98);
	
		Enrollment s4Business1 = new Enrollment(Business1.getSectionID(), student4.getStudentID());
		Enrollment s4Business2 = new Enrollment(Business2.getSectionID(), student4.getStudentID());
		Enrollment s4Physics1 = new Enrollment(Physics1.getSectionID(), student4.getStudentID());
		Enrollment s4Physics2 = new Enrollment(Physics2.getSectionID(), student4.getStudentID());
		Enrollment s4Chemistry1 = new Enrollment(Chemistry1.getSectionID(), student4.getStudentID());
		Enrollment s4Chemistry2 = new Enrollment(Chemistry2.getSectionID(), student4.getStudentID());
		s4Business1.setGrade(97);
		s4Business2.setGrade(97);
		s4Physics1.setGrade(97);
		s4Physics2.setGrade(97);
		s4Chemistry1.setGrade(97);
		s4Chemistry2.setGrade(97);
	
		Enrollment s5Business1 = new Enrollment(Business1.getSectionID(), student5.getStudentID());
		Enrollment s5Business2 = new Enrollment(Business2.getSectionID(), student5.getStudentID());
		Enrollment s5Physics1 = new Enrollment(Physics1.getSectionID(), student5.getStudentID());
		Enrollment s5Physics2 = new Enrollment(Physics2.getSectionID(), student5.getStudentID());
		Enrollment s5Chemistry1 = new Enrollment(Chemistry1.getSectionID(), student5.getStudentID());
		Enrollment s5Chemistry2 = new Enrollment(Chemistry2.getSectionID(), student5.getStudentID());
		s5Business1.setGrade(96);
		s5Business2.setGrade(96);
		s5Physics1.setGrade(96);
		s5Physics2.setGrade(96);
		s5Chemistry1.setGrade(96);
		s5Chemistry2.setGrade(96);
		
		Enrollment s6Business1 = new Enrollment(Business1.getSectionID(), student6.getStudentID());
		Enrollment s6Business2 = new Enrollment(Business2.getSectionID(), student6.getStudentID());
		Enrollment s6Physics1 = new Enrollment(Physics1.getSectionID(), student6.getStudentID());
		Enrollment s6Physics2 = new Enrollment(Physics2.getSectionID(), student6.getStudentID());
		Enrollment s6Chemistry1 = new Enrollment(Chemistry1.getSectionID(), student6.getStudentID());
		Enrollment s6Chemistry2 = new Enrollment(Chemistry2.getSectionID(), student6.getStudentID());
		s6Business1.setGrade(95);
		s6Business2.setGrade(95);
		s6Physics1.setGrade(95);
		s6Physics2.setGrade(95);
		s6Chemistry1.setGrade(95);
		s6Chemistry2.setGrade(95);
		
		Enrollment s7Business1 = new Enrollment(Business1.getSectionID(), student7.getStudentID());
		Enrollment s7Business2 = new Enrollment(Business2.getSectionID(), student7.getStudentID());
		Enrollment s7Physics1 = new Enrollment(Physics1.getSectionID(), student7.getStudentID());
		Enrollment s7Physics2 = new Enrollment(Physics2.getSectionID(), student7.getStudentID());
		Enrollment s7Chemistry1 = new Enrollment(Chemistry1.getSectionID(), student7.getStudentID());
		Enrollment s7Chemistry2 = new Enrollment(Chemistry2.getSectionID(), student7.getStudentID());
		s7Business1.setGrade(100);
		s7Business2.setGrade(99);
		s7Physics1.setGrade(98);
		s7Physics2.setGrade(97);
		s7Chemistry1.setGrade(96);
		s7Chemistry2.setGrade(95);
		
		Enrollment s8Business1 = new Enrollment(Business1.getSectionID(), student8.getStudentID());
		Enrollment s8Business2 = new Enrollment(Business2.getSectionID(), student8.getStudentID());
		Enrollment s8Physics1 = new Enrollment(Physics1.getSectionID(), student8.getStudentID());
		Enrollment s8Physics2 = new Enrollment(Physics2.getSectionID(), student8.getStudentID());
		Enrollment s8Chemistry1 = new Enrollment(Chemistry1.getSectionID(), student8.getStudentID());
		Enrollment s8Chemistry2 = new Enrollment(Chemistry2.getSectionID(), student8.getStudentID());
		s8Business1.setGrade(95);
		s8Business2.setGrade(96);
		s8Physics1.setGrade(97);
		s8Physics2.setGrade(98);
		s8Chemistry1.setGrade(99);
		s8Chemistry2.setGrade(100);
		
		Enrollment s9Business1 = new Enrollment(Business1.getSectionID(), student9.getStudentID());
		Enrollment s9Business2 = new Enrollment(Business2.getSectionID(), student9.getStudentID());
		Enrollment s9Physics1 = new Enrollment(Physics1.getSectionID(), student9.getStudentID());
		Enrollment s9Physics2 = new Enrollment(Physics2.getSectionID(), student9.getStudentID());
		Enrollment s9Chemistry1 = new Enrollment(Chemistry1.getSectionID(), student9.getStudentID());
		Enrollment s9Chemistry2 = new Enrollment(Chemistry2.getSectionID(), student9.getStudentID());
		s9Business1.setGrade(97);
		s9Business2.setGrade(98);
		s9Physics1.setGrade(99);
		s9Physics2.setGrade(100);
		s9Chemistry1.setGrade(99);
		s9Chemistry2.setGrade(98);
		
		Enrollment s10Business1 = new Enrollment(Business1.getSectionID(), student10.getStudentID());
		Enrollment s10Business2 = new Enrollment(Business2.getSectionID(), student10.getStudentID());
		Enrollment s10Physics1 = new Enrollment(Physics1.getSectionID(), student10.getStudentID());
		Enrollment s10Physics2 = new Enrollment(Physics2.getSectionID(), student10.getStudentID());
		Enrollment s10Chemistry1 = new Enrollment(Chemistry1.getSectionID(), student10.getStudentID());
		Enrollment s10Chemistry2 = new Enrollment(Chemistry2.getSectionID(), student10.getStudentID());
		s10Business1.setGrade(100);
		s10Business2.setGrade(98);
		s10Physics1.setGrade(96);
		s10Physics2.setGrade(98);
		s10Chemistry1.setGrade(99);
		s10Chemistry2.setGrade(100);
	
		double student1GPA = ((s1Business1.getGrade()+s1Business2.getGrade()+s1Physics1.getGrade()+
								s1Physics2.getGrade()+s1Chemistry1.getGrade()+s1Chemistry2.getGrade())/6)*0+4;
		double student2GPA = ((s2Business1.getGrade()+s2Business2.getGrade()+s2Physics1.getGrade()+
								s2Physics2.getGrade()+s2Chemistry1.getGrade()+s2Chemistry2.getGrade())/6)*0+4;
		double student3GPA = ((s3Business1.getGrade()+s3Business2.getGrade()+s3Physics1.getGrade()+
								s3Physics2.getGrade()+s3Chemistry1.getGrade()+s3Chemistry2.getGrade())/6)*0+4;
		double student4GPA = ((s4Business1.getGrade()+s4Business2.getGrade()+s4Physics1.getGrade()+
								s4Physics2.getGrade()+s4Chemistry1.getGrade()+s4Chemistry2.getGrade())/6)*0+4;
		double student5GPA = ((s5Business1.getGrade()+s5Business2.getGrade()+s5Physics1.getGrade()+
								s5Physics2.getGrade()+s5Chemistry1.getGrade()+s5Chemistry2.getGrade())/6)*0+4;
		double student6GPA = ((s6Business1.getGrade()+s6Business2.getGrade()+s6Physics1.getGrade()+
								s6Physics2.getGrade()+s6Chemistry1.getGrade()+s6Chemistry2.getGrade())/6)*0+4;
		double student7GPA = ((s7Business1.getGrade()+s7Business2.getGrade()+s7Physics1.getGrade()+
								s7Physics2.getGrade()+s7Chemistry1.getGrade()+s7Chemistry2.getGrade())/6)*0+4;
		double student8GPA = ((s8Business1.getGrade()+s8Business2.getGrade()+s8Physics1.getGrade()+
								s8Physics2.getGrade()+s8Chemistry1.getGrade()+s8Chemistry2.getGrade())/6)*0+4;
		double student9GPA = ((s9Business1.getGrade()+s9Business2.getGrade()+s9Physics1.getGrade()+
								s9Physics2.getGrade()+s9Chemistry1.getGrade()+s9Chemistry2.getGrade())/6)*0+4;
		double student10GPA = ((s10Business1.getGrade()+s10Business2.getGrade()+s10Physics1.getGrade()+
								s10Physics2.getGrade()+s10Chemistry1.getGrade()+s10Chemistry2.getGrade())/6)*0+4;
		
		assertEquals("Student 1 GPA", student1GPA == 4.0);
		assertEquals("Student 2 GPA", student2GPA == 4.0);
		assertEquals("Student 3 GPA", student3GPA == 4.0);
		assertEquals("Student 4 GPA", student4GPA == 4.0);
		assertEquals("Student 5 GPA", student5GPA == 4.0);
		assertEquals("Student 6 GPA", student6GPA == 4.0);
		assertEquals("Student 7 GPA", student7GPA == 4.0);
		assertEquals("Student 8 GPA", student8GPA == 4.0);
		assertEquals("Student 9 GPA", student9GPA == 4.0);
		assertEquals("Student 10 GPA", student10GPA == 4.0);
				
		
		double BusinessAverage = ((s1Business1.getGrade()+s1Business2.getGrade()+
								  s2Business1.getGrade()+s2Business2.getGrade()+
								  s3Business1.getGrade()+s3Business2.getGrade()+
								  s4Business1.getGrade()+s4Business2.getGrade()+
								  s5Business1.getGrade()+s5Business2.getGrade()+
								  s6Business1.getGrade()+s6Business2.getGrade()+
								  s7Business1.getGrade()+s7Business2.getGrade()+
								  s8Business1.getGrade()+s8Business2.getGrade()+
								  s9Business1.getGrade()+s9Business2.getGrade()+
								  s10Business1.getGrade()+s10Business2.getGrade())/20);
		
		double PhysicsAverage = ((s1Physics1.getGrade()+s1Physics2.getGrade()+
								  s2Physics1.getGrade()+s2Physics2.getGrade()+
								  s3Physics1.getGrade()+s3Physics2.getGrade()+
								  s4Physics1.getGrade()+s4Physics2.getGrade()+
								  s5Physics1.getGrade()+s5Physics2.getGrade()+
								  s6Physics1.getGrade()+s6Physics2.getGrade()+
								  s7Physics1.getGrade()+s7Physics2.getGrade()+
								  s8Physics1.getGrade()+s8Physics2.getGrade()+
								  s9Physics1.getGrade()+s9Physics2.getGrade()+
								  s10Physics1.getGrade()+s10Physics2.getGrade())/20);
		
		double ChemistryAverage = ((s1Chemistry1.getGrade()+s1Chemistry2.getGrade()+
									s2Chemistry1.getGrade()+s2Chemistry2.getGrade()+
									s3Chemistry1.getGrade()+s3Chemistry2.getGrade()+
									s4Chemistry1.getGrade()+s4Chemistry2.getGrade()+
									s5Chemistry1.getGrade()+s5Chemistry2.getGrade()+
									s6Chemistry1.getGrade()+s6Chemistry2.getGrade()+
									s7Chemistry1.getGrade()+s7Chemistry2.getGrade()+
									s8Chemistry1.getGrade()+s8Chemistry2.getGrade()+
									s9Chemistry1.getGrade()+s9Chemistry2.getGrade()+
									s10Chemistry1.getGrade()+s10Chemistry2.getGrade())/20);
		
		assertEquals("Business Average", BusinessAverage == 97.65);
		assertEquals("Physics Average", PhysicsAverage == 97.65);
		assertEquals("Chemistry Average", ChemistryAverage == 97.8);
		}

	@Test
	public void ChangeMajor(Student student1) {
		student1.setMajor(eMajor.BUSINESS);
		assertEquals("Major Change", student1.getMajor() == eMajor.BUSINESS);
		
	}
}
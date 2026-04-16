package com.student.application;

import java.util.Comparator;

public class AppMain {

	public static void main(String[] args) {
		System.out.println("**************** Welcome to Student Management System ****************");

		Student s1;
		s1 = new Student("Abhishek", 26, "S-001");
		s1.enrollCourse("JAVA");
		s1.enrollCourse("JAVA");
		s1.enrollCourse("Python");
		
		System.out.println(s1);
		
		Student s2;
		s2 = new Student("Udai", 28, "S-002");
		s2.enrollCourse("Workday Extend");
		s2.enrollCourse("JAVA");
		s2.enrollCourse("JavaScript");
		
		System.out.println(s2);
	}
}

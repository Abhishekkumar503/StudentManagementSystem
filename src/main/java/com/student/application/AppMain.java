package com.student.application;

public class AppMain {

	public static void main(String[] args) {
		System.out.println("**************** Welcome to Student Management System ****************");

		Student s1;
		s1 = new Student("Abhishek", 26, "S-001");
		s1.enrollCourse("JAVA");
		System.out.println(s1);
	}
}

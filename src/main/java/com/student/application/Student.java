package com.student.application;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {

	private String name;
	private int age;
	private String studentId;
	private List<String> courses;

	public Student(String name, int age, String studentId) {
		super();
		if (validAge(age) && validName(name) && validStudentId(studentId)) {
			this.name = name;
			this.age = age;
			this.studentId = studentId;
		}
		courses = new ArrayList<String>();
	}

	public void enrollCourse(String course) {
		if (validCourse(course))
			if (!courses.contains(course) && validCourse(course)) {
				courses.add(course);
				System.out.println("Course Enroll Successfully!");
			} else
				System.out.println(course + " course is already enrolled!!");
	}

	private boolean validCourse(String course) {
		if (course.equalsIgnoreCase("Java") || course.equalsIgnoreCase("DSA") || course.equalsIgnoreCase("Playwright"))
			return true;
		else {
			System.out.println("Invalid course Name!! Please select courses from the list [JAVA, DSA, PLAYWRITE]");
			return false;
		}
	}

	public void printStudentInfo() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("StudentId : " + studentId);
		System.out.println("Enrolled for  : " + courses);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", studentId=" + studentId + ", courses=" + courses + "]";
	}

	// validation methods
	public boolean validAge(int age) {
		return (age >= 19 && age <= 35 ? true : false);
	}

	public boolean validName(String name) {
		String nameRegex = "^[a-zA-Z\\s]+$";
		Pattern namePattern = Pattern.compile(nameRegex);
		Matcher nameMatcher = namePattern.matcher(name);
		if (nameMatcher.matches())
			return true;
		else {
			System.out.println("Invalid Name!! Please enter Alphabet only.");
			return false;
		}
	}

	private boolean validStudentId(String studentId) {
		// TODO Auto-generated method stub
		String studentIdRegex = "S-\\d+$";
		Pattern studentIdPattern = Pattern.compile(studentIdRegex);
		Matcher studentIdMatcher = studentIdPattern.matcher(studentId);
		if (studentIdMatcher.matches())
			return true;
		else {
			System.out.println("Invalid Student Id!! Please enter in format Eg .. S-.... only.");
			return false;
		}
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getStudentId() {
		return studentId;
	}

	public List<String> getCourses() {
		return courses;
	}
	
	

}

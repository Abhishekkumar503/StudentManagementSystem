package com.student.application;

import java.util.ArrayList;
import java.util.List;

public class ListOfStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> stu = new ArrayList<>();
		
		Student s1;
		s1 = new Student("Megha", 28, "S-003");
		s1.enrollCourse("Radiology");
		stu.add(s1);
		System.out.println(s1);
		
		

	}

}

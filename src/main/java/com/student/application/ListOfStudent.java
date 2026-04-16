package com.student.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfStudent {

	static List<Student> stu;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		stu = new ArrayList<>();
		
		Student s1;
		s1 = new Student("Megha", 28, "S-003");
		s1.enrollCourse("Radiology");
		stu.add(s1);
		System.out.println(s1);
		
		System.out.println("Restult : " + findStudentbyId("S-001"));

	}
	private static Student findStudentbyId(String id) {
		// TODO Auto-generated method stub
		Student	res = stu.stream()
				.filter(x -> x.getStudentId()
				.equalsIgnoreCase(id))
				.findFirst()
				.orElseThrow(() -> new RuntimeException("Id not found!!"));
		return res;
	}

}

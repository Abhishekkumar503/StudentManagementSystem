package com.student.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
		
		System.out.println("Restult : " + findStudentbyId("S-003"));
		System.out.println("Restult : " + exceptionHandlingBytryCatch("S-001"));
		
		Student s2;
		s2 = new Student("Abhishek", 26, "S-001");
		s2.enrollCourse("JAVA");
		s2.enrollCourse("JAVA");
		s2.enrollCourse("Python");
		stu.add(s2);
		
		sortName();
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
	
//	handling Exception by Using try and catch
	private static Student exceptionHandlingBytryCatch(String id) {
		// TODO Auto-generated method stub
		Student	res = null;
				try
		{		res = stu.stream()
				.filter(x -> x.getStudentId()
				.equalsIgnoreCase(id))
				.findFirst()
				.orElseThrow(() -> new RuntimeException("Id not found!!"));
		}
				catch(RuntimeException e) {
					System.out.println("Student not found by given Id : " + id);
				}
		return res;
	}

//	Sorting by name
	public static void sortName()
	{
//		Lambda Expression
		Comparator<Student> StudendtCompare = (o1,o2) -> o1.getName().compareTo(o2.getName());
		
//		Comparator<Student> StudendtCompare = new  Comparator<Student>() {
//			
//			@Override
//			public int compare(Student o1, Student o2) {
//				// TODO Auto-generated method stub
//				return o2.getName().compareTo(o1.getName());
//			}
//		};
		
		// Now call Coleection to compare
		Collections.sort(stu, StudendtCompare);
		System.out.println(stu);
}
}

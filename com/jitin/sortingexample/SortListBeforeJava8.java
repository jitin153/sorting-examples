package com.jitin.sortingexample;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListBeforeJava8 {

	public static void main(String[] args) {
		Student student1 = new Student(1003L, "Raman Singh", "BCA", 3, 67.87, true);
		Student student2 = new Student(1001L, "Tushar Khanna", "MCA", 2, 29.56, false);
		Student student3 = new Student(1007L, "Ayushmaan Chaudhary", "MBA", 4, 89.5, true);
		Student student4 = new Student(1002L, "Varun Kashyap", "BBA", 2, 32.78, false);
		Student student5 = new Student(1005L, "Jaydev Mishra", "BCA", 5, 63.79, true);
		
		List<Student> students = Arrays.asList(student1, student2, student3, student4, student5);
		System.out.println("--Before sorting--");
		for(Student student:students) {
			System.out.println(student);
		}
		
		//--Sort students by name using Collections.sort
		Collections.sort(students, new Comparator<Student>() {
			public int compare(Student s1, Student s2) {
				return s1.getName().compareTo(s2.getName());
			}
		});
		System.out.println("\n--After sorting :: Sort students by name using Collections.sort--");
		for(Student student:students) {
			System.out.println(student);
		}
		
		//--Sort students by course using students.sort
		Collections.sort(students, new Comparator<Student>() {
			public int compare(Student s1, Student s2) {
				return s1.getCourse().compareTo(s2.getCourse());
			}
		});
		System.out.println("\n--After sorting :: Sort students by course using Collections.sort--");
		for(Student student:students) {
			System.out.println(student);
		}
		
		//--Sort students by rollNumber using students.sort
		students.sort(new Comparator<Student>() {
			public int compare(Student s1, Student s2) {
				//--Below we're doing autoboxing because compareTo method doesn't work with primitive types.
				//--Autoboxing: Converting a primitive value into an object of the corresponding wrapper class.
				Long r1=s1.getRollNumber();
				Long r2=s2.getRollNumber();
				return r1.compareTo(r2);
			}
		});
		System.out.println("\n--After sorting :: Sort students by roll number using Collections.sort--");
		for(Student student:students) {
			System.out.println(student);
		}
	}

}

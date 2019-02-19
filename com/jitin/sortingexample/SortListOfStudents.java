package com.jitin.sortingexample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortListOfStudents {

	public static void main(String[] args) {
		Student student1 = new Student(1003L, "Raman Singh", "BCA", 3, 67.87, true);
		Student student2 = new Student(1001L, "Tushar Khanna", "MCA", 2, 29.56, false);
		Student student3 = new Student(1007L, "Ayushmaan Chaudhary", "MBA", 4, 89.5, true);
		Student student4 = new Student(1002L, "Varun Kashyap", "BBA", 2, 32.78, false);
		Student student5 = new Student(1005L, "Jaydev Mishra", "BCA", 5, 63.79, true);

		List<Student> students = Arrays.asList(student1, student2, student3, student4, student5);
		System.out.println("--Before sorting--");
		students.forEach(System.out::println);
		
		//--Sort students by name using compareTo method.
		students.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
		System.out.println("\n--After sorting :: sort by name using compareTo method--");
		students.forEach(System.out::println);
		
		//--Sort students by roll number(int) using comparing method.
		students.sort(Comparator.comparing(Student::getRollNumber));
		System.out.println("\n--After sorting :: sort by roll number(int) using comparing method--");
		students.forEach(System.out::println);
		
		//--Sort students by percentage(double) using comparing method.
		students.sort(Comparator.comparingDouble(Student::getPercentage));
		System.out.println("\n--After sorting :: sort by percentage(double) using comparing method--");
		students.forEach(System.out::println);
		
		//--Sort students by percentage in reverse order(Highest to Lowest).
		students.sort(Comparator.comparingDouble(Student::getPercentage).reversed());
		System.out.println(
				"\n--After sorting :: sort by pecentage in reverse order(Highest to Lowest) using comparing method--");
		students.forEach(System.out::println);
		
		//--Sort students with chain of comparators. 
		students.sort(Comparator.comparing(Student::isPass).reversed()
				.thenComparing(Comparator.comparing(Student::getPercentage).reversed()));
		System.out.println(
				"\n--After sorting :: First sort by isPass & then sort by percentage in reverse order using comparing method--");
		students.forEach(System.out::println);

		System.out.println("\n--Another way of sorting--");
		Comparator<Student> comparator = (h1, h2) -> h1.getName().compareTo(h2.getName());

		students.sort(comparator);
		students.forEach(System.out::println);

		System.out.println("\n--Another way of sorting :: Reverse order--");
		students.sort(comparator.reversed());
		students.forEach(System.out::println);
	}

}

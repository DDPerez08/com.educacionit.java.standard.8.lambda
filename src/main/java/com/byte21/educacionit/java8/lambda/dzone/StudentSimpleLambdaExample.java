/*
 * @(#StudentSimpleLambdaExample.java 05/09/2017
 * Copyright 2017 Byte21, Inc. All rights reserved.
 * BYTE21/CONFIDENTIAL
 * */

package com.byte21.educacionit.java8.lambda.dzone;


// Packages and classes to import of jdk 1.8
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;


public class StudentSimpleLambdaExample {
	
	
	public StudentSimpleLambdaExample () {
		
		super ();
	}

	
	public static void main (String args[]) {
		
		
		// Stream
		List<Student> students = Arrays.asList (new Student("Dan", 23), new Student ("Laura", 22), new Student ("Billy", 50), new Student ("George", 21));
		List<String> namesSortedByAge = students.stream ()
		                .filter (p -> p.getAge() > 22)
		                .sorted (comparing (Student::getAge).reversed ())
		                .map (Student::getName)
		                .collect (toList ());
		System.out.println ("Stream : " + namesSortedByAge);
		
		
		// forEach equivalent
		List<Student> filteredStudent = new ArrayList<Student> ();
		students.forEach (p -> {
		
			if (p.getAge() > 22) {
		        filteredStudent.add (p);
		    }
		});
		
		Collections.sort (filteredStudent, (a, b) -> b.getAge ().compareTo (a.getAge ()));
		List<String> namesSortedByAgeForEach = new ArrayList<String> ();
		filteredStudent.forEach (p -> namesSortedByAgeForEach.add (p.getName ()));
		System.out.println("forEach : " + namesSortedByAgeForEach);
    }
}
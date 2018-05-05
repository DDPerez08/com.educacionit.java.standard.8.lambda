/*
 * @(#ArbitraryInstanceMethodReference.java 05/09/2017
 * Copyright 2017 Byte21, Inc. All rights reserved.
 * BYTE21/CONFIDENTIAL
 * */

package com.byte21.educacionit.java8.lambda.dzone;


// Packages and classes to import of jdk 1.8
import java.util.List;
import java.util.Arrays;


/**
 * 
 *  <p>Reference to an Instance Method of an Arbitrary Object of a Particular Type.
 *  
 *  @author  https://dzone.com/articles/methodreference
 *  @author  Raul Geomar Pena (raul.pena@gmail.com)
 *  @version 1.0.0
 *  @since   jdk 1.8
 *  @since   05/09/2017
 * */
public class ArbitraryInstanceMethodReference {
	
	
	public ArbitraryInstanceMethodReference () {
		
		super ();
	}
	
	
	public static void main (String args[]) {
        
		
		final List<Person> people = Arrays.asList (new Person("dan"), new Person("laura"));
        
		
		// Method reference
        people.forEach (Person::printName);
        
        
        // Lambda expression
        people.forEach(person -> person.printName ());
        
        
        // Normal
        for (final Person person : people) {
        	
            person.printName ();
        }
    }
   
	
	
	// Private class declarations.
	private static class Person {
		
		
        private String name;
        
        
        public Person (final String name) {
            
        	super ();
        	
        	this.name = name;
        }
        
        
        public void printName () {
        
        	System.out.println (name);
        }
    }
}
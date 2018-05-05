/*
 * @(#NonLazyCodeExample2.java 05/09/2017
 * Copyright 2017 Byte21, Inc. All rights reserved.
 * BYTE21/CONFIDENTIAL
 * */

package com.byte21.educacionit.java8.lambda.dzone;


// Packages and classes to import of jdk 1.8
import java.util.List;
import java.util.Arrays;


/**
 * 
 *  <p>Reference to a Static Method
 *  
 *  @author  https://dzone.com/articles/methodreference
 *  @author  Raul Geomar Pena (raul.pena@gmail.com)
 *  @version 1.0.0
 *  @since   jdk 1.8
 *  @since   05/09/2017
 * */
public class StaticMethodReference {
	
	
	public StaticMethodReference () {
		
		super ();
	}
	
	
	public static void main (String args[]) {
		
		
        List<Integer> list = Arrays.asList (1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Method reference
        list.forEach (StaticMethodReference::print);
        
        // Lambda expression
        list.forEach (number -> StaticMethodReference.print (number));
        
        // Normal
        for (int number: list) {
           
        	StaticMethodReference.print (number);
        }
    }
	
    public static void print (final int number) {
    
    	System.out.println ("I am printing: " + number);
    }
}
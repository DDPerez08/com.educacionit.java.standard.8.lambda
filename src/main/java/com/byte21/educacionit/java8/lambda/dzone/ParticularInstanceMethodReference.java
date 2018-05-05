/*
 * @(#ParticularInstanceMethodReference.java 05/09/2017
 * Copyright 2017 Byte21, Inc. All rights reserved.
 * BYTE21/CONFIDENTIAL
 * */

package com.byte21.educacionit.java8.lambda.dzone;


// Packages and classes to import of jdk 1.8
import java.util.List;
import java.util.Arrays;
import java.util.Collections;


/**
 * 
 *  <p>Reference to an Instance Method of a Particular Object.
 *  
 *  @author  https://dzone.com/articles/methodreference
 *  @author  Raul Geomar Pena (raul.pena@gmail.com)
 *  @version 1.0.0
 *  @since   jdk 1.8
 *  @since   05/09/2017
 * */
public class ParticularInstanceMethodReference {
	
	
	public ParticularInstanceMethodReference () {
		
		super ();
	}
	
	
	public static void main (String args[]) {
        
		
		final List<Integer> list = Arrays.asList (1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        final MyComparator myComparator = new MyComparator ();
        
        // Method reference
        Collections.sort(list, myComparator::compare);
        
        // Lambda expression
        Collections.sort(list, (a,b) -> myComparator.compare (a,b));
    }
   
	
	
	// Private class declarations.
	private static class MyComparator {
	 
		public int compare (final Integer a, final Integer b) {
	    
			return a.compareTo(b);
	    }
	}
}
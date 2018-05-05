/*
 * @(#ConstructorMethodReference.java 05/09/2017
 * Copyright 2017 Byte21, Inc. All rights reserved.
 * BYTE21/CONFIDENTIAL
 * */

package com.byte21.educacionit.java8.lambda.dzone;


// Packages and classes to import of jdk 1.8
import java.util.List;
import java.util.function.Supplier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


/**
 * 
 *  <p>Reference to a Constructor
 *  
 *  @author  https://dzone.com/articles/methodreference
 *  @author  Raul Geomar Pena (raul.pena@gmail.com)
 *  @version 1.0.0
 *  @since   jdk 1.8
 *  @since   05/09/2017
 * */
public class ConstructorMethodReference {
	
	
	public ConstructorMethodReference () {
		
		super ();
	}

	
	private static void copyElements (final List<Integer> list, final Supplier<Collection<Integer>> targetCollection) {
        
		
		// Method reference to a particular instance
        list.forEach (targetCollection.get()::add);
    }
	
	
	public static void main (String args[]) {
        
		
		final List<Integer> list = Arrays.asList (1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
		// Method Reference
        copyElements (null, ArrayList<Integer>::new);
        
        // Lambda expression
        copyElements (list, () -> new ArrayList<Integer>());
    }
}
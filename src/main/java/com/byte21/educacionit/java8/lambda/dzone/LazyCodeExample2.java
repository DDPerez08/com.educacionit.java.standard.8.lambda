/*
 * @(#LazyCodeExample2.java 05/09/2017
 * Copyright 2017 Byte21, Inc. All rights reserved.
 * BYTE21/CONFIDENTIAL
 * */

package com.byte21.educacionit.java8.lambda.dzone;


// Packages and classes to import of jdk 1.8
import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;


/**
 * 
 *  <p>   
 *  
 *  @author  https://dzone.com/articles/a-little-lazy-lambda-tutorial?edition=298026&utm_source=Spotlight&utm_medium=email&utm_campaign=java%202017-05-09
 *  @author  Raul Geomar Pena (raul.pena@gmail.com)
 *  @version 1.0.0
 *  @since   jdk 1.8
 *  @since   05/09/2017
 * */
public class LazyCodeExample2 {

	
	public LazyCodeExample2 () {
		
		super ();
	}
	
	
	public static void main(String args[]) {
        
		
		final List <Integer> numbers = Arrays.asList (1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println ("DEFINING THE STREAM");
        
        final Stream <Integer> stream = numbers.stream ().filter (LazyCodeExample2::compute).filter (LazyCodeExample2::process);
        System.out.println("NOT EXECUTED YET");
        
        final int result = stream.findFirst ().orElse (0);
        System.out.println("THE RESULT IS : " + result);
    }
	
	
    public static boolean compute (final int number) {
        
    	System.out.println ("computing number : " + number);
        
    	return number > 5 ? true : false;
    }
    
    public static boolean process (final int number) {
    
    	System.out.println ("processing number : " + number);
        
    	return number % 3 == 0 ? true : false;
    }
}
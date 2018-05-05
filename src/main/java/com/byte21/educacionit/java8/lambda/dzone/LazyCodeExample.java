/*
 * @(#LazyCodeExample.java 05/09/2017
 * Copyright 2017 Byte21, Inc. All rights reserved.
 * BYTE21/CONFIDENTIAL
 * */

package com.byte21.educacionit.java8.lambda.dzone;


// Packages and classes to import of jdk 1.8
import java.util.function.Supplier;


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
public class LazyCodeExample {

	
	public LazyCodeExample () {
		
		super ();
	}
	
	
	public static void main(String args[]) {
        
		
		final int number = 4;
        final Supplier <Boolean> computeResult = () -> compute (number);
        final Supplier <Boolean> processResult = () -> process (number);
        
        if (computeResult.get() && processResult.get()) {
            
        	System.out.println("TRUE");
        	
        } else {
        
        	System.out.println("FALSE");
    
        }
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
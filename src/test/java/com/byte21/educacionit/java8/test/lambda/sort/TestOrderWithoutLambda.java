/*
 * @(#TestOrderWithoutLambda.java 05/10/2017
 * Copyright 2015 Byte21, Inc. All rights reserved.
 * byte21/CONFIDENTIAL
 * */

package com.byte21.educacionit.java8.test.lambda.sort;


// Packages and classes to import of jdk 1.8
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

// Packages and classes to import of junit api.
import org.junit.Test;
import static org.junit.Assert.assertTrue;

// My own packages.
import com.byte21.educacionit.java8.lambda.Person;


/**
 * 
 *  <p>The class <code>com.byte21.educacionit.java8.test.lambda.sort.TestOrderWithoutLambda</code> is a Junit test for
 *     lambda expressions.
 *     
 *  
 *  @author  Raul Geomar Pena (raul.pena@hotmail.com)
 *  @version 1.0.0
 *  @since   jdk 1.8
 *  @since   05/10/2017
 * */
public class TestOrderWithoutLambda {
    
    
    // Public constructor declarations.
    /*
     * Constructor without parameters.
     **/
    public TestOrderWithoutLambda () {
        
        // Callt o super class.
        super ();
    }
    
    
    // Public instance method declarations.
    /**
     * 
     *  <p>Method that test ordering without lambda expressions.
     * 
     *  @see {@link org.junit.Test}
     */
    @Test
    public void testSortingByNameWithoutLambda () {
    
        // Create a persons list.
        List<Person> persons = new  ArrayList ();
        persons.add (new Person ("Raul", 39));
        persons.add (new Person ("Roman", 10));
        persons.add (new Person ("Tomas", 30));
     
        
        // Create a comparator for indicate how order the persons.
        Collections.sort (persons, new Comparator<Person>() {
            
            @Override
            public int compare (Person p1, Person p2) {
                
                // Check if are identical.
                return p1.getName().compareTo (p2.getName());
            }
        });
        
        
        // Check the test.
        assertTrue (persons.get(0).equals (new Person("Raul", 39)));
    }
    
    /**
     * 
     *  <p>Method that test ordering with lambda expressions.
     * 
     *  @see {@link org.junit.Test}
     */
    @Test
    public void testSortingByNameWithLambda () {
    
        // Create a persons list.
        List<Person> persons = new  ArrayList ();
        persons.add (new Person ("Raul", 39));
        persons.add (new Person ("Roman", 10));
        persons.add (new Person ("Tomas", 30));
     
        
        // Add the lambda expressions.
        persons.sort ((p1, p2) -> p1.getName ().compareTo (p2.getName ()));
        
        
        // Check the test.
        assertTrue (persons.get(0).equals (new Person("Raul", 39)));
    }
    
    /**
     * 
     *  <p>Method that perform the sort using a Lambda Expression with a reference to a static method.
     * 
     *  @see {@link org.junit.Test}
     */
    @Test
    public void testSortingWithStaticMethod () {
    
        // Create a persons list.
        List<Person> persons = new  ArrayList ();
        persons.add (new Person ("Raul", 39));
        persons.add (new Person ("Roman", 10));
        persons.add (new Person ("Tomas", 30));
     
        
        // Add the lambda expressions.
        persons.sort (Person::compareByNameThenAge);
    
        
        // Check the test.
        assertTrue (persons.get(0).equals (new Person("Raul", 39)));
    }
}
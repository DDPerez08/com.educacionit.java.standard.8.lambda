/*
 * @(#Student.java 05/09/2017
 * Copyright 2017 Byte21, Inc. All rights reserved.
 * BYTE21/CONFIDENTIAL
 * */

package com.byte21.educacionit.java8.lambda.dzone;


/**
 * 
 *  <p>
 *  
 *  @author  https://dzone.com/articles/methodreference
 *  @author  Raul Geomar Pena (raul.pena@gmail.com)
 *  @version 1.0.0
 *  @since   jdk 1.8
 *  @since   05/09/2017
 * */
public class Student {
	
	
	private String name = "";
	private Integer age = 0;
	
	
	public Student () {
	
		super();
	}
	
	public Student (String name) {
		
		this (name, 0);
	}
	
	public Student (int age) {
		
		this ("", age);
	}
	
	public Student (String name, Integer age) {
		
		super();
		
		this.name = name;
		this.age = age;
	}

	
	public String getName () {
		
		return this.name;
	}

	public void setName (String name) {
	
		this.name = name;
	}

	public Integer getAge () {
	
		return this.age;
	}

	public void setAge (Integer age) {

		this.age = age;
	}
}
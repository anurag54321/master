package com.kentu.clone;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {

	public static void main(String[] args) throws   CloneNotSupportedException
	{
		Singleton s1= Singleton.getInstance();
		Singleton s2= Singleton.getInstance();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		//clone
	
		  Singleton s3 = (Singleton) s1.clone();
	
		
		
		
		
		
		System.out.println(s3.hashCode());

	}

}

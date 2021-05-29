package com.kentu.ref;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		Singleton s1= Singleton.getInstance();
		Singleton s2= Singleton.getInstance();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		//Reflection
		Class clazz= Class.forName("com.kentu.ref.Singleton");
		Constructor<Singleton> ctor=   clazz.getDeclaredConstructor();
		
		ctor.setAccessible(true);
		Singleton s3=ctor.newInstance();
		
		
		
		
		
		System.out.println(s3.hashCode());

	}

}

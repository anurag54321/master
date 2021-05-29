package com.kentu.ser.deser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	private static ObjectOutputStream oos=null;
	private static ObjectInputStream ios=null;

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		Singleton s1= Singleton.getInstance();
		Singleton s2= Singleton.getInstance();
		oos = new ObjectOutputStream(new FileOutputStream("tmp/s2.ser"));
		       oos.writeObject(s1);
		       
		ios = new ObjectInputStream(new FileInputStream("tmp/s2.ser"));
		  Singleton s3 =(Singleton)ios.readObject();
		  
		  
		
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());

	}

}

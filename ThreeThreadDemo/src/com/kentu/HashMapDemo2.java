package com.kentu;

import java.util.HashSet;



public class HashMapDemo2 
{

	public static void main(String[] args)
	{
	  Student s1 = new Student(1, "kentu");
	  Student s2 = new Student(1, "kentu");
	  System.out.println(s1.equal(s2));
	  
	  HashSet<Student> hs = new HashSet<>();
	     hs.add(s1);
	     hs.add(s2);
	     
	 System.out.println(hs.size()); 
	    

				
		
	 
		    
		     

	}

}

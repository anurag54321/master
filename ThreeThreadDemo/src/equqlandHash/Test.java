package equqlandHash;

import java.util.HashSet;

public class Test {

	public static void main(String[] args)
	{
	   Student s1= new Student(1, "kentu",121);
	   Student s2= new Student(1,"kent",122);
	   
	   System.out.println(s1.equals(s2));
	   System.out.println(s1.hashCode());
	   System.out.println(s2.hashCode());
	   
	   System.out.println(s2);
	   
	  
	   

	}

}

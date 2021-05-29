package com.kentu.clone;

public class Singleton implements Cloneable
{
   private static  Singleton single=null;
   
  
   public static Singleton getInstance()
   {
	   if(single==null)
	   {
		   single= new Singleton();
	   }
	return single;
	
	   
   }


@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return new RuntimeException("cant cloned");
}
}

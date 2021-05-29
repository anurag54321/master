package com.kentu.ref;

public class Singleton
{
   private static  Singleton single=null;
   
   private Singleton()
   {
	   if(single!=null)
	   {
		   throw new RuntimeException("Exception ");
	   }
   }
   
  
   public static Singleton getInstance()
   {
	   if(single==null)
	   {
		   single= new Singleton();
	   }
	return single;
	   
   }
}

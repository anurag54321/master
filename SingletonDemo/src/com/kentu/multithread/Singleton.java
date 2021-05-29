package com.kentu.multithread;

public class Singleton
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
}

package com.kentu.ser.deser;

import java.io.Serializable;

public class Singleton implements Serializable
{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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

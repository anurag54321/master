package com.java8;
class A extends Thread
{
	
	public void run()
	{
		int a=10;
		a+=5;
		 System.out.println(a);
	}
	
}

public class ThreadDemo {

	public static void main(String[] args)
	{
		
		A a1 = new A();
		A a2 = new A();
		a1.start();
		a2.start();
		  

	}

}

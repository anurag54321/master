package com.kentu;

public class ThreadDemo 
{
   static boolean flag= false;
   static int satrt =1;
	
	public static void main(String[] args)
	{
		Thread t1 = new Thread(new Runnable()
		{
			@Override
			public void run() {
				if(flag==false){
			 System.out.println("Thread1");}
			}
			
		});
		Thread t2 = new Thread(new Runnable()
		{

			@Override
			public void run() {
				if(flag==false){
				 System.out.println("Thread2");
				}
			}
			
		});
		
		Thread t3 = new Thread(new Runnable()
		{

			@Override
			public void run() {
				 System.out.println("Thread3");
				
			}
			
		});
		
		t1.start();
		t2.start();
		t3.start();

	}

}

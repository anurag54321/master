package com.kentu;

public class Test {

	public static void main(String[] args) 
	{
	     final OddEven print = new OddEven();
	    Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				print.Even();
				
			}
	    	
	    }
	    );
	    Thread t2 = new Thread(new Runnable()
	    {

			@Override
			public void run()
			{
				print.Odd();
				
			}
	    	
	    });
	    t1.start();
	    t2.start();
	       
	}

}

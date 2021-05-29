package com.kentu.multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
	static void useSingleton()
	{
		Singleton singleton = Singleton.getInstance();
	}

	public static void main(String[] args)
	{
		ExecutorService service = Executors.newFixedThreadPool(2);
		  
		service.submit(Test::useSingleton);
		service.submit(Test::useSingleton);
		
		
		


	}

}

package consumerProducerDemo;

import java.util.Queue;
import java.util.Random;

public class Consumer implements Runnable 
{
	private Queue<Integer> sharedQueue;
	
	
	public Consumer(Queue<Integer> sharedQueue) {
		super();
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() 
	{
	  while(true)
	  {
		 synchronized (sharedQueue) 
		 {
			while(sharedQueue.isEmpty())
			{
				try {
					System.out.println("Queue is Empty so plz wailt");
					sharedQueue.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		int data=	sharedQueue.poll();
			  System.out.println("Remove"+data);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			sharedQueue.notify();
			
		} 
	  }

	}

}

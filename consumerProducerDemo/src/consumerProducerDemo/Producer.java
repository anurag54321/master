package consumerProducerDemo;

import java.util.Queue;
import java.util.Random;

public class Producer implements Runnable 
{
	private Queue<Integer> sharedQueue;
	private int MAX_SIZE=5;
	
	public Producer(Queue<Integer> sharedQueue) {
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
			while(sharedQueue.size()==MAX_SIZE)
			{
				try {
					System.out.println("Queue is full so plz wait");
					sharedQueue.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			//Random random = new Random();
			//int data=random.nextInt(10);
			
			for(int data=1;data<=5;data++)
			{
			System.out.println("produced1:"+data);
			sharedQueue.add(data);
			}
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

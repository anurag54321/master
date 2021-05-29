package consumerProducerDemo;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class ProducerConsumerProblem {

	public static void main(String[] args) 
	{
		final Queue<Integer> sharedQueue = new ArrayBlockingQueue<Integer>(5);
		
		Thread procedure = new Thread(new Producer(sharedQueue));
		procedure.start();
		
		Thread consumer = new Thread(new Consumer(sharedQueue));
		consumer.start();
		
		
 
	}

}

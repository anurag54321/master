package consumerProducerDemo;

import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class ProdConsume {
	private static Queue<Integer> sharedQueue = new ArrayBlockingQueue<Integer>(5);
	private static int MAX_SIZE = 5;

	public static void main(String[] args) {
		Runnable producer = () -> {
			while (true) {
				synchronized (sharedQueue) {
					while (sharedQueue.size() == MAX_SIZE) {
						try {
							System.out.println("Queue is full so plz wait");
							sharedQueue.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					Random random = new Random();
					int data = random.nextInt(10);
					System.out.println("produced1:" + data);
					sharedQueue.add(data);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					sharedQueue.notify();

				}
			}

		};
		Runnable consumer=()->
		{
			while(true)
			{
				synchronized (sharedQueue) {
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
		};
		new Thread(producer).start();
		new Thread(consumer).start();


	}

}

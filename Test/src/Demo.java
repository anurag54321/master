

class A implements Runnable
{
	private int num;
	private boolean flag;

	public A(int num,boolean flag)
	{
		this.num=num;
		this.flag =flag;
	}

	@Override
	public void run() 
	{
		while(flag)
		{
		
		  while(num<=10)
		  {
			  if(num%2!=0)
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  synchronized (this) 
				{
				  System.out.println(Thread.currentThread().getName()+".."+num);
			  num++;
			  flag=false;
			  
			  this.notify();
			  
		  }
		}
		
	   }
		}

	
	
}
class B implements Runnable
{
	private int num;
	private boolean flag;

	public B(int num,boolean flag) {
		this.num=num;
		this.flag=flag;
	}

	@Override
	public void run() 
	{
		while(!flag)
		{
		 while(num<=10)
		  {
			 if(num%2==0)
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  synchronized (this) 
				{
				  System.out.println(Thread.currentThread().getName()+".."+num);
			  num++;
			  flag = true;
			 
			  this.notify();
			  
		  }
		}
		
		}
	}
	
}

public class Demo 
{
	static volatile  int num=1;
	static boolean flag = true;
  public static void main(String[]args)
  {
	 
	  
	  Thread t1 = new Thread(new A(num,flag),"t1");
	  Thread t2= new Thread(new B(num,flag),"t2");
	  t1.start();
	  t2.start();
  }
}

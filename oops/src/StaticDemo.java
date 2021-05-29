
public class StaticDemo 
{
	static int i;
	static
	{
		System.out.println("static block");
		System.out.println(i);
	}
	
	public StaticDemo() {
		System.out.println("constructor:"+i);
	}
	
	{
		System.out.println("instance block");
		i++;
	}

	public static void main(String[] args)
	{
	    StaticDemo  sd = new StaticDemo();

	}

}

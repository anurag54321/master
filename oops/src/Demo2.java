class P
{
	
}
class Q extends P
{
	
}

class AAA
{
	public void m1(int a)
	{
		System.out.println("Q");
	}

	
}

 class BA extends AAA
 {
	 public void m1(int  p)
	 {
		 System.out.println("P");
	 }
 }
public class Demo2 {

	public static void main(String[] args) 
	{
		AAA a = new BA();
		  a.m1(10);
		  
		  

	}

}

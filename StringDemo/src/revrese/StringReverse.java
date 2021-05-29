package revrese;


public class StringReverse {

	public static void main(String[] args)
	{
	  System.out.println(reverse("abc"));	
      
	}

	private static String reverse(String string) 
	{
		if(string.isEmpty())
			return string;
		return reverse(string.substring(1))+ string.charAt(0);
	  
		
	}

}

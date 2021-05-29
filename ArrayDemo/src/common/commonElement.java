package common;

import java.util.HashSet;

public class commonElement {

	public static void main(String[] args) 
	{
		
		int[] a ={2,5,8,6,4,4,3,8};
		int[] b={2,5,8,2,5,8,8};
		HashSet<Integer> hs = new HashSet<>();
	
		
		for (int num : a)
		{
			for (int num1 : b) 
			{
				if(num==num1)
				{
					hs.add(num);
				}
			}
		
		}
		
		System.out.println(hs);
		
		
		

	}

}

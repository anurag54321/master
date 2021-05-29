package removedupArray;

import java.util.HashSet;
import java.util.Set;

public class UsingSet {
	
	public static void main(String[] args) 
	{
		
		
		int[] a = {1,3,5,3,4,1,2,3,5,5};
		Set<Integer> set = new HashSet<>();
		
		for (int num : a) 
		{
			set.add(num);
		}
		
		System.out.println("After Removing");
		System.out.println(set);
		

	}

}

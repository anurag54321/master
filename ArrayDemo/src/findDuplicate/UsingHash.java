package findDuplicate;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UsingHash {

	public static void main(String[] args) 
	{
		int[] a={3,5,4,3,2,2,2,1,3,9,9,5,5};
		
		/*Set<Integer> s = new HashSet<>();
		for (Integer in : a)
		{
			if(s.add(in)==false)
			{
				System.out.println(in);
			}
		}*/
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for (int i : a)
		{
		   if(hm.containsKey(i))
		   {
	        hm. put(i, hm.get(i)+1);
		   }
		   else 
		   {
			   hm.put(i, 0); 
		   }
		}
     Set<Map.Entry<Integer,Integer>>	entry=	hm.entrySet();
   for (Map.Entry<Integer, Integer> entry2 : entry)
   { 
	   if(entry2.getValue()>1)
	   {
		   System.out.print(entry2.getKey()+" ");
	   }
    }


		

	}

}

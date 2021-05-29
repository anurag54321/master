package com.kentu;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDemo 
{
    public static void main(String[] args) 
    {
		HashMap<String,String> hm = new HashMap<>();
		    hm.put("b", "banana");
		    hm.put("c", "cat");
		    hm.put("d", "dog");
		    hm.put("m", "mango"); 
		    hm.put("t", "Tiger");
		    
		/*TreeMap<String,String> tm = new TreeMap<>(hm);
		
		System.out.println(tm);
		*/
		/**
		 * To sort based on values
		 * 
		 * 
		 */
		
		Map<String, String> treeMap = new TreeMap<String,String>(	
				
				new Comparator<String>() {
					@Override
					public int compare(String o1, String o2) {
						return o2.compareTo(o1);//sort in descending order
					}
					});
		    System.out.println(treeMap);
	}
}

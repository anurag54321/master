package com.kentu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapSortByKeyDecending {

	public static void main(String[] args) 
	{
		HashMap<String,String> hm = new HashMap<>();
	    hm.put("b", "banana");
	    hm.put("c", "cat");
	    hm.put("d", "dog");
	    hm.put("m", "mango"); 
	    hm.put("t", "Tiger");
	    
	    
	    Set<Entry<String, String>> entrySet = hm.entrySet();
	    
	    List<Entry<String, String>> listOfentrySet = new ArrayList<Entry<String, String>>(entrySet);
	    
	    Collections.sort(listOfentrySet, new SortByKeyAscending());
	    
	    
	    System.out.println(listOfentrySet);
	    

	}

}

class SortByKeyAscending implements Comparator<Map.Entry<String, String>>
{

	@Override
	public int compare(Entry<String, String> o1, Entry<String, String> o2) {
		// TODO Auto-generated method stub
		return o1.getKey().compareTo(o2.getKey());
	}
	
}

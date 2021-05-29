package com.kentu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortByArray {

	public static void main(String[] args) 
	{
	   int[] array = {4,4,2,2,2,2,3,3,1,1,7,6,8};
	   
	   Map<Integer, Integer> map = new HashMap<>();
	   List<Integer> outputArray = new ArrayList<>();
	   
	   for (Integer current : outputArray)
	   {
		int count=map.getOrDefault(current, 0);
	     map.put(current, count+1);
	     outputArray.add(current);
	     
	     
	   }
	   
	   //SortComparator comp = new SortComparator();
	     
	     Collections.sort(outputArray, new SortComparator(map));
	     for (Integer i : outputArray) { 
	            System.out.print(i + " "); 
	        }

	}

}

class SortComparator implements Comparator<Integer>
{
	private  Map<Integer, Integer> freqMap;
	
	SortComparator(Map<Integer, Integer> freqMap)
	{
		this.freqMap=freqMap;
	} 
	@Override
	public int compare(Integer k1, Integer k2) 
	{
		int freqCompare = freqMap.get(k1).compareTo(k2);
		if(freqCompare==0)
		{
			return k1.compareTo(k2);
		}
		
		return freqCompare;
	}
	
}

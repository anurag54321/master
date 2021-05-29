package Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class SortByFrequency {

	public static void main(String[] args) {
		int a[] = { 5, 4, 3, 2, 1, 0, 5, 3, 2, 4, 1, 2, 3, 5 };

		System.out.println("Before sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
		sortByFreq(a);
		 System.out.println("\nAfter Sorting");
	        for(int i=0; i<a.length; i++){
	            System.out.print(a[i] +" ");
	        }
	}

	private static void sortByFreq(int[] a) {
		HashMap<Integer, Integer> hm = new HashMap<>();

		for (int num : a) {
			if (hm.containsKey(num)) {
				hm.put(num, hm.get(num) + 1);
			} else {
				hm.put(num, 1);
			}
		}
		ArrayList<Entry<Integer, Integer>> al = new ArrayList<>(hm.entrySet());

		Collections.sort(al, new Comparator<Map.Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> i1,
					Entry<Integer, Integer> i2) {
				// TODO Auto-generated method stub
				return i1.getValue().compareTo(i2.getValue());
			}

			/*
			 * @Override public int compare(Object obj1, Object obj2) { return
			 * ((Comparable) ((Map.Entry) (obj2)).getValue())
			 * .compareTo(((Map.Entry) (obj1)).getValue()); }
			 */

		});

		int count = 0;

	
		for (Entry<Integer, Integer> entry : al) 
		{
			
			int key = (int) entry.getKey();
			int val = (int) entry.getValue();

			for (int i = 0; i < val; i++) {
				a[count] = key;
				count++;
			}
		}
	}

}

package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencySort {

	public static void main(String[] args) 
	{
       List<Integer> num = Arrays.asList(1,3,5,4,4,5,8,8,8,2);
       /**
        * 
        * @kentu..print frequency 
        */
        Map<Integer, Long> freq = num.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(freq);
        
        /**
         * 
         * @sort based on frequency
         * 
         */
     


	}

}




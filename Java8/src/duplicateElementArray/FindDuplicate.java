package duplicateElementArray;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindDuplicate {

	public static void main(String[] args)
	{
		
		List<Integer> numbers = Arrays.asList(1,0,1,2,5,8,5,8);
		//get duplicate from an an array
		//Set<Integer> duplicated = numbers.stream().filter(n -> numbers.stream().filter(x -> x == n).count() > 1).collect(Collectors.toSet());
		//print based on frequency value
        //Map<String, Long> couterMap = numbers.stream().collect(Collectors.groupingBy(e -> e.toString(),Collectors.counting()));
		//remove duplicate
		//Set<Integer> couterMap = numbers.stream().distinct().collect(Collectors.toSet());
		
		//max element
		//Integer couterMap = numbers.stream().max(Comparator.comparing(Integer::valueOf)).get();
		//System.out.println(couterMap);
		
		//prime number
		Integer prime=11;
		System.out.println(findPrimeNumber(prime));
                                                                         
                                                 		
		

	}

	private static boolean findPrimeNumber(Integer prime)
	{
		return prime>1 && IntStream.range(2, prime).noneMatch(i->prime%i==0);
		
		
	}

}

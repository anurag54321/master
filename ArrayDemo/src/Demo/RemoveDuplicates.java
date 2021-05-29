package Demo;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args)
	{
		int[] ch={1,2,2,1,5,6,5,2};
		
		removeDuplicates(ch);

	}

	private static void removeDuplicates(int[] ch) 
	{
		int length = ch.length;
		for(int i=0;i<length-1;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(ch[i]==ch[j])
				{
					ch[j]=ch[ch.length-1];
				  length--;
				   j--;
				   
			}}
				
		}
		int[] ch1 = Arrays.copyOf(ch,length);
		System.out.println("Array Without Duplicates : ");

		for (int k = 0; k < ch1.length; k++) {
			System.out.print(ch1[k] + "\t");
		}
	}
	

}

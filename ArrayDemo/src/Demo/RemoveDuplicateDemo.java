package Demo;

public class RemoveDuplicateDemo {

	public static void main(String[] args)
	{
		int[] ch={1,2,2,1,5,6,5,2};
		
		for(int i=0;i<ch.length-1;i++)
		{
			int count=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
			}
			System.out.println(ch[i]+"="+count );
		}

	}

}

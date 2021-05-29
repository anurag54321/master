package noofOccurence;



 

public class WordCount {
public static void main(String args[])
{
	/*System.out.println("to count the number of occurrences of character");		
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the string");
	String st=scan.nextLine();
	char ch[]=st.toCharArray();*/
	int[] ch={1,2,2,1,5,6,5,2};
	int n=ch.length;
	for (int i=0;i<n ;i++ )
	{
		int count=1;
		for (int j=i+1;j<n ;j++ )
		{
			if (ch[i]==ch[j])
			{
				count=count+1;
				for(int k=j;k<n-1 ;k++ )
				{
					ch[k]=ch[k+1];
					
					
				}
				j--;
				n--;
			}
		}
		System.out.println(ch[i]+"="+count);
	}


}
}
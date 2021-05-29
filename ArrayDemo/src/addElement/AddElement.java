
package addElement;

public class AddElement {

	public static void main(String[] args)
	{
		int[] a={10,20,30,50,60,70};
		int element =40;
		int index =3;
		
		for(int i =a.length-1;i>index-1;i--)
		{
			
			//System.out.println(a[i]);
			a[i]=a[i-1];
			//System.out.println("------");
			//System.out.print(a[i]);
		}
		a[index]=element;
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}

	}

}

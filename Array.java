import java.util.*;
class Base
{
	public static void main(String[] args)
   {
	Base b=new Base();
	System.out.println("Enter the size of an Array:");
	Scanner st=new Scanner(System.in);
	int size=st.nextInt();
	int a[]=new int[size];
	for(i=0;i<a.length;i++)
	{
		a[i]=st.nextInt();
	}
	int k[]=b.sortArray(a);
	for(i=0;i<k.length;i++)
	{
		System.out.println("Sorted Array is" +k[i]);
	}
   

	int[] sortArray(int a[])
	{
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
			    {
			     temp=a[i];
			     a[i]=a[j];
			      temp=a[j];
			     }

		       }
	          }
	return a;
        }
  }
}

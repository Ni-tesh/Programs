import java.util.*;
class ArrayLitDemo
{
  public static void main(String st[])
  {
  	ArrayList<String> ob=new ArrayList<String>();
	ob.add("Nitesh");
	ob.add("Tulika");
	ob.add("Neha");
	ob.add("Nitesh"); /*duplicate object in array list */
	ob.add(null); /*null onject in the list*/
	for(int i=0;i<ob.size();i++)
	{
		System.out.println(ob.get(i));
	}
	System.out.println(ob.size());
	System.out.println(ob.contains("Rahul"));

	System.out.println(ob.indexOf("Neha"));
	System.out.println(ob.lastIndexOf("Neha"));
	ob.add(1,"Rakesh");
	ob.remove("Tulika");
	for(int j=0;j<ob.size();j++)
		{
			System.out.println(ob.get(j));
		}
	System.out.println(ob.isEmpty());
	
  }
}
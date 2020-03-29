/*Wap to create a class student which will take the input in get function for name id and marks in four subjects ,
create show method which will display the detail of student , now create array of oobj of five students and show the detail 
of each using method calling.*/

import java.util.*;
class Student
{
	Scanner st=new Scanner (System.in);
	String name;
	int id,i,marks[]= new int[4];
	public static void main(String arg[])
	{
	Student s[]=new Student[4]; /*Object of Array type */
 	for(int i=0;i<s.length;i++)
		{
		s[i]=new Student(); /* constructor */
		s[i].get();
		s[i].show();
		}
	}
	void get()
	{
	System.out.println("Enter the name of Student:");
	name=st.nextLine();
	System.out.println("Enter the Student Id:");
	id=st.nextInt();
	for(int i=0;i<marks.length;i++)
		{
		System.out.println("Enter the marks in all subjects:");
		marks[i]=st.nextInt();
		}
	}
	void show()
	{
	System.out.println("NAME:"+name);
	System.out.println("ID:"+id);
	for(int i=0;i<marks.length;i++)
	  { 
           System.out.println("Marks in all the subjects \t"+marks[i]);
	  }
	}
}	
import java.util.*;
class Employee
{
	int id;
	String name;
	String dept_name;
	
	void get()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID");
		id = sc.nextInt();
		System.out.println("Enter Name");
		sc.nextLine();
		name = sc.nextLine();
		System.out.println("Enter Department");
		sc.nextLine();
		dept_name = sc.nextLine();		
	}

	void showdetails()
	{
		System.out.println("Enter ID"+id);
		System.out.println("Enter Name"+name);
		System.out.println("Enter Department"+dept_name);
	}

	public static void main(String args[])
	{
		Employee emp[] = new Employee[5];
		for(int i=0;i<5;i++)
		{
			emp[i] = new Employee();
		}
		System.out.println("Enter Details For 5 Employee \n\n");
		for(int j=0;j<5;j++)
		{
			System.out.println("Enter Details for Employee "+(j+1));
			emp[j].get();
		}
		
		System.out.println("Record of employees");
		
		for(int j=0;j<5;j++)
		{
			System.out.println("\n\n Details for Employee "+(j+1));
			emp[j].showdetails();
		}
	}
}
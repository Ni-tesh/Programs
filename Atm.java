import java.util.*;
class Atm
{
public static void main(String s[])
  {
	String name;
	int uid,acc_no;
	float bal;
	Scanner st=new Scanner(System.in);
	System.out.println("Enter the Name:");
	name=st.newLine();
	System.out.println("Enter the User Id:");
	uid=st.newInt();
	System.out.println("Enter the Account Number:");
	acc_no=st.newInt();
	System.out.println("Enter the Balance Amount:");
	bal=st.newLong();
	do
        {
		System.out.println("Press W for Withdrawl");
		
		System.out.println("Press D for Deposit");
		
		System.out.println("Press C for Check Balance");
		
 		char user input=st.next().charAt(0);
		
		switch(user input)
		{
		case 'W':
				
		System.out.println("Enter the Amount to Withdrawl");
		st.nextInt();
		int withdrawl=st.nextInt();
		bal=bal-withdrawl;
		break;

		case 'D':
		
		System.out.println("Enter the Amount Deposited");
		st.nextInt();
		int deposit=st.nextInt();
		bal=bal+deposit;
		break;

		case 'C':
		System.out.println("Your Balance Amount is"+bal);
		break;
		
		default:
		System.out.println("Enter Correct Details!!");
                }
      	System.out.println("You want the menu again!");
	user=st.next.charAt(0);
	}
while(user=='Y');
}
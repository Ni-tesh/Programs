/* Write a program to create a class Bank_Account with appropriate attributes for Account number, Account holder name and balance.
 Store 5 Bank Account objects in an array.In main, provide menu to the user for deposit/withdraw/balance inquiry. 
Ask the account number from the user and invoke the deposit() or withdraw() or balance_inquiry(). */

import java.util.*;
class Bank_Account
{
 Scanner st=new Scanner (System.in);
 String name;
 int acc_no;
 int balance;
 public static void main(String arg[])
 {
 Bank_Account a[]=new Bank_Account[5]; /*object of array type*/
 for(int i=0;i<a.length;i++)
  {
  a[i]=new Bank_Account();
  a[i].get();
  a[i].deposit();
  a[i].withdrawl();
  }
 }
 void get()
 {
  System.out.println("Enter the name of Account holder");
  name=st.nextLine();
  System.out.println("Enter the Account no.");
  acc_no=st.nextInt();
 }
void deposit()
 {
  int dep;
  System.out.println("Enter the amount deposited");
  dep=st.nextInt();
  balance=balance+dep;
  System.out.println("Bal is:"+balance);
  }
void withdrawl()
  {
  int with;
  System.out.println("Enter the amount withdrawl");
  with=st.nextInt();
  balance=balance-with;
  System.out.println("Bal is:"+balance);
  }
}  

 
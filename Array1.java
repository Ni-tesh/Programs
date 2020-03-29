import java.util.*;
class User
{
 String n;
 int rr;
 Scanner st=new Scanner(System.in);
 void get()
 {
 System.out.println("Enter your Name \t Enter your Id");
 n=st.nextLine();
 rr=st.nextInt();
 }
 public static void main(String[] s)
 {
 User u[]=new User[3];
 for(int i=0;i<u.length;i++)
 {
 u[i]=new User();
 u[i].get();
 }
 }
}
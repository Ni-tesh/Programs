interface one
{ 
 int i=0;
 void get(); 
 default void call()
 {
 System.out.println("ONE");
 }
 static void show()
 { 
 System.out.println("one");
 }
 public static void main(String st[])
 {
 }
}
interface two
{
}
class student implements one,two
{
 public void get() 
 {
  System.out.println("Enjoy");
 }
 public static void main(String st[])
 { 
  one n1=new student();
  two n2=new student();
  n1.call();
  n1.get();
  one.show();
 }
}
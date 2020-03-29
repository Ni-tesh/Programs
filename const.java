class ThisDemo
{
 public ThisDemo()
 {
 this(10); 
 System.out.println("first constructor");
 }
 public ThisDemo(int a)//overloading constructor
 {
 this(10,20);
 System.out.println("Second Constructor);
 }
 public ThisDemo(int a,int B)//another overloaded const.
 {
 this("Nitesh"); 
 System.out.println
 }
 public ThisDemo(String s)// and still another
 {
 }
 public static void main(String args[])
 {
 ThisDemo first=new ThisDemo();
}

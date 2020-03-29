/*interface Listner
{
 void click();
}
class user
{
 public static void main(String st[])
 {
  Listner l=new Listner()
  {
   public void click()
   {
    System.out.println("Hi, have a good day!");
   } 
  };
  l.click();
 }
}

Wap to create a class UGC having abstract method as terms and condition now create a class university
which will provide the implementation of   */

abstract class UGC
{
 abstract void termsCondition();
}
class University
{
 public static void main(String st[])
 {
 UGC u= new UGC()
  {
  void termsCondition()
   {
   System.out.println("Smile:");
   }
   void get()
   {
   System.out.println("More.");
    }
  };
  //u.get(); 
  u.termsCondition();
 }
}

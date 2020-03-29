/*
1.Abstract
abstract class event
{
 event()
 {
  System.out.println("Event constructor");
 }
  abstract void register();
  abstract void fees();
  static void call()
  { 
  System.out.println("Inside class:");
  }
  public static void main(String st[])
  {
   call();
   System.out.println("Inside main:");
  }
}
 
class student extends event
{
 student()
 {
 super();
 }
 void register()
 {
 System.out.println("Registeration Form");
 }
 void fees()
 {
 System.out.println("Rs 800");
 }
 public static void main(String st[])
 {
 event e=new student();
 e.register();
 e.fees();
 event.call(); 
 }
} 
*/

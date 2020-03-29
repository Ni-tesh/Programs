abstract class RBI
{
 abstract float roi();
 static void show()
 {
 System.out.println("Rate of Interests");
 }
}
class KVB extends RBI
{
 float roi()
 {
 return 8.7f;
 }
 public static void main(String st[])
 {
 }
}
class PNB extends RBI
{
 float roi()
 {
 return 8.3f;
 }
 public static void main(String st[])
 {
 }
}
class SBI extends RBI
{
 float roi()
 {
 return 7.5f;
 }
 public static void main(String st[])
 {
 }
}
class customer
{
 public static void main(String st[])
 {
 RBI.show();
 RBI n1=new KVB();
 RBI n2=new PNB();
 RBI n3=new SBI();
 System.out.println("Rate of interest of KVB in %:" +n1.roi());
 System.out.println("Rate of interest of PNB in %:" +n2.roi());
 System.out.println("Rate of interest of SBI in %:" +n3.roi());
  
 }
}
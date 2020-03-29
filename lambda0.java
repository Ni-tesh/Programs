interface one
{
 void get();
}
class test
{
 public static void main(String st[])
 {
  one o=(int a)->
  {
   System.out.println("Call");
  };
  o.get(10);
 }
}
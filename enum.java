class Enumeration
{
 public
  enum cars{f1,f2,f3};
 public static void main(String s[])
 {
  for(cars c: cars.values())
   {
    System.out.println("The car RW:" +c);
     cars ca=cars.f1;
    switch(ca)
     {
       case f1:System.out.println("ferrari1");
       default:System.out.println("oops");
     }
      cars ca1=cars.f2;
    switch(ca1)
     {
       case f2:System.out.println("ferrari2");
       default:System.out.println("oops");
     }
 System.out.println("-------the color RW:"+ca);
   }
  }
}
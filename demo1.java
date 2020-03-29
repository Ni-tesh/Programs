class Demo
{
 public static void main(String... args)
 {
  printMax(7,3,1,5);
  printMax(new double[]{7,3,1,5});

 }
 public static void printMax(double... numbers)
 {
  for(double d:numbers)
  System.out.println(d);
 } 

}
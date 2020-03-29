public class Nested
{
 public static void main(String[] s)
 {
 int i=0;
 int j=1;
 
 switch(i)
  {
   case 0:
           switch(j)
           {
             case 0:
                System.out.println("i is 0, j is 0");
              break;
             case 1:
                System.out.println("i is 0, j is 1");
              break;
             default:
                System.out.println("nested default");
             }
             break;
             default:
                System.out.println("no matching case found");
   }
 }
}
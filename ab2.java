import java.util.*;
abstract class UGC
{
 abstract float cgpa(float tgpa[]);
 static void call()
 {
 System.out.println("Student Cgpa:");
 }
}
class LPU extends UGC
{
 int sum;
 float cgpa(float tgpa[])
 {
 for(int i=0;i<tgpa.length;i++)
  {
  sum+=tgpa[i];
  }
  float cgpa=sum/tgpa.length;
  return cgpa;
 }
}
class DAV extends UGC
{
 int sum;
 float cgpa(float tgpa[])
 { 
  for(int i=0;i<tgpa.length;i++)
  {
   sum+=tgpa[i];
  }
 float cgpa=sum/tgpa.length+10;
 return cgpa;
 }
}
class student
{
 public static void main(String st[])
 {
  Scanner sc=new Scanner(System.in);
  float tgpa[]=new float[8];
  System.out.println("Enter the cgpa for 8 semester:");
  for(int i=0;i<tgpa.length;i++)
  {
 tgpa[i]=sc.nextFloat();
  }
  UGC s1=new LPU();
  UGC s2=new DAV();
  UGC.call();
  System.out.println("Calculated CGPA for LPU Student:"+s1.cgpa(tgpa));
  System.out.println("Calculated CGPA for DAV:"+s2.cgpa(tgpa));
 }
}
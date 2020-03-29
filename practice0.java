/*1Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. 
Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
class Student
{
String name;
int roll_no;
public static void main(String arg[])
{
 Student s=new Student();
 s.name="john";
 s.roll_no=2;
 System.out.println("name of student:" + s.name + "roll no. is:" + s.roll_no);

}
}

2.Assign and print the roll number, phone number and address of two students having names "Sam" and "John" respectively by creating two objects of class 'Student'.
class Student
{
int roll_no;
long phn_no;
String add;
public static void main(String arg[])
 {
 Student s1=new Student();
 Student s2=new Student();
 s1.roll_no=1;
 s1.phn_no=70498;
 s1.add="High Street 7/A";
 s2.roll_no=2;
 s2.phn_no=97792;
 s2.add="Sunburn Square 7/A";
 System.out.println("Student 1: roll no." +s1.roll_no+"phone no:" +s1.phn_no+ "address:" +s1.add);
 System.out.println("Student 2: roll no." +s2.roll_no+"phone  no:" +s2.phn_no+ "address:" +s2.add);
  }
}

3.Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units 
 by creating a class named 'Triangle' without any parameter in its constructor.
class Traingle
{
public static void main(String arg[])
 {
int b=3,p=4,h=5;
int area,perimeter;
area=b*h/2;
perimeter=b+p+h;
System.out.println("Area : " +area + "perimeter : "+perimeter);
 }
}


4.Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating
a class named 'Triangle' with constructor having the three sides as its parameters.*/

class Traingle
{
int b,p,h;
public Traingle(int x,int y, int z)
{
 b=x;
 p=y;
 h=z
public int getArea()
 {
 return (x*y)/2;
 }
 public int getPerimeter();
 {
 return x+y+z;
 }
public static void main(String arg[])
 {
 Traingle t=new Traingle(3,4,5));
 System.out.println(t.getArea());
 System.out.println(t.getPerimeter()); 
 }
}

						
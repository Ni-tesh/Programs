class Test1

{
public static void main(String s[])
{
int a=10;
int b=20;
int c=25;
int d=25;
 System.out.println("a++  = " + (a++));
 System.out.println("a-- = " + (a--));
 System.out.println("a  = " + a);
 System.out.println("d++  = " + (d++));
 System.out.println("++d  = " + (++d));
System.out.println("a==b  = " + (a==b));
System.out.println("a!=b  = " + (a!=b));

int e=-10;
int res=b>>2;
int rss= b>>>2;

System.out.println("simple value:" +e);
System.out.println("shift simple:" +res);
System.out.println("shift fill zero:" +rss);

int f=-40;
int resc= f>>2;
int rssc= f>>>2;

int z=64;
System.out.println("simple value:" +f);
System.out.println("shift simple:" +resc);
System.out.println("shift fill zero:" +rssc);
System.out.println(34>>3);
System.out.println(-34>>3);
System.out.println(-34>>>3);
System.out.println(z>>>32);
System.out.println(z>>33);

int x=10, y=5;
while(x-->7||++y<8);
System.out.println("x :" +x);
System.out.println("y :" +y);
}
}

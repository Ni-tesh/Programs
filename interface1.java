interface click
{
 void onclick();
 static void show()
 {
 System.out.println("***********SHOW******");
 }
 default void call()
 {
 System.out.println("*********CALL********");
 }
}
class mouse implements click
{
 public void onclick()
 {
 System.out.println("mouse action perform on this:");
 }
}
class user
{
 public static void main(String st[])
 {
 click c1=new mouse();
 c1.onclick();
 click.show();
 c1.call();
 }
}
 
 

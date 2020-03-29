class bicycle
{
 public int gear;
 public int speed;
 
 public bicycle(int gear, int speed)
 {
 this.gear=gear;
 this.speed=speed;
 }
 public void applyBrake(int decrement)
 {
 speed-=decrement;
 }
 public void speedUp(int increment)
 {
 speed+=increment; 
 }
 public String toString()
 {
 return("No. of gears are:" +gear +"\n" +"Speed of bicycle is:" +speed); 
 }
}
class bike extends bicycle
{
 public int seatHeight;
 
 public bike(int gear, int speed, int startHeight)
 {
 super(gear, speed); //invoking base-class constructor
 seatHeight=startHeight;
 }
 public String setHeight(int newValue)
 {
 seatHeight=newValue;
 }
 public String toString()
 {
 return(super.toString() +"\nHeight is:" +seatHeight);
 }
}
class Test
{
 public static void main(String st[])
 {
 bike b=new bike(3,100,25);
 System.out.println(b.toString());
 }
}

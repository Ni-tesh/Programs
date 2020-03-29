/* Write a program to define a class Vehicle with appropriate attributes for price(in lakhs), mileage, brand and model.  Define the main class in which implement methods: 
 
addCar() to add a new car in the showroom. 
 
getCars() such that ask the user to enter the budget (in lakhs) and the brand (Maruti/Toyota/Hyundai etc) he/she wants to buy. 
 
Add some cars in the showroom and invoke the getcars method to display the details of all the Cars which fits to buyers requirements. */

import java.util.*;
class vehicle
{
String name,model;
String Brand;
int price;
Scanner s=new Scanner (System.in);
public static void main(String arg[])
 {
 vehicle v=new vehicle();
 v.addCars();
 v.getCars();
 }
 void addCars()
 {
 System.out.println("Enter the Brand name:");
 Brand=s.nextLine();
 System.out.println("Name of the car:");
 name=s.nextLine();
 System.out.println("MOdel name:");
 model=s.nextLine();
 System.out.println("Price:");
 price=s.nextInt(); 
 
 }
 void getCars()
 {
 System.out.println("*********************************************************************************");
 System.out.println("Brand Name-" +Brand);
  System.out.println("car name:" +name);
 System.out.println("model name:" +model);
 System.out.println("cost:" +price);
 }
}

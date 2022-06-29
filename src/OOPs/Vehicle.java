package OOPs;

class Vehicle
{
 void run()
 {
	 System.out.println("vehicale is reunning");
 }
}
class Bike extends Vehicle
{
  void run()
  {
	  System.out.println("Bike Running Safely");
  }
}
class overrider
{
public static void main(String[] args) {
	Bike b= new Bike();
	b.run();
	Vehicle v = new Vehicle();
	v.run();
}	
}
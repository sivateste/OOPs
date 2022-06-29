package OOPs;

class Base
{
	
  void Display()
  {
	  System.out.println("Base Method");
  }
}
class Drived extends Base
{
  void Display()
  {
	  System.out.println("Drived Method");
  }
}
public class Overriding {

	public static void main(String[] args) {

		Drived c =new Drived();
		      c.Display();
		      
		
	}

}

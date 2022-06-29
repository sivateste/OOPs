package OOPs;

class Animal
{
  void eating()
  {
	  System.out.println("Eating ....!");
  }
}
class Dog extends Animal 
{
void burg()
{
System.out.println("Burging");	
}
}
class Cat extends Animal
{
void milk()
{
	System.out.println("Drinking Milk");
}
}


public class Hierarchical {

	public static void main(String[] args) {
        Dog d= new Dog();
            d.burg();
            d.eating();
        Cat c= new Cat();
            c.milk();
            c.eating();
        
		
		 
	}

}

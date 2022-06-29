package OOPs;

abstract class Parent
{
    abstract void info1();
    
    void info2()
    {
    	System.out.println("this is non abstract method");
    }
}
 class child extends Parent
 {
	 public void info1()
	 {
		 System.out.println("this is abstract method in parent class");
	 }
 }
public class MainAbstractClass {

	public static void main(String[] args) {
         
		child c= new child ();
		c.info1();
		c.info2();
	}

}

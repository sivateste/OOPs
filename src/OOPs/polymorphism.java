               // Method Ovrloading
package OOPs;

public class polymorphism {

	void name() 
	{
		System.out.println("siva");
	}
	void name(int a)
	{
		System.out.println("a = "+a);
	}
	
	public static void main(String[] args) {
		
		polymorphism s= new polymorphism();
		
		s.name();
		s.name(30);
		
		
	}
	
	
}

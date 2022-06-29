package OOPs;

public class Overloading {
	
	void name()
	{
		System.out.println("siva");
	}
	void name( int a)
	{
		System.out.println("a="+a);
	}

	public static void main(String[] args) {
		
		Overloading obj = new Overloading();
		obj.name();
		obj.name(10);
	}
}

package OOPs;

public class C {
	
	void add(int a,int b,int c)
	{
		 a=10;
				 b=20;
		c=a+b;
		System.out.println("Sum ="+c);
	}
	
	void add(int x,int y)
	{
		int z=x+y;
		System.out.println("Sum ="+z);
		
	}

	public static void main(String[] args) {
		
		C obj =new C();
		obj.add(10,20);
		obj.add(2,63);
		
	}
}

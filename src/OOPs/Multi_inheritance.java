package OOPs;

class Add 
{
   int a=10,b=20;
   
   void add()
   {
	   System.out.println("Add ="+(a+b));
   }
}
class Sub extends Add
{
 void sub()
 {
	 System.out.println("Sub ="+(a-b));
 }
}
class Multi extends Sub
{
void multi()
{
System.out.println("Multi ="+(a*b));	
}
}
class Div extends Multi
{
	void div()
	{
		System.out.println("Div = "+(a/b));
	}
	}

public class Multi_inheritance {

	public static void main(String[] args) {

		Div d = new Div();
		System.out.println("This is Multi-level Inheritance");
		d.add();
		d.sub();
		d.multi();
		d.div();
	}

}

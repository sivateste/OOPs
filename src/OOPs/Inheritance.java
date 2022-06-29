package OOPs;

 class Employee
{
	float salary=45000.123f;
}

public class Inheritance extends Employee
 {
  int bonus = 15000;
	public static void main(String[] args) {

		Inheritance In =new Inheritance();
		
		System.out.println("Total salary = "+(In.salary+In.bonus));
	}

}

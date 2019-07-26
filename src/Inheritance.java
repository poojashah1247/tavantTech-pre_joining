
public class Inheritance {

	public static void main(String args[])
	{
		Saving s= new Saving();
		s.method();
		s.method();
	}
}
	class Acc
	{
		void method()
		{
			System.out.println("Superclass Method");
		}
	}
	class Saving extends Acc
	{
		void method()
		{
			System.out.println("Subclass Method");
		}
	}
	

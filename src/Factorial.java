
public class Factorial {
	public static void main(String args[]) 
	{
		int n=5;
		Factorial fact = new Factorial();
		int facto = fact.factorial(n);
		System.out.println("factorial of 5 is : "+facto);
	}
	static int factorial(int n) 
    { 
        int fact = 1, i; 
        for (i=2; i<=n; i++) 
            fact =fact * i; 
        return fact; 
    } 

}

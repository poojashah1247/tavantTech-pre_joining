
public class Temparature {

	public static void main(String arg[])	
	{
	    double a=250;
	    double c=121.111111;
	    Temparature t= new Temparature();
	    double result=t.celsius(a);
	    System.out.println(result);
             	      	  	     
	    double re=t.fahrenheit(c);
	    System.out.println(re);
	} 
	
	 double celsius(double f)
	{	
	return  (f-32)*5/9;
	}
	 
	 double fahrenheit(double f)
	 {
		 return (f*9/5)+32;
	 }
}

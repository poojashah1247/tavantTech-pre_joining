
public class MarkValidator {
	public static void main(String[] args) {
	
		int mark=95;
		MarkValidator m= new MarkValidator();
		m.ispass(mark);
		m.markgrade(mark);
		
	}
 void ispass(int mark)
 {
	 if(mark>=40)
		 System.out.println("Pass");
	 else
		 System.out.println("Fail");
	
 }
 void markgrade(int mark)
 {
	 if(mark>90) {
		 System.out.println("A");
	 }
	 else if(mark>75) {
		 System.out.println("B");
	 }
	 else if(mark>65) {
		 System.out.println("C");
	 }
	 else
		 System.out.println("D");
 }
 
}

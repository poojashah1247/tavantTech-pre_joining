
public class SumOfNumbers {
	public static void main(String[] args) {
	int start= 1, end= 9;
	int i;
	SumOfNumbers n= new SumOfNumbers();
	n.sumOfEvenNumber(start,end);
	n.sumOfOddNumber(start,end);
	
}
	void sumOfEvenNumber(int start,int end)
	{
		int sum=0;
		int i;
		for(i=start;i<end;i=i+2)
		{
			sum=sum+i;
		}
		System.out.println("Even numbers sum is :"+sum);
	}

	void sumOfOddNumber(int start,int end)
	{
		int sum=0;
		int i;
		for(i=start;i<=end;i++)
		{ 
			if(i%2!=0) {
			sum=sum+i;
		}
		}
		System.out.println("Odd numbers sum is :"+sum);
	}

	
}

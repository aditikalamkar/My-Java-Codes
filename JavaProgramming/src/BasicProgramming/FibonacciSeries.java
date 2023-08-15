package BasicProgramming;

public class FibonacciSeries {
	
	public static void main(String [] args)
	{
		int n1 = 0 , n2 = 1;
		System.out.println("Fiboonacci Series till 10 terms :");
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(n1+ " ");
			int n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			
			
		}
	}

}

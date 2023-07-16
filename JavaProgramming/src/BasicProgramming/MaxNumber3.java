package BasicProgramming;

public class MaxNumber3 {
	public static void main(String[] args)
	{
		int n1 = 100 ;
		int n2 = 20 ;
		int n3 = 40 ;
		
		if (n1 > n2 && n1 > n3)
		{
			System.out.println(n1+ " is greater Number");
		}
		else if( n2 > n3)
		{
			System.out.println(n2+ " is greater Number");
		}
		
		else
		{
			System.out.println(n3+ " is greater Number");
		}
	}

}

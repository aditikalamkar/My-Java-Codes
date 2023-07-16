package BasicProgramming;

public class TernaryOper {
	
	public static void main(String args[])
	{
		int n1 = 100 , n2 = 200;
		int res = (n1 > n2) ? (n1 + n2) : (n1 - n2);
		
		System.out.println("First Number" +n1);
		System.out.println("Second Number" +n2);
		System.out.println("Result " +res);
		
		//2
		System.out.println("========");
		int num1 = 10 , num2 = 22;
		int Max = (num1 >= num2 ) ? num1 : num2;
		System.out.println("First Number" +num1);
		System.out.println("Second Number" +num2);
		System.out.println("Maximum Number " +Max);
		
		//3
		System.out.println("========");
		
		boolean condition = true;
		String result = (condition) ? "True" : "False" ;
		
		System.out.println(result);
	}

}

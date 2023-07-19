package BasicProgramming;

class calculator
{
	public int add(int n1, int n2)
	{
		int res = n1 + n2;
		return res;
	}
	
	public int Sub(int n1, int n2)
	{
		int res1 = n1 - n2;
		return res1;
	}
}

public class OOP {
	
	public static void main(String args[])
	{
		int num1 = 10;
		int num2 = 20;
		calculator calc = new calculator();
		int res = calc.add(num1, num2);
		int res1 = calc.Sub(num1, num2);
		System.out.println("Addition " +res);
		System.out.println("Subtraction " +res1);
	}

}

package BasicProgramming;
//Method Overloading with different number of argument
class Number
{
	public int add(int n1, int n2)
	{
		return n1 + n2;
	}
	
	public int add(int n1 , int n2, int n3)
	{
		return n1 + n2 + n3;
	}
}

public class MethodOver2 {
	
	public static void main(String [] args)
	{
		Number obj = new Number();
		int res = obj.add(10, 100);
		int res3 = obj.add(10, 100,14);
		System.out.println("Addition of two numbers :" +res);
		System.out.println("Addition of Three numbers :" +res3);
		
	}

}




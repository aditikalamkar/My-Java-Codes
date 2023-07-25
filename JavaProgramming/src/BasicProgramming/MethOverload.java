package BasicProgramming;
//Method overloading with different data type and same argument no.

class calculator
{
	public int add(int n1 , int n2)
	{
		return n1 + n2;
	}
	
	public double add(double n1, double n2)
	{
		return (n1 + n2);
	}
}
public class MethOverload {
	
	public static void main(String [] args)
	{
		calculator obj = new calculator();
		int res1 = obj.add(20,14);
		double res2 = obj.add(20.14,20.11);
		System.out.println("Addition of Int values : " +res1);
		System.out.println("Addition of double values :" +res2);
		
	}

}

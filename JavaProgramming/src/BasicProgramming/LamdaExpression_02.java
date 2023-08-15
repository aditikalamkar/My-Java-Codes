package BasicProgramming;

@FunctionalInterface

interface TwoPara
{
	int add(int i , int j);
}
public class LamdaExpression_02 {

	public static void main(String[] args) 
	{
		TwoPara obj = (i,j) -> i+j;
		int result = obj.add(5, 8);
		System.out.println("Addition : " +result);

	}

}

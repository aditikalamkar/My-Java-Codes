package BasicProgramming;
@FunctionalInterface

interface OnePara
{
	void show(int i);
}
public class LambdaExpre_01 {

	public static void main(String[] args) 
	{
		OnePara obj = i -> System.out.println("In Lambda Expression " +i);
		obj.show(11);
		

	}

}

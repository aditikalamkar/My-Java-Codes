package BasicProgramming;
class Aa
{
	public Aa()
	{
		super();
		System.out.println("In Aa");
	}
	
	public Aa(int n)
	{
		super();
		System.out.println("In A Int");
	}
}

class Bb extends Aa
{
	public Bb()
	{
		//super(5);
		super();
		System.out.println("In B ");
	}
	public Bb(int n)
	{
		//super(); call default constructor of super class (Here class A)
		//super(n);
		this();   //It calls the constructor of same class;
		System.out.println("In B Int");		
	}
}
public class superKeyword {

	public static void main(String args[])
	{
		Bb obj = new Bb();
	}
}

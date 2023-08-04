package BasicProgramming;
class A
{
	public A()
	{
		super();
		System.out.println("In A");
	}
	
	public A(int n)
	{
		super();
		System.out.println("In A Int");
	}
}

class B extends A
{
	public B()
	{
		//super(5);
		super();
		System.out.println("In B ");
	}
	public B(int n)
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
		B obj = new B();
	}
}

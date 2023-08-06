package BasicProgramming;
class X
{
	public void show()
	{
		System.out.println("In X show");
	}
}

class Y extends X
{
	public void show()
	{
		System.out.println("In Y show");
	}
}

class Z extends X
{
	public void show()
	{
		System.out.println("In Z show");
	}
}
public class DispatchMethod {

	public static void main(String args[])
	{
		X obj = new X();
		obj.show();
		
		obj = new Y();
		obj.show();
		
		obj = new Z();
		obj.show();
	}
}

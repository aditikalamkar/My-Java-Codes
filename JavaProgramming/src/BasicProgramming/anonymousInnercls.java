package BasicProgramming;

class in
{
	public void show()
	{
		System.out.println("In Show !");
	}
}
public class anonymousInnercls {
	
	public static void main(String args[])
	{
		in obj = new in()
		{
			public void show()
			{
				System.out.println("In New Show!");
			}
		};
		obj.show();
	}

}

package BasicProgramming;
abstract class Inner
{
	public abstract void show();
	public abstract void config();
}
public class abstractAmonymousInnercls {

	public static void main(String args[])
	{
		Inner obj = new Inner()
				{
					public void show()
					{
						System.out.println("In show!");
					}
					
					public void config()
					{
						System.out.println("In Config!");
					}
				};
				obj.show();
				obj.config();
	}
}

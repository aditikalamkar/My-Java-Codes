package BasicProgramming;
class xyz
{
	public static pqr pqr;
	int age;
	public void display()
	{
		System.out.println("In Display!");
	}
	
	static class pqr
	{
		public void config()
		{
			System.out.println("In Config!!");
		}
	}
}
public class innerClass {
	public static void main(String args[])
	{
		xyz obj = new xyz();
		obj.display();
		
		xyz.pqr obj1 = new xyz.pqr();
		obj1.config();
	}

}

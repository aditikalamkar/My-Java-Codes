package BasicProgramming;
class a
{
	public void display()
	{
		System.out.println("In A show");
	}
}
public class AnonymousObj {

	public static void main(String args[])
	{
		new a().display(); 		//object Created; .display() call the function
	}
}

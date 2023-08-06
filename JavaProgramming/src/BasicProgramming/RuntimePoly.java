package BasicProgramming;
class Bike
{
	public void run()
	{
		System.out.println("Running...");
	}
}

class Splendor extends Bike
{
	public void run()
	{
		System.out.println("Running Safely with 60km");
	}
}
public class RuntimePoly {
	
	public static void main(String args[])
	{
		Bike b = new Splendor();
		b.run();
	}
}
/* We are calling the run method by the reference variable of parent class.
 * It refers to the subclass object and subclass method overrides the parent class 
 * method, the subclass method is invoked at runtime.
 *  */

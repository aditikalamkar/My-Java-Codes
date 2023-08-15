package BasicProgramming;

abstract class cars
{
	public abstract void drive();
	public abstract void fly();
	public void playMusic()
	{
		System.out.println("Play Music !");
	}
}

abstract class wagnoR extends cars
{
	public void drive()
	{
		System.out.println("Driving...");
	}
}

class UpdatewagonR extends wagnoR
{

	public void fly() {
		System.out.println("Flying...");
		
	}
	
}
public class abstractKey {

	public static void main(string args[])
	{
		cars obj = new UpdatewagonR();
		obj.drive();
		
		obj.playMusic();
	}
}

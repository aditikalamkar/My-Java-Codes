package BasicProgramming;

interface demo_03
{
	//public abstract void show();
	//public abstract void config();
	int age = 20; // variables are final or staic in interface by default
	String area = "India";
	
	void show();
	void config();
}

interface demo_04
{
	void run();
}

interface demo_05 extends demo_04
{
	
}

class practice_01 implements demo_03 , demo_04
{

	public void show() 
	{
		System.out.println("In show..");
	}

	public void config() 
	{
		System.out.println("In config..");		
	}
	
	public void run() 
	{
		System.out.println("Running...");		
	}
	
}


public class Interface_03 {

	public static void main(String[] args) 
	{
		demo_03 obj = new practice_01();
		obj.show();
		obj.config();
		
		demo_04 obj1 = new practice_01();
		obj1.run();
	}
}



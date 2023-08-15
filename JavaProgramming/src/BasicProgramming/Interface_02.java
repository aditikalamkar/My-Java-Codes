package BasicProgramming;

interface demo_02
{
	//public abstract void show();
	//public abstract void config();
	int age = 20; // variables are final or staic in interface by default
	String area = "India";
	
	void show();
	void config();
}

class practice implements demo_02
{

	public void show() 
	{
		System.out.println("In show..");
	}

	public void config() 
	{
		System.out.println("In config..");		
	}
	
}
public class Interface_02 {

	public static void main(String[] args) 
	{
		demo_02 obj = new practice();
		obj.config();
		obj.show();
	}

}

package BasicProgramming;

interface computer {
	
	void code();
}

class laptop implements computer
{
	public void code()
	{
		System.out.println("Code, Compile, run..");
	}
}

class Desktop implements computer
{
	public void code()
	{
		System.out.println("Code, Compile, run.. Faster!!");
	}
}

class Developer
{
	//public void devApp (laptop lap)
	public void devApp(computer lap)
	{
		lap.code();
	}
}
public class Intterface_01 {

	public static void main(String[] args) {
		
		//laptop lap = new laptop();
		//Desktop desk = new Desktop();
		
		computer lap = new laptop();
		computer desk = new Desktop();
		
		Developer Aditi = new Developer();
		Aditi.devApp(lap);
		Aditi.devApp(desk);
		

	}

}

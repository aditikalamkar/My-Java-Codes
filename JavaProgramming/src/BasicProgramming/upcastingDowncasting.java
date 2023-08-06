package BasicProgramming;
class upcasting
{
	public void show1()
	{
		System.out.println("In A Show");
	}
}

class downcasting extends upcasting
{
	public void show2()
	{
		System.out.println("In B Show");
	}
}
public class upcastingDowncasting {

	public static void main(String args[])
	{
//		upcasting obj1= new upcasting();
//		upcasting obj11 = (upcasting)new(downcasting);		//Upcasting
//		obj1.show1();
		
		upcasting obj = new downcasting();
		obj.show1();
		downcasting obj1 = (downcasting) obj;		//Downcasting
		obj1.show2();
	}
	
}

package BasicProgramming;

class Watch
{
	String brand;
	int price;
	static String name;
	
	public void show()
	{
		System.out.println(brand +":"+price +":"+name);
	}
	
	public static void show1()
	{
		System.out.println("In Static Method!");
		//System.out.println(obj.brand +":"+obj.price +":"+obj.name);
	}
}
public class static_Method_02 {

	public static void main(String[] args) {
		
		Watch obj1 = new Watch();
		obj1.brand = "Rollex";
		obj1.price = 1200;
		Watch.name = "Titan";
		
		Watch obj2 = new Watch();
		obj2.brand = "";
		obj2.price = 1200;
		Watch.name = "Titan";
		
		obj1.show();
		obj2.show();
		
		
	}

}

package BasicProgramming;

class Mobile
{
	String brand;
	int price;
	String name;
	
	public void show()
	{
		System.out.println(brand+ ": " + name +":" + price);
	}
}
public class Static_var {
	
	public static void main(String [] args)
	{
		Mobile obj1 = new Mobile();
		obj1.brand = "Apple";
		obj1.price = 20000;
		obj1.name = "Smartphone";
		
		Mobile obj2 = new Mobile();
		obj2.brand = "Samsung";
		obj2.price = 25000;
		obj2.name = "Smartphone";
		
		obj1.name = "Phone";
		obj1.show();
		obj2.show();
	}

}

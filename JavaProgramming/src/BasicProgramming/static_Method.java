package BasicProgramming;
class bbike
{
	String brand;
	int price;
	static String name;
	
	static
	{
		name = "Phone";
		System.out.println("In Static Method!");
	}
	
	public bbike()
	{
		brand = " ";
		price = 200;
		System.out.println("In Constructor");
	}
	
	public void show()
	{
		System.out.println(brand + " : " + price + " : " + name);
	}
}
public class static_Method {
	
	public static void main(String [] args)
	{
		bbike obj = new bbike();
		obj.brand = "Creata";
		obj.price = 1500000;
		
		bbike.name = "AURA";
		//Car.price = 5000;  ERROR!
		//Cannot make a static reference to the non-static
		//field Car.price
	}

}

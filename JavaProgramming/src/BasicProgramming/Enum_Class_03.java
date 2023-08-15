package BasicProgramming;

enum laptops
{
	Mackbook(2000) , XPS(2200), Surface , ThinlPad(1800);
	
	private int price;

	private laptops()
	{
		price = 500;
	}
	
	private laptops(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
		System.out.println(("In Laptop " +":" +this.name()));
	}
}
public class Enum_Class_03 {
	
	public static void main(String args[])
	{
		for(laptops lap : laptops.values())
		{
			System.out.println(lap +":"+ lap.getPrice());
		}
	}

}

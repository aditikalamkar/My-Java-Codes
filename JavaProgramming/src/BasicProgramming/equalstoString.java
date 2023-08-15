package BasicProgramming;

import java.util.Objects;

class Laaptop
{
	String model;
	int price;
	
	@Override
	public String toString()
	{
		return "Laptop [model=" + model + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(model, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laaptop other = (Laaptop) obj;
		return Objects.equals(model, other.model) && price == other.price;
	}
	
	
	
}
public class equalstoString {

	public static void main(String args[])
	{
		Laaptop obj1 = new Laaptop();
		obj1.model = "Lenevo";
		obj1.price = 10000;
		
		Laaptop obj2 = new Laaptop();
		obj2.model = "Lenevo";
		obj2.price = 10000;
		
		boolean result = obj1.equals(obj2);
		System.out.println(obj1.toString());
	}
}

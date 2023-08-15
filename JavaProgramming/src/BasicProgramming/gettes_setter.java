package BasicProgramming;

class People
{
	private int age;
	private String name;
	
	public People()
	{
		age = 12;
		name = "Aditi";
		System.out.println("In constructor");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	
}
public class gettes_setter {

	public static void main(String[] args) throws ClassNotFoundException
	{
		People obj1 = new People();
		People obj2 = new People();
		System.out.println(obj1.getName() + ":" +obj1.getAge());
		obj1.setAge(30);
		obj2.setName("Aditi");
	}

}

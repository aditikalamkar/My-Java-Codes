package BasicProgramming;
class person
{
	String name;
	int age;
	
	public person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void display()
	{
		System.out.println("Name :" +name +", Age:" +age);
	}
}
public class AnonyObject {

	public static void main(String args[])
	{
		new person("Aditi" ,20).display();
		new person("Achal" ,19).display();
		//anonymous object can't be reuse
	}
}

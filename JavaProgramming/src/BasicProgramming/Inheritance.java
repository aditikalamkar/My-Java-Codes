package BasicProgramming;
class Empolyee
{
	float salary = 400000;
}

class programmer extends Empolyee
{
	int bonous = 10000;
}
public class Inheritance {

	public static void main(String args[])
	{
		programmer obj = new programmer();
		System.out.println("Programmer Salary is:" +obj.salary);
		System.out.println("Bonus of programmer is:" +obj.bonous);		
	}
}

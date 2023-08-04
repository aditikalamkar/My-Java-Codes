package BasicProgramming;
class override
{
	public int add(int n1 , int n2)
	{
		return n1+n2;
	}
}

class Advoverride
{
	public int add(int n1 , int n2)
	{
		return n1+n2+1;
	}
}

public class MethodOverriding {

	Advoverride obj = new Advoverride();
	int r1 = obj.add(5, 4);
	//.System.LoggerFin
	System.out.println(r1);
	
}

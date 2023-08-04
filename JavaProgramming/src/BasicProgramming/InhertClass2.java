package BasicProgramming;
class calc
{
	public int add(int n1, int n2)
	{
		return n1 + n2;
	}
	
	public int sub(int n1, int n2)
	{
		return n1 - n2;
	}
}

class Advacalc extends calc
{
	public int multi(int n1, int n2)
	{
		return n1 * n2;
	}
	
	public int div(int n1, int n2)
	{
		return n1 / n2;
	}
}

public class InhertClass2 {
	
	public static void main(String args[])
	{
		Advacalc obj = new Advacalc();
		int r1 = obj.add(20,11);
		int r2 = obj.add(2,1);
		int r3 = obj.add(5,6);
		int r4 = obj.add(20,100);
		
		System.out.println(r1 +" " +r2);
	}

}

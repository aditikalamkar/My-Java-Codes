package BasicProgramming;
@FunctionalInterface

interface example
{
	void show();
}
public class Annotation_02 {

	public static void main(String[] args)
	{
		example obj = new example()
		{
			public void show()
			{
				System.out.println("In show !");
			}
		};
		obj.show();
	}

}

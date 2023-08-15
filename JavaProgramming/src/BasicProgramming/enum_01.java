package BasicProgramming;

enum Status
{
	Running , Failed , Pending , Success;
}
public class enum_01 
{
	public static void main(String args[])
	{
//		Status s1 = Status.Running;
//		Status s2 = Status.Failed;
//		Status s3 = Status.Pending;
//		Status s4 = Status.Success;
		
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s.ordinal());
		
		Status [] ss = Status.values();
		System.out.println(ss);
		
		for(Status s1 : ss)
		{
			
			//System.out.println(s1);
			System.out.println(s1 + " : " +s1.ordinal());
		}
		
	}

}

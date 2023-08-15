package BasicProgramming;
enum status_01
{
	Running , Failed , Pending , Success;
}
public class enum_02 {

	public static void main(String args[])
	{
		//status_01 s = status_01.Pending;
		status_01 s = status_01.Success;
		switch(s)
		{
		case  Running : 
			System.out.println("All Good");
			break;
			
		case  Failed : 
			System.out.println("Try Again!");
			break;
			
		case  Pending : 
			System.out.println("Please Wait");
			break;
			
		default:
			System.out.println("Done!");
			break;
		}
		
		if(s == status_01.Running)
			System.out.println("All Good");
		else if(s == status_01.Failed)
			System.out.println("Try Again!");
		else if(s == status_01.Pending)
			System.out.println("Please Wait");
		else
			System.out.println("Done!");			
		
	}
}

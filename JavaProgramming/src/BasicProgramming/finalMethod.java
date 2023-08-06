package BasicProgramming;
class vehical
{  
//	  final void run()
//	  {
//		  System.out.println("running");
//	  }  
}  
	     
class Honda extends vehical
{  
   void run()
   {
	   System.out.println("running safely with 100kmph");
   }  
}
public class finalMethod 
{
	public static void main(String args[])
	{  
		   Honda honda= new Honda();  
		   honda.run();  
    }  
}
//Error because  method as final,cannot override it.
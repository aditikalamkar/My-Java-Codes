//Final variable
/*The final keyword is a non-access 
 * modifier used for classes, attributes and methods,
 *  which makes the non-changeable (impossible to inherit or override)
 */
package BasicProgramming;
class car 
{
	final int SpeedLimit = 180; 
	public  void run()
	{
		//SpeedLimit = 200;
	}
}
public class FinalKeyword {
	
	public static void main(String args[])
	{
		car obj = new car();
		obj.run();
		
	}
	
	//Compile time error

}

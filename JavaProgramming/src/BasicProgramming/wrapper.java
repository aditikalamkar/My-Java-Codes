package BasicProgramming;

public class wrapper {

	public static void main(String args[])
	{
		int num = 7;
//		Integer num1 = new Integer(8);
//		Integer num1 = 8;
//		Integer num1 = new Integer (num);   //Boxing
		
		Integer num1 = num; 		//Autoboxing
		int num2 = num1.intValue();
		System.out.println(num2);
		
		String str = "12";
		int num3 = Integer.parseInt(str);
		System.out.println(num3+2);
		
	}
}

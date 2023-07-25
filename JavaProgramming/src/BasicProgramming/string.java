package BasicProgramming;

public class string {
	
	public static void main(String args[])
	{
		String name = new String("Aditi") ;
		System.out.println(name);
		
		System.out.println("Hello " + name);
		
		String last_name = " Kalamkar";
		String myString = name + last_name;
		System.out.println(myString);
		
		System.out.println(name.hashCode());
		System.out.println(name.charAt(2));
		
		System.out.println(name.concat(" kalamkar"));
		}
}

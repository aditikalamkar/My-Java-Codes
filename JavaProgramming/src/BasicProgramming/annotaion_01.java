package BasicProgramming;
@Deprecated
class Annotation 
{
	public void showTheDataWhichBelongsToThisClass()
	{
		System.out.println("In Show A!");
	}
}

class AnnotationEx extends Annotation 
{
	@Override
	public void showTheDataWhichBelongsToThisClass()
	{
		System.out.println("In Show B!");
	}
}
public class annotaion_01 {

	public static void main(String[] args)
	{
		AnnotationEx obj = new AnnotationEx();
		obj.showTheDataWhichBelongsToThisClass();

	}

}

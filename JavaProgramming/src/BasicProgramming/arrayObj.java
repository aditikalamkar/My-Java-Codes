package BasicProgramming;
class Student
{
	int rollno;
	String name;
	int marks;
}
public class arrayObj {

	public static void main(String args[])
	{
		Student s1 = new Student();
		s1.rollno = 1;
		s1.name = "Aditi";
		s1.marks = 99;
		
		Student s2 = new Student();
		s2.rollno = 2;
		s2.name = "Harsh";
		s2.marks = 52;
		
		Student s3 = new Student();
		s3.rollno = 3;
		s3.name = "Navin";
		s3.marks = 85;
		
		Student Students[] = new Student[3];
		Students[0] = s1;
		Students[1] = s2;
		Students[2] = s3;
		
//		for(int i=0; i<Students.length; i++)
//		{
//			System.out.println(Students[i].name + " : " +Students[i].marks);
//		}
		
//		Enhanced for loop
		
		for(Student stud :Students)
		{
			System.out.println(stud.name + " : " +stud.marks);
		}
	}
}

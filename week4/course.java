import java.util.*;

class Person
{
	String name;
	String Address;

	Person(String name,String Address)
	{
		this.name="";
		this.Address="";
	}

	String getName()
	{
		return this.name;
	}

	String getAddress()
	{
		return this.Address;
	}
};

class Student extends Person
{
	int numCourses=0;
	ArrayList courses<String> =new ArrayList<> ();

	Student(String name,String Address)
	{
		this.name=name;
		this.Address=Address;
	}


	void addCourseGrade(String course,int grade)
	{

	}

	void pringGrades()
	{
		System.out.println("Grade is: "+)
	}
}

class Teacher extends Person
{
	int numCourses=0;
	ArrayList courses<String> =new ArrayList<>();

	Teacher(String name,String Address)
	{
		this.name=name;
		this.Address=Address;
	}

	boolean addCourse(String course)
	{
		
	}

	boolean removeCourse(String course)
	{
		
	}
}

class Main
{
	public static void main(String args[])
	{
		Scanner sc==new Scanner(System.in);

		Person p=new Person();
		Student s=new Student();
		Teacher t=new Teacher();

		
	}
}
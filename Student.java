public class Student
{
	// add student attributes here
	// set this attributes private and use set/get function to operate these attributes

	private String name;
	private int age;
	private double gpa;

	public Student(String name,int age,double gpa)
	{
		setName(name);
		setAge(age);
		setGpa(gpa);
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return this.name;
	}

	public void setGpa(double gpa)
	{
		this.gpa = gpa;
	}

	public double getGpa()
	{
		return this.gpa;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public int getAge()
	{
		return this.age;
	}
}
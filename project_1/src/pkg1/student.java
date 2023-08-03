package pkg1;

public class student 
{
int rollNo,age;
	public void display1()
	{
		System.out.println("welcome to all of you");
	}
	public void display2()
	{
		System.out.println("automation is very eassy");
	}
	public static void main(String[] args) 
	{
		student abc=new student();
		abc.rollNo=1524;
		abc.age=17;
		System.out.println(abc.rollNo);
		System.out.println(abc.age);
		abc.display1();
		abc.display2();
	}
}

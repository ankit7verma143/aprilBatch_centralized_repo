package pkg1;

public class assignment2 
{
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
//		System.out.println("sum result is "+c);
		return c;
	}
	public int sub(int a, int b)
	{
		int c;
		c=a-b;
//		System.out.println("sub result is "+c);
		return c;
	}
	public int multi(int a, int b)
	{
		int c;
		c=a*b;
//		System.out.println("multi result is "+c);
		return c;
	}
	public int div(int a, int b)
	{
		int c;
		c=a/b;
//		System.out.println("div result is "+c);
		return c;
	}
	public static void main(String[] args) {
		assignment1 abc= new assignment1();
		int result1=abc.multi(10, 2);
		System.out.println("first bracket result is "+result1);
		int result2=abc.sum(result1, 2);
		System.out.println("second bracket result is "+result2);
		int result3=abc.sub(result2, 2);
		System.out.println("third bracket result is "+result3);
		int result4=abc.sub(result3, 2);
		System.out.println("fourth bracket result is "+result4);
		int result5=abc.div(result4, 2);
		System.out.println("final result is "+result5);
		
	}
}



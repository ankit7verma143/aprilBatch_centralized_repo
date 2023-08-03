package pkg1;

public class newclass 
{
	public int sum(int a, int b)
	{
		int r;
		r=a+b;
		System.out.println("sum result is "+r);
		return r;
	}
	public int sub(int a1, int a2)
	{
		int a3,
		a3=a1-a2;
		System.out.println("sub result is "+a3);
		return a3;
	}
	public void multi (int s1, int s2)
	{
		int result;
		result=s1*s2;
		System.out.println("multi result is "+result);
	}
	public static void main(String[] args) 
	{
		deepak obj=new deepak();
		int sumresult=obj.sum(10, 2);
		int subresult=obj.sub(10, 2);
		obj.multi(sumresult, subresult);
	}
}

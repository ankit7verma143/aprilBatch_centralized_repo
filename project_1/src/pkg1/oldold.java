package pkg1;

import java.util.Scanner;

public class oldold 
{
	public static void main(String[] args) 
	{
		System.out.println("please enter max value");
		Scanner s=new Scanner(System.in);
		int max=s.nextInt();
		if(max>0)
		{
			for(int i=1;i<=max;i=i+1)
			{
				System.out.println(i);
			}
		}
	}
}

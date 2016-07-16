package basicIterationsAndArrays_PPS;

import java.util.Scanner;

public class P3 {
	public int sumOfOdd(int a[])
	{
		int soo=0;
		for(int i=0;i<a.length;i=i+2)
		{
			soo+=a[i];
		}
		return soo;
	}
	public int sumOfEven(int a[])
	{
		int soe=0;
		for(int i=1;i<a.length;i=i+2)
		{
			soe+=a[i];
		}
		return soe;
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		P3 p=new P3();
		int s=p.sumOfEven(a),s1=p.sumOfOdd(a);
		System.out.println("Sum of even is:"+s);
		System.out.println("Sum of odd is:"+s1);
		in.close();
	}
}

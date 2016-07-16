package basicIterationsAndArrays_PPS;

import java.util.Scanner;

public class P1 {
	public static void main(String args[])
	{
		Scanner in =new Scanner (System.in);
		System.out.println("Enter the number of inputs");
		int n=in.nextInt();
		int max=-999;
		System.out.println("Enter "+n+" Numbers");
		for(int i=0;i<n;i++)
		{
			int a=in.nextInt();
			if(a>max)max=a;
		}
		System.out.println("Max is "+max);
		in.close();
	}
}

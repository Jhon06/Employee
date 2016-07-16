package basicIterationsAndArrays_PPS;

import java.util.Scanner;

public class P2 {
	public int Ascending(String s)
	{
		for(int i=0;i<s.length()-1;i++)
		{
			char ch=s.charAt(i);
			char ch1=s.charAt(i+1);
			if((ch+1)==ch1)
			{
				continue;
			}
			else {
				return -1;
			}
		}
		return 1;
	}
	public static void main(String args[])
	{
		Scanner in =new Scanner (System.in);
		String s=new String();
		s=in.next();
		P2 p=new P2();
		System.out.println(p.Ascending(s));
		in.close();
	}
}

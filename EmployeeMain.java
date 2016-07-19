package inheritanceAndPolymorphism;

import java.util.Scanner;

public class EmployeeMain {
	Employee a[];
	EmployeeMain(int n)
	{
		a=new Employee[n];
		
	}
	public void sort_salary()
	{
		Employee temp;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[i].getSalary()>a[i+1].getSalary())
				{
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
	}
	public boolean search(int empId)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i].getEmpNo()==empId)
			{
				return true;
			}
		}
		return false;
	}
	public void inputData()
	{
		Scanner in=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter employee name\n");
			String name=new String();
			name=in.next();
			a[i].setName(name);
			System.out.println("Enter employee number\n");
			int num=in.nextInt();
			a[i].setEmpNo(num);
			System.out.println("Enter employee designation\n");
			String d=in.next();
			a[i].setDegnisation(d);
			System.out.println("Enter employee bloodgroup\n");
			String b=in.next();
			a[i].setBloodgroup(b);
			System.out.println("Enter employee salary\n");
			int s=in.nextInt();
			a[i].setSalary(s);
		}
	in.close();
	}
	public void display()
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter employee name/n"+a[i].getName());
			System.out.println("Enter employee number/n"+a[i].getEmpNo());
			System.out.println("Enter employee designation/n"+a[i].getDegnisation());
			System.out.println("Enter employee bloodgroup/n"+a[i].getBloodgroup());
			System.out.println("Enter employee salary/n"+a[i].getSalary());
		}
	}
	public static void main(String args[])
	{
		System.out.println("Enter the number of Employees");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		EmployeeMain e=new EmployeeMain(n);
		e.inputData();
		e.sort_salary();
		e.display();
		in.close();
	}
	
}


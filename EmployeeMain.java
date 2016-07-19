
import java.util.Scanner;

public class EmployeeMain {
	Employee a[];
	public void sort_salary(Employee a[])
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
	public boolean search(int empId,Employee a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i].getEmpNo()==empId)
			{
				System.out.println("Enter employee name:	"+a[i].getName());
				System.out.println("Enter employee number:	"+a[i].getEmpNo());
				System.out.println("Enter employee designation:	"+a[i].getDegnisation());
				System.out.println("Enter employee bloodgroup:	"+a[i].getBloodgroup());
				System.out.println("Enter employee salary:	"+a[i].getSalary());
				return true;
			}
		}
		return false;
	}
		public void display(Employee a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter employee name:	"+a[i].getName());
			System.out.println("Enter employee number:	"+a[i].getEmpNo());
			System.out.println("Enter employee designation:	"+a[i].getDegnisation());
			System.out.println("Enter employee bloodgroup:	"+a[i].getBloodgroup());
			System.out.println("Enter employee salary:	"+a[i].getSalary());
		}
	}
	public static void main(String args[])
	{
		System.out.println("Enter the number of Employees");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		EmployeeMain e=new EmployeeMain();
		Employee e1=new Employee();
		e.a=new Employee[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter employee name");
			String name=new String();
			name=in.next();
			System.out.println("Enter employee number");
			int num=in.nextInt();
			System.out.println("Enter employee designation");
			String d=in.next();
			System.out.println("Enter employee bloodgroup");
			String b=in.next();
			System.out.println("Enter employee salary");
			int s=in.nextInt();
			e1.setBloodgroup(b);
			e1.setDegnisation(d);
			e1.setEmpNo(num);
			e1.setName(name);
			e1.setSalary(s);
			e.a[i]=e1;
			e1=new Employee();
		}
		char ch='f';
		int m=0;
		while(ch!='t'){
			System.out.println("Enter 1 to display ,2 to search , 3 to sort according to salary and 4 to exit");
			m=in.nextInt();
			if(m==1){
				e.display(e.a);
			}
			else if(m==2){
				System.out.println("Enter the empId");
				int empId=in.nextInt();
				System.out.println(e.search(empId, e.a));
			}
			else if(m==3)
			{
				e.sort_salary(e.a);
			}
			else if(m==4)
			{
				ch='t';
			}
		}
			in.close();
	}
	
}


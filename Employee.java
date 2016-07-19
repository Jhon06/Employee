package inheritanceAndPolymorphism;

public class Employee {
	Employee()
	{
		name="";
		empNo=0;
		degnisation="";
		bloodgroup="";
		salary=-1;
	}
	Employee(String name,int empNo,String d,String blo,int s)
	{
		this.name=name;
		this.empNo=empNo;
		degnisation=d;
		bloodgroup=blo;
		salary=s;
	}
	private String name;
	private int empNo;
	private String degnisation;
	private String bloodgroup;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getDegnisation() {
		return degnisation;
	}
	public void setDegnisation(String degnisation) {
		this.degnisation = degnisation;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}

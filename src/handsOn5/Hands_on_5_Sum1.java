package handsOn5;
class Employee{      // base class
	protected String empId;
	protected String empName;
	protected double baseSalary;
	
	Employee(String empId, String empName , double baseSalary){    // base class constructor
		this.empId=empId;
		this.empName=empName;
		this.baseSalary=baseSalary;
	}
	
	public String getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public double calculateSalary() {
		return baseSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", baseSalary=" + baseSalary + ",Salary="+calculateSalary()+"]";
	}
}

class PermanentEmployee extends Employee{       // derived class
	double bonus;
	
	PermanentEmployee(String empId, String empName,double baseSalary, double bonus) {
		super(empId,empName,baseSalary);
		this.bonus=bonus;
	}
	
	public double calculateSalary() {
		return  baseSalary+bonus;
	}
	
	
}

class  ContractEmployee extends Employee{     // derived class
	double taxRate;
	double serviceCharge;
	
	ContractEmployee(String empId, String empName, double baseSalary, double taxRate, double serviceCharge) {
		super(empId,empName,baseSalary);
		this.taxRate=taxRate;
		this.serviceCharge=serviceCharge;
	}
	
	public double calculateSalary() {
		return baseSalary - (baseSalary * taxRate) - serviceCharge; 
	}	
	
	
}

class Intern extends Employee{    //derived class
	double stipend;
	Intern(String empId, String empName, double stipend) {
		super(empId,empName,0);
		this.stipend=stipend;
	}
	
	public double calculateSalary() {
		return stipend;      
	}
	
}
public class Hands_on_5_Sum1 {
	public static void main(String[] args) {
		System.out.println("Employee's PermanentSalary details:");
		Employee e=new PermanentEmployee("1001", "jivi",15000, 500);
		System.out.println(e.toString());
		
		System.out.println("\nEmployee's ContractSalary details:");
		Employee e1=new ContractEmployee("1002", "divi", 150000, 0.10, 500);
		System.out.println(e1.toString());
		
		System.out.println("\nEmployee's InternSalary details:");
		Employee e2= new Intern("1003","elams",50000);
		System.out.println(e2.toString());
	}

}

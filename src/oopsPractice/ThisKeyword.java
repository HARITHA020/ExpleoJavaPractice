package oopsPractice;
class Employee_sheet{
	int empid;
	String empName;
	double empSalary;
	
	// 1. Using 'this' to refer the instance variable
	Employee_sheet(int empid,String empName,double empSalary) {
		this.empid=empid;
		this.empName=empName;
		this.empSalary=empSalary;
		System.out.println("Employee record created Succesfully");
	}
	
	//2 .Using 'this' to call another constructor chaining
	Employee_sheet(){
		this(0, "haritha", 30000);
		System.out.println("default constructor called - initialized with default data \n");
	}
	
	// 3.Using 'this' to call another method in the same class
	void registerEmployee() {
		System.out.println("Registering Employee:");
		this.displayDetails();
	}
	
	void displayDetails() {
		System.out.println("Employee ID:"+empid);
		System.out.println("Emmployee Name:"+empName);
		System.out.println("Employee Salary:"+empSalary);
	}
	
	// 4.USing 'this' to pass current object as an argument
	void sendForPrpcessing() {
		HRDepartment HR = new HRDepartment();
		HR.processEmployee(this);
	}
	 
	//5. Using 'this' to return current object (method Chaining)
	Employee_sheet updateSalary(double hike) {
		this.empSalary=empSalary+ (empSalary*hike/100);
		return this;
	}
	Employee_sheet updateName(String newName) {
		this.empName=newName;
		return this;
	}
}

//Helper class representing another department
class HRDepartment{
	void processEmployee(Employee_sheet e) {
		System.out.println(("\nHR Department processing employee:"));
		System.out.println("processed Employee:"+e.empName+" with salary:"+e.empSalary+"\n");
	}
}

public class ThisKeyword {
	public static void main(String[] args) {
		
		// calls default constructor -> internally calls parameterized constructor
		Employee_sheet emp=new Employee_sheet();
		
		//1 and 2 demonstrated through constructor chaining
		emp.registerEmployee(); // calling method using 'this'
		
		// 4.passing current object to another class
		emp.sendForPrpcessing();
		
		//5.method chaining to update details
		System.out.println(("-- Updating employee Details---"));
		emp.updateName("Dhanushiya").updateSalary(15.5).displayDetails();
		
		//passing again after update
		emp.sendForPrpcessing();
		
	}

}

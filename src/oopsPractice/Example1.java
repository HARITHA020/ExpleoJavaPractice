package oopsPractice;
class Employee{
	int empID;
	String EmpName;
	public void setEmpDetails(int empID,String EmpName){
		this.empID=empID;
		this.EmpName=EmpName;
	}
	public void getEmpDetails() {
		System.out.println("Employee ID:"+empID);
		System.out.println("Employee Name:"+EmpName);
	}
}
public class Example1 {
	public static void main(String[] args) {
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		
		emp1.setEmpDetails(1, "dhanushiya");
		emp2.setEmpDetails(2, "Haritha");
		
		emp1.getEmpDetails();
		emp2.getEmpDetails();

	}

}

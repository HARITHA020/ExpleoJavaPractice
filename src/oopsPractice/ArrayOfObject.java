package oopsPractice;
class Employee1{
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
public class ArrayOfObject {

	public static void main(String[] args) {
		Employee1 emp[]=new Employee1[2];
		for(int i=0;i<2;i++) {
			emp[i]=new Employee1();
		}
		emp[0].setEmpDetails(1, "Dhanushiya");
		emp[0].getEmpDetails();
		
		emp[1].setEmpDetails(2, "Haritha");
		emp[1].getEmpDetails();

	}

}

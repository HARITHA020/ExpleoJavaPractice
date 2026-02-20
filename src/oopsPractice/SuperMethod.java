package oopsPractice;
class ProjectLeader1{
	String proLeadNAme="Haritha";
	int empID=1;
	
	void displayData() {
		System.out.println("the porleader Name: "+proLeadNAme);
		System.out.println("the leader EmpID: "+empID);
	}
}

class Programmer1 extends ProjectLeader1{
	
	String progName;
	int empID;
	
	void setData(String name, int id) {
		progName=name;
		empID=id;
	}
	
	    void Display() {
		super.displayData();  /// access base class methods using super
		System.out.println("the programmer Name: "+progName);
		System.out.println("the programmer ID: "+empID);
	}
}

public class SuperMethod {
	public static void main(String[] args) {
		Programmer1 programmer=new Programmer1();
		programmer.setData("dhushiya", 1);
		programmer.Display();

	}

}

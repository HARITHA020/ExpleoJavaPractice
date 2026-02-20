package oopsPractice;
class ProjectLeader{
	String proLeadNAme="Haritha";
	int empID=1;
}

class Programmer extends ProjectLeader{
	
	String progName;
	int empID;
	
	void setData(String name, int id) {
		progName=name;
		empID=id;
	}
	
	    void Display() {
		System.out.println("The proleader Name: "+super.proLeadNAme);
		System.out.println("The employee ID: "+super.empID);    /// access base class variable using super
		System.out.println("the programmer Name: "+progName);
		System.out.println("the programmer ID: "+empID);
	}
}


public class SuperKeyword {

	public static void main(String[] args) {
		Programmer programmer= new Programmer();
		programmer.setData("dhanushiya", 1);
		programmer.Display();

	}

}

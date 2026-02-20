package polymorphism_handsOn;
class Person{
	String name;
	public void setName(String name) {
		this.name = name;
	}

	String address;
	
	Person(String name, String address){
		this.name=name;
		this.address=address;
	}
   
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}
	
	 @Override
		public String toString() {
			return "Person [name=" + name + ", address=" + address + "]";
		}
}

class Student extends Person{
	String program;
	int year;
	double fee;
	public Student(String name, String address, String  program, int year, double fee) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Student: [program=" + program + ", year=" + year + ", fee=" + fee + ", name=" + name + ", address="
				+ address + "]";
	}
	
}

class Staff extends Person{
	String School;
	double pay;
	public Staff(String name, String address, String school, double pay) {
		super(name,address);
		School = school;
		this.pay = pay;
	}
	public String getSchool() {
		return School;
	}
	public void setSchool(String school) {
		School = school;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	@Override
	public String toString() {
		return "Staff: [School=" + School + ", pay=" + pay + ", name=" + name + ", address=" + address + "]";
	}
	
}
public class Sum1 {
	public static void main(String[] args) {
		
		Student student=new Student("Haritha","Tn nagar","java", 2001,500);
		System.out.println("the student details: ");
		System.out.println(student.toString());
		Staff staff=new Staff("prema", "saradha clg road", "kongu matric school", 8000.0);
		System.out.println("the staff details: ");
		System.out.println(staff.toString());
	}

}

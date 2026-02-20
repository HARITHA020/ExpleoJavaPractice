package handsOn4;

import java.time.LocalTime;
import java.util.Scanner;

class EmployeeAttendance{
	private int empid;
	private String empName;
	private Attendance attendance;
	
	EmployeeAttendance(int empid,String empName){
		this.empid=empid;
		this.empName=empName;
		this.attendance = new Attendance(empid,empName);
	}
	
	public void checkIn() {
		attendance.checkIn();
	}
	
    public void checkOut() {
		attendance.checkOut();
	}
    
    public Attendance getAttendance() {   
        return attendance;
    }
}

class Attendance{
	private int empid;
	private String empName;
	private  LocalTime checkIn;
	private  LocalTime checkOut;
	private boolean ischeckedIn=false;
	private boolean ischeckedOut=false;
	private EmployeeAttendance empAttendance;
	public Attendance(int empid,String empName) {
		this.empid=empid;
		this.empName=empName;
	}
	
    public  void checkIn() {
    	if (!ischeckedIn) {
            checkIn = LocalTime.now();
            ischeckedIn = true;
            System.out.println("Check-in successful.");
        } else {
            System.out.println("Error: Already checked in.");
        }
	}
	
    public void checkOut() {
        if (!ischeckedIn) {
            System.out.println("Error: Cannot check out without check-in.");
        } else if (ischeckedOut) {
            System.out.println("Error: Already checked out.");
        } else {
            checkOut = LocalTime.now();   
            ischeckedOut = true;
            System.out.println("Check-out successful.");
        }
    }

    
    public Attendance getAttendanceDetails() {
		return this;
    }
    
    public void displayDetails() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Name:"+empName);
        System.out.println("Check-in Time: " + checkIn);
        System.out.println("Check-out Time: " + checkOut);
    }
}

public class Hands_on_4_sum2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the count of employee:");
		int n=input.nextInt();
		input.nextLine();
		 
		for(int i=1;i<=n;i++) {
			System.out.println("enter the employee "+i+"name:");
			String name=input.nextLine();
			EmployeeAttendance empAttendance=new EmployeeAttendance(i, name);
			empAttendance.checkIn();
			empAttendance.checkOut();
			Attendance att = empAttendance.getAttendance(); 
            att.displayDetails();
            
            System.out.println("----------------");
		}
		
		
	}

}

package functionHandsOn;
import java.util.*;
public class Hands_on_3_eSum3 {
	public static int calculateNewSalary(int oldSalary, int hike) {
		
		int newSalary=oldSalary+(oldSalary*hike/100);
		return newSalary;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the old salary:");
		int oldSalary=input.nextInt();
		
		System.out.println("enter the hike value;");
		int hike=input.nextInt();
		
		int res=calculateNewSalary(oldSalary,hike);
		System.out.println("the new salary is:"+res);
		input.close();
	}

	

}

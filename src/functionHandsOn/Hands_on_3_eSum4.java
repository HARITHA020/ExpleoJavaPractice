package functionHandsOn;
import java.util.*;
public class Hands_on_3_eSum4 {
	public static boolean eligeble(int age) {
		
		if(age>=18) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the age:");
		int age=input.nextInt();
		boolean res=eligeble(age);
		
		if(res==true) {
			System.out.println("person is eligible for vote");
		}
		else {
			System.out.println("person is not eligible for vote");
		}
		input.close();
	}
}

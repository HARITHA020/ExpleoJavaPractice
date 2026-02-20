package controlFlowHandsOn;
import java.util.*;
public class Hands_on_1_sum1 {
	public static void main(String args[]) {
	Scanner input=new Scanner(System.in);
	int emp_id=input.nextInt();
	int wages=input.nextInt();
	int days=input.nextInt();
	int total=wages*days;
	System.out.println("Todat salary:"+total);
	input.close();
	}
}

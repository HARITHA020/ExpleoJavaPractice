package controlFlowHandsOn;
import java.util.*;
public class Hands_on_1_mSum7 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int salary=input.nextInt();
		int gross_salary=0,hra=0,da=0;
		if(salary<=1000) {
			hra=salary*20/100;
			da=salary*80/100;
		}
		else if(salary>=1001 && salary<=2000) {
			hra=salary*25/100;
			da=salary*90/100;
		}
		else {
			hra=salary*30/100;
			da=salary*95/100;
		}
		gross_salary=salary+hra+da;
		System.out.println("the salary is:"+salary);
		System.out.println("the gross salary is:"+gross_salary);
		input.close();
	}

}

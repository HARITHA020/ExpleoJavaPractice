package functionHandsOn;

import java.util.Scanner;

public class Hands_on_3_hSum1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int salary=input.nextInt();
		double Rating=input.nextDouble();
		float increment=0;
	    int newSalary=0;
		if(salary>0 && Rating >1 && Rating<10) {
		   if(Rating>1 && Rating<=4) {
		   	  increment=salary*10/100;
		   	  newSalary=(int) (salary+increment);
		   	  
		   }
		   else if(Rating>4.1 && Rating <=7) {
		    	increment=salary*25/100;
		    	newSalary=(int) (salary+increment);
		   }
		   else if(Rating>7.1 && Rating <=10) {
			   increment=salary*30/100;
			   newSalary=(int) (salary+increment);
		   }
		}
		else {
			System.out.println("Invalid input");
		}
		System.out.println("the new incremental salary is:"+newSalary);
		
	}

}

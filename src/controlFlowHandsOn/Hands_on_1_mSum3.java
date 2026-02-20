package controlFlowHandsOn;
import java.util.*;
public class Hands_on_1_mSum3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int pages=input.nextInt();
		int rate=0;
		rate=pages*3;
		int copy=input.nextInt();
		int print_rate=0;
		if(copy == 1){
		    print_rate = pages * 1;  
		} else {
		    print_rate = pages * 1;                  
		    print_rate += pages * (copy - 1) * 3;    
		}
		int bill=rate+print_rate;
		System.out.println("Bill of work done: "+bill);
		
	}

}

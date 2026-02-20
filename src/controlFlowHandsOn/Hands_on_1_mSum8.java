package controlFlowHandsOn;
import java.util.*;
public class Hands_on_1_mSum8 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		int strlen=str.length();
		int c=0,d=0,s=0;
		for(int i=0;i<strlen;i++) {
			char st=str.charAt(i);
			if(st >='a'&& st <='z' || st>='A' && st<='Z') {
				c++;
			}
			else if(st >='0'&& st <='9') {
				d++;
			}
			else {
				s++;
			}
		}
		System.out.println("the letter count is:"+c);
		System.out.println("the digit count is:"+d);
		System.out.println("the Symbol count is:"+s);
		input.close();
	}
}

package controlFlowHandsOn;
import java.util.*;
public class Hands_on_1_sum3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		char cha=input.next().charAt(0);
		char ch=Character.toLowerCase(cha);
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("it is vowel");
			break;
		default:
			if(ch>='a'&& ch<='z' ) {
				System.out.println("constant");
			}
			else  {
				System.out.println("symbols");
			}
	    }
		input.close();
	}
	
}

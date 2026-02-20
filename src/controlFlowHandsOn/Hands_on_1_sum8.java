package controlFlowHandsOn;
import java.util.*;
public class Hands_on_1_sum8 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		char ch=input.next().charAt(0);
		char cha=Character.toLowerCase(ch);
		if(cha>='a' && cha<='z') {
			System.out.println("it is Alphabet");
		}
		else if(cha>='0'&&cha<='9') {
			System.out.println("It is number");
		}
		else {
			System.out.println("it is Special character");
		}
		input.close();
	}
}

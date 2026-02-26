package arrayhandsOn;

import java.util.Scanner;

public class Hands_on_2hSum1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n= input.nextInt();
		int sum=0;
		for(int i=0;i<n;i++) {
			int num=input.nextInt();
			sum+=num;
		}
		
		if(sum%n==0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		input.close();

	}

}

package arrayhandsOn;

import java.util.Scanner;

public class Hands_on_2_hSum2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] arun=new int[10];
		int[] naveen=new int[10];
		int aruncount=0,naveencount=0;
		for(int i=0;i<10;i++) {
			System.out.println((i+1)+" Round:");
			arun[i]=input.nextInt();
			naveen[i]=input.nextInt();
			if(arun[i]>naveen[i]) {
				aruncount++;
			}
			else if(naveen[i]>arun[i]) {
				naveencount++;
			}
		}
		
		if(aruncount>naveencount) {
			System.out.println("Arun Wins!!! ");
		}
		else {
			System.out.println("Naveen Wins!!! ");
		}

	}

}

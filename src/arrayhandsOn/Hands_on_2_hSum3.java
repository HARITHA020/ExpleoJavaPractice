package arrayhandsOn;

import java.util.Scanner;

public class Hands_on_2_hSum3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int[] arr=new int[n];
		int c=0;
		for(int i=0;i<n;i++) {
			int val=input.nextInt();
			if(val<0) {
				break;
			}
			arr[c++]=val;
		}

		for(int i=0;i<c;i++) {
			if(arr[i] % 7==0 && arr[i]%8==0) {
				arr[i]=-6;
			}
			else if(arr[i]%7==0) {
				arr[i]=-2;
			}
			else if(arr[i]%8==0) {
				arr[i]=-9;
			}
			else {
				arr[i]=arr[i];
			}
		}
		System.out.println("the output is:");
		for(int i=0;i<c;i++) {
			System.out.println(arr[i]);
		}
	}

}

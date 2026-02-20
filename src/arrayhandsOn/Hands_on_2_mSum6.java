package arrayhandsOn;

import java.util.Scanner;

public class Hands_on_2_mSum6 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=input.nextInt();
		}
		int key=input.nextInt();
		int c=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==key) {
				c++;
			}
		}
		if(c>0) {
			System.out.println("the key element "+key+" is present in array and its count is:"+c);
		}
		else {
			System.out.println("the key element is not present in the array");
		}
		input.close();
	}

}

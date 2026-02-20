package arrayhandsOn;

import java.util.Arrays;
import java.util.Scanner;

public class Hands_on_2_mSum4 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	    int n=input.nextInt();
	    int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=input.nextInt();
		}
		Arrays.sort(arr);
		int[] unique=new int[n];
		int count=0;
		for(int i=0;i<n-1;i++) {
			if(arr[i]!=arr[i+1]) {                        
				unique[count++]=arr[i];  
			}
		}
		System.out.println("the unique elements are:");
		for(int i=0;i<count;i++) {
			System.out.println(unique[i]);
		}
		input.close();

	}

}

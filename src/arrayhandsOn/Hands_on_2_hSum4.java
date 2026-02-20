package arrayhandsOn;

import java.util.Arrays;
import java.util.Scanner;

public class Hands_on_2_hSum4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the size of arr:");
		int n1=input.nextInt();
		System.out.println("enter the size of arr1:");
		int n2=input.nextInt();
		System.out.println("enter the size of arr2:");
		int n3=input.nextInt();
		int arr1[]=new int[n1];
		int arr2[]=new int[n2];
		int arr3[]=new int[n3];
		for(int i=0;i<n1;i++) {
			arr1[i]=input.nextInt();
		}
		for(int i=0;i<n2;i++) {
			arr2[i]=input.nextInt();
		}
		for(int i=0;i<n3;i++) {
			arr3[i]=input.nextInt();
		}
		int merge[][] = new int[3][];
		merge[0] = arr1;   
		merge[1] = arr2;  
		merge[2] = arr3;
		System.out.println("Merge array is:");
		for (int i = 0; i < merge.length; i++) {
		    for (int j = 0; j < merge[i].length; j++) {
		        System.out.print(merge[i][j] + " ");
		    
		}
		
	}
		

}

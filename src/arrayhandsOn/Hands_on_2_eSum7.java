package arrayhandsOn;
import java.util.*;
public class Hands_on_2_eSum7 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the size of arr:");
		int n1=input.nextInt();
		System.out.println("enter the size of arr1:");
		int n2=input.nextInt();
		int arr[]=new int[n1];
		int arr1[]=new int[n2];
		for(int i=0;i<n1;i++) {
			arr[i]=input.nextInt();
		}
		for(int i=0;i<n2;i++) {
			arr1[i]=input.nextInt();
		}
		int arr2[][] = new int[2][];
		arr2[0] = arr;   
		arr2[1] = arr1;  
		System.out.println("Merge array is:");
		for (int i = 0; i < arr2.length; i++) {
		    for (int j = 0; j < arr2[i].length; j++) {
		        System.out.print(arr2[i][j] + " ");
		    }
		    System.out.println();
		}
		input.close();
	}

}

package functionHandsOn;
import java.util.*;
public class Hands_on_3_eSum1 {
	public static void  calculateSum(int arr[]) {
		int evensum=0,oddsum=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evensum+=arr[i];
			}
			else {
				oddsum+=arr[i];
			}
		}
		
		System.out.println("the sum of even is:"+evensum);
		System.out.println("the sum of odd is:"+oddsum);
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int n=input.nextInt();
		
		int arr[]=new int[n];
		System.out.println("enter the element:");
		for(int i=0;i<n;i++) {
			arr[i]=input.nextInt();
		}
		
		calculateSum(arr);
		input.close();
	}

}

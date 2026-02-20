package arrayhandsOn;
import java.util.*;
public class Hands_on_2_mSum1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=input.nextInt();
		}
		int key=input.nextInt();
		int found=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==key) {
				found=1;
				break;
			}
		}
		if(found==1) {
			System.out.println("the key element is present in the array");
		}
		else {
			System.out.println("the key element is not present in the array");
		}
		input.close();
	}

}

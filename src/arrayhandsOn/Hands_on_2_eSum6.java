package arrayhandsOn;
import java.util.*;
public class Hands_on_2_eSum6 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=input.nextInt();
		}
		Arrays.sort(arr);
		int[] duplicate=new int[n];
		int count=0;
		
		for(int i=0;i<n-1;i++) {
			if(arr[i]==arr[i+1]) {                         // before find the duplicate you need to sort the array because when you compare 
				duplicate[count++]=arr[i];                 // the adjacent matrix it used sorted or we can use nested "for" which is suitable 
			}                                              //for both sorted and unsorted
		}
		System.out.println("the duplicate elements are:");
		for(int i=0;i<count;i++) {
			System.out.println(duplicate[i]);
		}
		input.close();
	}

}

package arrayhandsOn;
import java.util.*;
public class Hands_on_2_eSum4 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n= input.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=input.nextInt();
		}
		for(int i=0;i<n;i++) {
			 int count = 1;
			 if(arr[i]==-1) {
				 continue;
			 }
	          for (int j = i+1; j < n; j++) {
	               if (arr[i] == arr[j]) {
	                    count++;
	                    arr[j]=-1;
	                }
	            }
	            System.out.println(arr[i] + " occurs " + count + " times");
		}
		input.close();

	}
}

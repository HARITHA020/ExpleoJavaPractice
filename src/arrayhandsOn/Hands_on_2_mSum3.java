package arrayhandsOn;
import java.util.*;
public class Hands_on_2_mSum3 {
	public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
		    int n=input.nextInt();
		    int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=input.nextInt();
			}
			Arrays.sort(arr);
			int[] duplicate=new int[n];
			int count=0,notunique=0,unique=0;
			for(int i=0;i<n-1;i++) {
				if(arr[i]==arr[i+1]) {                        
					duplicate[count++]=arr[i];  
					notunique++;
				}
				else {
					unique++;
				}
			}
			System.out.println("the unique element count:"+unique);
			System.out.println("the not unique element count:"+notunique);
			input.close();
			

	}

}

package arrayhandsOn;
public class Hands_on_2_eSum1 {
	public static void main(String[] args) {
		int[] arr1=new int[1];
		int[] arr2=new int[1];
		//int even=0,odd=0;
		int evenSum = 0, oddSum = 0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				//arr1[even++]=i;
				evenSum += i;
			}
			else {
				//arr2[odd++]=i;
				oddSum+=i;
			}
		}
		/*System.out.println("even value");
		for(int i=0;i<arr1.length;i++) {
			System.out.println("the element are:"+arr1[i]);
		}
		System.out.println("Sum of even numbers: " + evenSum);
		System.out.println("odd value");
		for(int i=0;i<arr2.length;i++) {
			System.out.println("the element are:"+arr2[i]);
		}
		 System.out.println("Sum of even numbers: " + oddSum);
		 */
		 arr1[0]=evenSum;
		 arr2[0]=oddSum;
		 System.out.println("the even sum is:"+arr1[0]);
		 System.out.println("the odd sum is:"+arr2[0]);
		
	}

}

package functionHandsOn;

public class Hands_on_3_mSum1 {
	public static int oddSum(int start, int end) {
		int evensum=0;
		for(int i=start;i<=end;i++) {
			if(i%2==0) {
				evensum+=i;
			}
		}
		return evensum;
	}

	public static int evenSum(int start, int end) {
		int oddsum=0;
		for(int i=start;i<=end;i++) {
			if(i%2!=0) {
				oddsum+=i;
			}
		}
		return oddsum;
	}
	public static void main(String[] args) {
		int EvenResult=evenSum(1,1000);
		int OddResult=oddSum(1,1000);
		int difference=OddResult-EvenResult;
		
		System.out.println("Sum of even number is:"+EvenResult);
		System.out.println("Sum of odd number is:"+OddResult);
		System.out.println("the difference between the even and odd is:"+difference);
		
	}
}

package functionHandsOn;
public class Hands_on_3_eSum2 {
	public static boolean calculatePrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println("the prime numbers are:");
		for(int i=1;i<=100;i++) {
			if(calculatePrime(i)) {
				System.out.println(i+" ");
			}
		}
	}

}

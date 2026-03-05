package handsOn5;

abstract class Payment{
	String transactionId;
	double amount;
	String customerName;
	String paymentStatus;
	
	Payment(String transactionId, double amount, String customerName){
		this.transactionId=transactionId;
		this.amount=amount;
		this.customerName=customerName;
	}
	
	public abstract boolean validatePayment();
	public abstract boolean processPayment();
}
public class Hands_on_5_Sum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

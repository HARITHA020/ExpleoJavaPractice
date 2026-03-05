package handsOn5;
import java.util.*;
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
	
	public void executeTransaction() {
		 if (validatePayment()) { 
			 if (processPayment()) { 
			     setPaymentStatus("Success"); 
			 } else { 
			     setPaymentStatus("Failed");
			 } 
	     } else { 
			 setPaymentStatus("Validation Failed");
		  } 
		generateReceipt();
	}
	
	public void generateReceipt() {
        System.out.println("------ PAYMENT RECEIPT ------");
        System.out.println("Transaction ID : " + transactionId);
        System.out.println("Customer Name  : " + customerName);
        System.out.println("Amount         : " + amount);
        System.out.println("Status         : " + paymentStatus);
        System.out.println("-----------------------------");
    }
	
	
	
	public String getTransaction() {
		return transactionId;
	}
	
	public double getAmount() {
		return amount;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String Status) {
		paymentStatus =Status;
	}
}

class creditCardPayment extends Payment{
	String cardNumber;
	String cvv;
	String expiryDate;
	
	creditCardPayment(String transactionId, double amount,String customerName, String cardNumber, String cvv,String expiryDate){
		super(transactionId,amount,customerName);
		this.cardNumber=cardNumber;
		this.cvv=cvv;
		this.expiryDate=expiryDate;
	}

	@Override
	public boolean validatePayment() {

	    if (cardNumber == null || cardNumber.length() != 16)
	        return false;

	    if (cvv == null || cvv.length() != 3)
	        return false;

	    if (expiryDate == null || !expiryDate.matches("\\d{2}/\\d{2}"))
	        return false;

	    String[] parts = expiryDate.split("/");
	    int expMonth = Integer.parseInt(parts[0]);
	    int expYear = Integer.parseInt(parts[1]);

	    int expValue = expYear * 100 + expMonth;

	    Calendar now = Calendar.getInstance();
	    int currValue = (now.get(Calendar.YEAR) % 100) * 100 + (now.get(Calendar.MONTH) + 1);

	    if (expValue < currValue)
	        return false;

	    return true;
	}
	@Override
	public boolean processPayment() {
		 return true;
	}
}

class UPIPayment extends Payment{
	String upiId;
	String upiPin;
	
	UPIPayment(String transactionId, double amount, 
			String customerName, String upiId, String upiPin) {
		super(transactionId,amount,customerName);
		this.upiId=upiId;
		this.upiPin=upiPin;
	}

	@Override
	public boolean validatePayment() {
		if (upiId == null || !upiId.contains("@")) {
		   return false;
		}
		
		String[] parts = upiId.split("@");
	    if (parts.length != 2 || parts[0].isEmpty() || parts[1].isEmpty()) {
	        return false;
	    }
	    
	    if (upiPin == null || !upiPin.matches("\\d{4}|\\d{6}")) {
	        return false;
	    }
	    return true;
	}

	@Override
	public boolean processPayment() {
		return true;
	}
}

class NetBankingPayment extends Payment{
	String bankName;
	String accountNumber;
	String ifscCode;
	
	NetBankingPayment(String transactionId, double amount, 
			String customerName, String bankName, String 
			accountNumber, String ifscCode){
		super(transactionId,amount,customerName);
		this.bankName=bankName;
		this.accountNumber=accountNumber;
		this.ifscCode=ifscCode;
	}

	@Override
	public boolean validatePayment() {
		if(accountNumber.length()!=16) {
			return false;
		}
		 if (ifscCode == null || !ifscCode.matches("[A-Z]{4}0\\d{6}")) {
		        return false;
		 }
		return true;
	}

	@Override
	public boolean processPayment() {
		return true;
	}
	
	
	
}
public class Hands_on_5_Sum2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Payment pay = null;

		System.out.println("Select Payment Method");
		System.out.println("1. Credit Card");
		System.out.println("2. UPI");
		System.out.println("3. Net Banking");

		int choice = sc.nextInt();
		sc.nextLine(); 

		System.out.print("Enter Transaction ID: ");
		String transactionId = sc.nextLine();

		System.out.print("Enter Customer Name: ");
		String customerName = sc.nextLine();

		System.out.print("Enter Amount: ");
		double amount = sc.nextDouble();
		sc.nextLine();

		switch(choice) {

		case 1:
			System.out.print("Enter Card Number: ");
			String cardNumber = sc.nextLine();

			System.out.print("Enter CVV: ");
			String cvv = sc.nextLine();

			System.out.print("Enter Expiry Date (MM/YY): ");
			String expiryDate = sc.nextLine();

			pay = new creditCardPayment(transactionId, amount, customerName, cardNumber, cvv, expiryDate);
			break;

		case 2:
			System.out.print("Enter UPI ID: ");
			String upiId = sc.nextLine();

			System.out.print("Enter UPI PIN: ");
			String upiPin = sc.nextLine();

			pay = new UPIPayment(transactionId, amount, customerName, upiId, upiPin);
			break;

		case 3:
			System.out.print("Enter Bank Name: ");
			String bankName = sc.nextLine();

			System.out.print("Enter Account Number: ");
			String accountNumber = sc.nextLine();

			System.out.print("Enter IFSC Code: ");
			String ifsc = sc.nextLine();

			pay = new NetBankingPayment(transactionId, amount, customerName, bankName, accountNumber, ifsc);
			break;

		default:
			System.out.println("Invalid Choice");
			return;
		}

		pay.executeTransaction();
	}
}
package handsOn4;
class Account{
	private String id;
	private String name;
	private int balance;
	
	Account(String id, String name){
		this.id=id;
		this.name=name;
		balance=0;
	}
	
	Account(String id, String name, int balance){
		this.id=id;
		this.name=name;
		this.balance=balance;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	public int credit(int amount) {
		balance=amount+balance;
		return balance;
	}
	
	public int debit(int amount) {
		if(amount>balance) {
			System.out.println("Amount Exceeded balance");
		}
		else {
			balance=balance-amount;
		}
		return balance;
	}
	
	public int transferTo(Account another, int amount) {
        if (amount > balance) {
            System.out.println("Amount exceeded balance");
        } else {
            balance = balance - amount;
            another.balance = another.balance + amount;
        }
        return balance;
    }
	
	public String toString() {
        return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
}

public class Hands_on_4_Sum1 {

	public static void main(String[] args) {
		Account acc1 = new Account("1001", "sumi");
	    Account acc2 = new Account("1002", "ragi", 500);

	    acc1.credit(1000);    
	    acc1.debit(200);      
	    acc1.transferTo(acc2, 300);  

	    System.out.println(acc1);
	    System.out.println(acc2);
		

	}

}

package masai.assignment.java;

public class Account {
	private int balance;
	void statement() {
		System.out.println("OK");
	}
	public void setBalance(int balance) {
		if(balance >= 0) {
			this.balance = balance;
		}
	}
	public int getBalance() {
		return balance;
	}
	public void creditedAmount(int amount) {
		this.balance = balance + amount;
	}
	public void debitedAmount(int amount) {
		if(balance - amount >= 0 ) {
			this.balance = balance - amount;
		}
	}
}

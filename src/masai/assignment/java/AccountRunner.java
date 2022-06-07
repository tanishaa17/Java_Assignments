package masai.assignment.java;

public class AccountRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account debit = new Account(); 
		Account credit = new Account(); 
		
		debit.setBalance(0);
		credit.setBalance(0);
		
		System.out.println("Debited Amount : " + debit.getBalance());
		System.out.println("Credited Amount : " + credit.getBalance());
		
		credit.creditedAmount(2600);
		debit.debitedAmount(2300);
		
		System.out.println("Credited Amount : " + credit.getBalance());
		System.out.println("Debited Amount : " + debit.getBalance());
		
		}

}

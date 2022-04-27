package lab6;

public class SavingsAccount extends BankAccount {

	
	
	
	public SavingsAccount(SavingsAccount acc, double intitalBal)
	{
		super(acc, intitalBal);
		savingsNumber = this.savingsNumber + 1;
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	private double rate = 0.025;
	private int savingsNumber = 0;
	private String accountNumber;
	public SavingsAccount(String name, double initialAmount)
	{
		super(name,initialAmount);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	public void postInterest ()
	{
		double interestAmount = super.getBalance() * rate;
		deposit(interestAmount);
	}
	public String getAccountNumber()
	{
		return accountNumber;
	}

	
}

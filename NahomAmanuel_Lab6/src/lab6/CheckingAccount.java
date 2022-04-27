package lab6;

public class CheckingAccount extends BankAccount {

	private final static double FEE = 0.15;
	public CheckingAccount(String name, double initialAmount)
	{
		super(name, initialAmount);
		String AccountNum = getAccountNumber() + "-10";
		setAccountNumber(AccountNum);
		
	}
	public boolean withdraw (double widraw)
	{
		double amountWithdraw = widraw + FEE;
		return super.withdraw(amountWithdraw);
		
	}

}

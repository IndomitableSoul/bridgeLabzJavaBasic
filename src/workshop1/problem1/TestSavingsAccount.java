package workshop1.problem1;

public class TestSavingsAccount {
	public static void main(String[] args) {
		SavingAccount saver1 = new SavingAccount(2000);
		SavingAccount saver2 = new SavingAccount(3000);
		SavingAccount.modifyInterestRate(4);
		System.out.println(saver1.calculateMonthlyInterest());
		System.out.println(saver2.calculateMonthlyInterest());
	
		SavingAccount.modifyInterestRate(5);
		System.out.println(saver1.calculateMonthlyInterest());
		System.out.println(saver2.calculateMonthlyInterest());
	}
}

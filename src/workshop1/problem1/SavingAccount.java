package workshop1.problem1;

public class SavingAccount {
		static int annualInterestRate ;
		private int savingsBalance;
		
		
		public SavingAccount(int savingsBalance) {
			super();
			this.savingsBalance = savingsBalance;
		}

		public int calculateMonthlyInterest() {
			int monthlyInterest = savingsBalance*annualInterestRate/12;
			savingsBalance = savingsBalance+monthlyInterest;
			return savingsBalance;
		}
		
		public static void modifyInterestRate(int annualInterestRate) {
			SavingAccount.annualInterestRate = annualInterestRate; 
		}
}

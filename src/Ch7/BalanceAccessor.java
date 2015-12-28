package Ch7;

import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BalanceAccessor
{
	public static void main(String[] args)
	{
		BankAccount myBankAccount = new BankAccount();
		try
		{
			Field balanceField = BankAccount.class.getField("balance");
			//read it
			int myBalance = balanceField.getInt(myBankAccount);
			//change it
			balanceField.setInt(myBankAccount, 42);
		}
		catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException ex)
		{
			Logger.getLogger(BalanceAccessor.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}

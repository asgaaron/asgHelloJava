package Ch8;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionsAndGenerics
{
	public static void main(String[] args)
	{
		class ExceptionTester<T extends Throwable>
		{
			public void test(T exception) throws T
			{
				throw exception;
			}
		}

		ExceptionTester<ClassNotFoundException> e = new ExceptionTester<>();

		try
		{
			e.test(new ClassNotFoundException());
		}
		catch (Throwable ex)
		{
			Logger.getLogger(ExceptionsAndGenerics.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}

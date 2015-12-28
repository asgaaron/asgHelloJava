// run with <java.lang.System currentTimeMillis>
package Ch7;

import java.lang.reflect.*;
import java.util.Date;

public class Invoke
{
	public static void main(String[] args)
	{
		try
		{
			Class clas = Class.forName(args[0]);
			Method method = clas.getMethod(args[1]);	//named method, no arguments
			Object ret = method.invoke(null);			//invoke a static method
			System.out.println(
				"Invoked static method: " + args[1]
				+ " of class: " + args[0]
				+ " with no args\nResults: " + ret);

			//uses reflection to access appropriate Date constructor
			Constructor<Date> cons = Date.class.getConstructor(String.class);
			Date date = cons.newInstance("Dec 17, 1993");
			System.out.println(date);
		}
		catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e)
		{
			System.out.println("Method threw an: " + e.getMessage());
		}
	}
}

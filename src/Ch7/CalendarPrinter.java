package Ch7;

import java.lang.reflect.Method;
import java.util.Calendar;

public class CalendarPrinter
{
	public static void main(String[] args)
	{
		for (Method method : Calendar.class.getMethods())
			System.out.println(method);
	}
}

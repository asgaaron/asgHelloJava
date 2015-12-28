package Ch7;

interface Typewriter
{
	void typeline(String s);
//	...
}

class Printer implements Typewriter
{

	@Override
	public void typeline(String s)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

}

/**
 * This is an application loading a class implementation (Printer, which implements the Typewriter interface) knowing
 * only its name. Imagine the name was entered by the user or looked up from a config file. This kind of class loading
 * is the basis for many kinds of configurable systems in Java.
 *
 * @author agardner
 */
class MyApplication
{
	String outputDeviceName = "Printer";


	{
		try
		{
			Class newClass = Class.forName(outputDeviceName);
			Typewriter device = (Typewriter) newClass.newInstance();
//	...
			device.typeline("Hello...");
		}
		catch (ClassNotFoundException | InstantiationException | IllegalAccessException e)
		{
		}
	}
}

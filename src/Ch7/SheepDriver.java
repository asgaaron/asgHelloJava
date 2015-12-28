package Ch7;

public class SheepDriver
{
	public static void main(String args[])
	{
		Sheep one = new Sheep();
		Sheep anotherOne = one.clone();

		if (one.equals(anotherOne))
			System.out.println("They are equivalent,");
		if (!(one == anotherOne))
			System.out.println("but two seperate objects!");
	}

	private void classFinder()
	{
		String myString = "Foo!";
		Class stringClass = myString.getClass();

		Class stringClass1 = String.class;

		String s = "Boofa!";
		Class stringClass2 = s.getClass();
		System.out.println(stringClass.getName());		//"java.lang.String"
		try
		{
			String s2 = (String) stringClass.newInstance();
		}
		catch (InstantiationException e)
		{
		}
		catch (IllegalAccessException e)
		{
		}

		Class<String> stringClass3 = String.class;
		try
		{
			String s3 = stringClass3.newInstance();		//no cast necessary
		}
		catch (InstantiationException | IllegalAccessException e)	//multicatch
		{
		}

		try
		{
			Class sneakersClass = Class.forName("Sneakers");
		}
		catch (ClassNotFoundException e)
		{
		}
	}
}

package Ch5;

//example of using a static variable in an overloaded constructor
public class Car
{
	private static int default_doors = 4;

	/**
	 * @return the default_doors
	 */
	public static int getDefault_doors()
	{
		return default_doors;
	}

	/**
	 * @param aDefault_doors the default_doors to set
	 */
	public void setDefault_doors(int aDefault_doors)
	{
		default_doors = aDefault_doors;
	}

	Car(String m, int doors)
	{

	}

	Car(String m)
	{
		this(m, getDefault_doors());
	}

}

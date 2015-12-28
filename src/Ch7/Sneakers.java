package Ch7;

public class Sneakers extends Shoes
{
	/**
	 * If we specified public boolean equals(Sneakers arg) ... in the Sneakers class, we'd overload the equals() method
	 * instead of overriding it. If the other object happens to be assigned to a non-sneakers variable, the method
	 * signature won't match. The result: superclass Shoe's implementation of equals() is called, which may or may not
	 * be what you intended.
	 *
	 * @param arg
	 * @return
	 */
	@Override
	public boolean equals(Object arg)
	{
		if ((arg != null) && (arg instanceof Sneakers))
		{
			//compare arg with this ovject to check equivalence
			// If comparison is okay...
			return true;
		}
		return false;
	}
}

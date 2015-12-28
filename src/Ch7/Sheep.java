package Ch7;

import java.util.HashMap;

public class Sheep implements Cloneable
{
	HashMap flock = new HashMap();

	@Override
	public Sheep clone()
	{
		try
		{
			return (Sheep) super.clone();
		}
		catch (CloneNotSupportedException e)
		{
			throw new Error("This should never happen because we implement Cloneable!");
		}
	}

	@Override
	public boolean equals(Object arg)
	{
		if ((arg != null) && (arg instanceof Sheep))
		{
			//compare arg with this ovject to check equivalence
			// If comparison is okay...
			return true;
		}
		return false;
	}
}

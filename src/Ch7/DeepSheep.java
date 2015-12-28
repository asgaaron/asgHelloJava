package Ch7;

import java.util.HashMap;

public class DeepSheep implements Cloneable
{
	HashMap flock = new HashMap();

	public DeepSheep clone() throws CloneNotSupportedException
	{
		try
		{
			DeepSheep copy = (DeepSheep) super.clone();
			copy.flock = (HashMap) super.clone();
			return copy;
		}
		catch (CloneNotSupportedException e)
		{
			throw new Error("This should never happen!");
		}
	}
}

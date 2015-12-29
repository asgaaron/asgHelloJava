package Ch8;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RawTypes
{
	void addFoo()
	{
		// Nongeneric java code using the raw type
		List list = new ArrayList();	// Assignment ok
		list.add("foo");				// Compiler warning on usage of raw type
	}
}

class Bounded<E extends Date>
{
	public void addElement(E element)
	{
	}
}

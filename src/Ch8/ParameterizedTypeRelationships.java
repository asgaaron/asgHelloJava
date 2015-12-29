package Ch8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class ParameterizedTypeRelationships
{
	void goodExample()
	{
		Collection<Date> cd;
		List<Date> ld = new ArrayList<Date>();
		cd = ld;	// Ok!
	}

//	/**
//	 * Showing there is no inheritance relationship among parameter types in generics.
//	 */
//	void badExample()
//	{
//		List<Object> lo;
//		List<Date> ld = new ArrayList<Date>();
//		lo = ld;	// Incompatible types
//	}
}

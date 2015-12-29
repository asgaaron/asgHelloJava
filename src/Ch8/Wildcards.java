package Ch8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * Wildcard instantiations of generic types can be read as their upper bound and written as their lower bound.
 *
 * @author agardner
 */
public class Wildcards
{
	{
		List<?> anyInstantiationOfList = new ArrayList<Date>();
		anyInstantiationOfList = new ArrayList<String>();

		/**
		 * an unbound wild card can be assigned a value with a more restrictive bound because it can hold any
		 * instantiation
		 */
		List<? extends Date> dateLists = null;
		List<?> anyLists;
		anyLists = dateLists;

		/**
		 * an unbounded wildcard instantiation is really an instantiation with the upper bound of Object
		 */
		List<? extends Date> dateLists1 = null;
		List<? extends Object> objectLists;
		objectLists = dateLists1;

		/**
		 * This effectively says that some List of Integer types can be treated as some Collection of Number types
		 * through the wildcard instantiation
		 */
		List<? extends Integer> intLists = null;
		Collection<? extends Number> numCollections;
		numCollections = intLists;
	}
}

package Ch8;

import java.util.Date;
import java.util.List;
import java.util.Map.Entry;

class GenericClass<T>
{

//	method using generic class parameter type
//	public void T cache(T entry)
//	{
//	}
}

class RegularClass
{
	//method using concrete generic type
	public List<Date> sortDates(List<Date> dates)
	{
		return null;
	}

	//method using wildcard generic type
	public List<?> reverse(List<?> dates)
	{
		return null;
	}

	<T extends Entry & Cacheable> T cache(T entry)
	{
		return null;
	}

	void run()
	{
		BlogEntry newBlogEntry = new BlogEntry();
		NewspaperEntry newNewspaperEntry = new NewspaperEntry();

		BlogEntry oldEntry = cache(newBlogEntry);
	}

	private static class BlogEntry extends Entry
	{
		public BlogEntry()
		{
		}

		@Override
		public Object getKey()
		{
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public Object getValue()
		{
			throw new UnsupportedOperationException("Not supported yet.");
		}

		@Override
		public Object setValue(Object value)
		{
			throw new UnsupportedOperationException("Not supported yet.");
		}
	}

	private static class NewspaperEntry
	{
		public NewspaperEntry()
		{
		}
	}
}

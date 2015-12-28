package Ch6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class EmployeeList
{
	private ArrayList<Employee> employees;

	public EmployeeList()
	{
		employees = new ArrayList<>();
	}

	public EmployeeList(List<Employee> e)
	{
		employees = (ArrayList) e;
	}

	public void addEmployee(Employee e)
	{
		employees.add(e);
	}

	public Employee getEmployee(Employee e)
	{
		throw new UnsupportedOperationException();
	}

	public Employee removeEmployee(Employee e)
	{
		throw new UnsupportedOperationException();
	}

	Iterator getIterator()
	{
		return new Iterator()
		{
			int element = 0;

			@Override
			public boolean hasNext()
			{
				return element < employees.size();
			}

			@Override
			public Object next()
			{
				if (hasNext())
					return employees.get(element++);
				else
					throw new NoSuchElementException();
			}

			@Override
			public void remove()
			{
				throw new UnsupportedOperationException();
			}

		};
	}

//	Not using Anonymouse inner classes
//	Iterator getIterator()
//	{
//		return new Iterator();
//	}
//
//	class Iterator implements java.util.Iterator
//	{
//		int element = 0;
//
//		@Override
//		public boolean hasNext()
//		{
//			return element < employees.size();
//		}
//
//		@Override
//		public Object next()
//		{
//			if (hasNext())
//				return employees.get(element++);
//			else
//				throw new NoSuchElementException();
//		}
//	}
}

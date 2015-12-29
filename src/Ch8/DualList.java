//package Ch8;
//
//import java.util.Collection;
//import java.util.Date;
//import java.util.Iterator;
//import java.util.List;
//import java.util.ListIterator;
//
///**
// * We can't have a class that implements two different generic List instantiations because they are really the same type
// * at runtime and there is no way to tell them apart
// *
// * @author agardner
// */
//public class DualList implements List<String>, List<Date>
//{
//
//	@Override
//	public int size()
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	@Override
//	public boolean isEmpty()
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	@Override
//	public boolean contains(Object o)
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	@Override
//	public Iterator<String> iterator()
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	@Override
//	public Object[] toArray()
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	@Override
//	public <T> T[] toArray(T[] a)
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	@Override
//	public boolean add(String e)
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	@Override
//	public boolean remove(Object o)
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	@Override
//	public boolean containsAll(Collection<?> c)
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	@Override
//	public boolean addAll(Collection<? extends String> c)
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	@Override
//	public boolean addAll(int index, Collection<? extends String> c)
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	@Override
//	public boolean removeAll(Collection<?> c)
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	@Override
//	public boolean retainAll(Collection<?> c)
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	@Override
//	public void clear()
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	@Override
//	public String get(int index)
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	@Override
//	public String set(int index, String element)
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	@Override
//	public void add(int index, String element)
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	@Override
//	public String remove(int index)
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	@Override
//	public int indexOf(Object o)
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	@Override
//	public int lastIndexOf(Object o)
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	@Override
//	public ListIterator<String> listIterator()
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	@Override
//	public ListIterator<String> listIterator(int index)
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//
//	@Override
//	public List<String> subList(int fromIndex, int toIndex)
//	{
//		throw new UnsupportedOperationException("Not supported yet.");
//	}
//}

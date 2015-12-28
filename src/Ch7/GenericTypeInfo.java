package Ch7;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;

public class GenericTypeInfo
{

	public static void main(String[] args)
	{
		TypeVariable[] tv = List.class.getTypeParameters();
		System.out.println(tv[0].getName()); //E

		class StringList extends ArrayList<String>
		{
		}

		Type type = StringList.class.getGenericSuperclass();
		System.out.println(type);

		ParameterizedType pt = (ParameterizedType) type;
		System.out.println(pt.getActualTypeArguments()[0]);
	}
}

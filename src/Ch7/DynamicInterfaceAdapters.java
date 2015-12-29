//package Ch7;
//
//import java.lang.reflect.*;
//
//public class DynamicInterfaceAdapters
//{
//	InvocationHandler handler = new InvocationHandler()
//	{
//
//		@Override
//		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
//		{
//			System.out.println(
//				"Method: " + method.getName() + "()"
//				+ " of interface: " + interfaceName
//				+ " invoked on proxy!");
//			return null;
//		}
//	};
//
//	Class clas = Class.forName(MyInterface);
//
//	MyInterface interfaceProxy = (MyInterface) Proxy.newProxyInstance(clas.getClassLoader(), new Class[]
//	{
//
//	class
//
//	}
//	 , handler
//
//);
//}

package Ch9;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer>
{

	@Override
	public Integer call() throws Exception
	{
		return 2 + 2;
	}

}

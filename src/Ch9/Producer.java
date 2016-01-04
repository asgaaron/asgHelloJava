package Ch9;

import java.util.*;

public class Producer implements Runnable
{
	static final int MAXQUEUE = 5;
	private final List messages = new ArrayList();

	@Override
	public void run()
	{
		while (true)
		{
			putMessage();
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
			}
		}
	}

	private synchronized void putMessage()
	{
		while (messages.size() >= MAXQUEUE)
			try
			{
				wait();
			}
			catch (InterruptedException e)
			{
			}
		messages.add(new java.util.Date().toString());
		notifyAll();
	}

	public synchronized String getMessage()
	{
		while (messages.isEmpty())
			try
			{
				notify();
				wait();
			}
			catch (InterruptedException e)
			{
			}
		String message = (String) messages.remove(0);
		notifyAll();
		return message;
	}

}

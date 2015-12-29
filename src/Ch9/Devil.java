package Ch9;

public class Devil extends Thread
{
	Devil()
	{
		setDaemon(true);
		start();
	}

	public void run()
	{
//		do evil things
	}
}

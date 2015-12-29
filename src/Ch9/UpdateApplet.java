package Ch9;

public class UpdateApplet extends java.applet.Applet implements Runnable
{
	Thread thread;
	boolean running;
	int updateInterval = 1000;

	@Override
	public void run()
	{
		while (running)
		{
			repaint();
			try
			{
				Thread.sleep(updateInterval);
			}
			catch (InterruptedException e)
			{
				System.out.println("Interrupted...");
				return;
			}
		}
	}

	public void start()
	{
		System.out.println("Starting...");
		if (!running) //bad approach
		{
			running = true;
			thread = new Thread(this);
			thread.start();
		}
	}

	public void stop()
	{
		System.out.println("Stopping...");
		thread.interrupt();
		running = false;
	}
}
